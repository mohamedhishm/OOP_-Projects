package UMS;

class OfflineCourse extends Course {
    private String location;

    public OfflineCourse(String name, String id, double price, String location) {
        super(name, id, price);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

@Override
    public void printDetails() {
        System.out.println("Course Name: " + getName());
        System.out.println("Course ID: " + getId() + "                      |                 Price: " + getPrice() + "$\nLocation: " + location);
    }
}
