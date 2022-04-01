package manage.life;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("{**********************************************WELCOME**********************************************}");
        System.out.println("[------------------------DIU Blood Management System - Section B, 58th Batch------------------------]");
        System.out.println("-----------------------------------Please enter your choice------------------------------------------");
        System.out.println("Press (1) to add Patient");
        System.out.println("Press (2) to add Donor");
        System.out.println("Press (3) for patient list");
        System.out.println("Press (4) for donor list");
        System.out.println("Press (0) to Exit");
        System.out.println("_____________________________________________________________________________________________________");
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patiental = new ArrayList<>();
        ArrayList<Donor> donoral = new ArrayList<>();
        int pressOne;
        do {
            System.out.print("Enter your choice: ");
            pressOne = sc.nextInt();
            if (pressOne == 1) {
                System.out.print("Enter the number of patients you want to add: ");
                int n = sc.nextInt();
                sc.nextLine();
                for (int i = 1; i <= n; i++) {
                    System.out.println("Enter details of Patient " + i);
                    System.out.print("Enter Patient Name: ");
                    String Tname = sc.nextLine();
                    System.out.print("Enter ID (Digits Only): ");
                    int Tid = sc.nextInt();
                    System.out.print("Enter Age (Digits Only): ");
                    int Tage = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Blood Group: ");
                    String Tbg = sc.nextLine();
                    System.out.println("Enter Address: ");
                    String Taddress = sc.nextLine();
                    System.out.print("Enter the name of the problem(Disease): ");
                    String Tdesies = sc.nextLine();
                    System.out.print("Enter Phone Number : ");
                    String Tphnumber = sc.nextLine();
                    System.out.println("______________________________________________________");
                    Patient rugirdol = new Patient(Tname, Tid, Tage, Tbg, Taddress, Tdesies, Tphnumber);
                    patiental.add(rugirdol);
                }
            }
            if (pressOne == 2) {
                System.out.print("Enter the number of donor you want to add: ");
                int n = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter details of Donor " + i);
                    System.out.print("Enter Donor Name: ");
                    String Tname = sc.nextLine();
                    System.out.print("Enter ID (Digits Only): ");
                    int Tid = sc.nextInt();
                    System.out.print("Enter Age (Digits Only): ");
                    int Tage = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Blood Group: ");
                    String Tbg = sc.nextLine();
                    System.out.print("Date of last donation: ");
                    String Tlastdonation = sc.nextLine();
                    System.out.println("Enter Address : ");
                    String Taddress = sc.nextLine();
                    System.out.print("Medical Checkup (Yes/No): ");
                    String Treport = sc.nextLine();
                    System.out.print("Enter Phone Number : ");
                    String Tphnumber = sc.nextLine();
                    sc.nextLine();
                    Donor roktodata = new Donor(Tname, Tid, Tage, Tbg, Tlastdonation, Taddress, Treport, Tphnumber);
                    donoral.add(roktodata);
                }
            }
            if (pressOne == 3) {
                for (Patient patient : patiental) {
                    System.out.println("Patient -->> ");
                    patient.DisplayPatient();
                }
            }
            if (pressOne == 4) {
                for (Donor donor : donoral) {
                    System.out.println("Donors -->> ");
                    donor.DisplayDonor();
                }
            }
        } while (pressOne != 0);
    }
}
