package manage.life;

public class Donor {
    private String name;
    private int id;
    private int age;
    private String bloodGroup;
    private String lastDonated;
    private String bloodReport;
    private String address;
    private String phoneNumber;

    public Donor(String name, int id, int age, String bloodGroup, String lastDonated, String bloodReport, String address, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.lastDonated = lastDonated;
        this.bloodReport = bloodReport;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getLastDonated() {
        return lastDonated;
    }

    public void setLastDonated(String lastDonated) {
        this.lastDonated = lastDonated;
    }

    public String getBloodReport() {
        return bloodReport;
    }

    public void setBloodReport(String bloodReport) {
        this.bloodReport = bloodReport;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void DisplayDonor() {
        System.out.println("Donor Name : " + getName());
        System.out.println("ID : " + getId());
        System.out.println("Age : " + getAge());
        System.out.println("Blood Group : " + getBloodGroup());
        System.out.println("Last Donation : " + getLastDonated());
        System.out.println("Address : " + getAddress());
        System.out.println("Medical Checkup : " + getBloodReport());
        System.out.println("Phone Number : " + getPhoneNumber());
    }
}

