package UMS;

class OnlineCourse extends Course {
    private String schedule;

    public OnlineCourse(String name, String id, double price, String schedule) {
        super(name, id, price);
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public void printDetails() {
        System.out.println("Course Name: " + getName());
        System.out.println("Course ID: " + getId() + "               |            Price: " + getPrice() + "$\nSchedule: " + schedule);
    }
}