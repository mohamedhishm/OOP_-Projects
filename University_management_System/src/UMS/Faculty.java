package UMS;

class Faculty implements Printable {
    private String name;
    private String location;
    private String department;

    public Faculty(String name, String location, String department) {
        this.name = name;
        this.location = location;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void printDetails() {
        System.out.println("\nDetails of faculty : \n");
        System.out.println("Faculty Name: " + name);
        System.out.println("Location: " + location + "        |               Department: " + department);
    }
}
