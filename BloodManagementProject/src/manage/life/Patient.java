package manage.life;

public class Patient {
    private String name;
    private int id;
    private int age;
    private String bloodGroup;
    private String address;
    private String disease;
    private String phoneNumber;

    public Patient(String name, int id, int age, String bloodGroup, String address, String disease, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.address = address;
        this.disease = disease;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void DisplayPatient() {
        System.out.println("Patient Name : " + getName());
        System.out.println("ID : " + getId());
        System.out.println("Age : " + getAge());
        System.out.println("Blood Group : " + getBloodGroup());
        System.out.println("Address : " + getAddress());
        System.out.println("Disease : " + getDisease());
        System.out.println("Contact : " + getPhoneNumber());
    }
}

