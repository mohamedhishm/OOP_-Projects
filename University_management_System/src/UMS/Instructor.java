package UMS;

class Instructor {
    private String name;
    private String expertise;

    public Instructor(String name, String expertise) {
        this.name = name;
        this.expertise = expertise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public void Details() {
        System.out.println("Instructor: " + name + "   |           Expertise: " + expertise);
    }
}