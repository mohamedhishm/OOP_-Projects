package UMS;

class Student implements Printable {
    private int id;
    private String name;
    private String address;
    private String major;

    public Student(int id, String name, String address, String major) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void printDetails() {
        System.out.println("\nDetails of student : \n");
        System.out.println("Student Name: " + name + "                 ID: " + id+"\n");
        System.out.println("Address: " + address + "                 Major: " + major);
    }
}