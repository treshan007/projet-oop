package list.grocery;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }

    public static void printInstruction() {
        System.out.println("\nPress");
        System.out.println("\t 0 - to print choice options.");
        System.out.println("\t 1 - to print the list of grocery items.");
        System.out.println("\t 2 - to add an item to the list.");
        System.out.println("\t 3 - to modify an item in the list.");
        System.out.println("\t 4 - to remove an item from the list.");
        System.out.println("\t 5 - to search for an item in the list.");
        System.out.println("\t 6 - to quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the replacement item: ");
        String modifiedItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1, modifiedItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNo  = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem)!=null) {
            System.out.println("Found " +searchItem+ " in the grocery list.");
        } else {
            System.out.println(searchItem+ " item not found in the grocery list.");
        }
    }
}
