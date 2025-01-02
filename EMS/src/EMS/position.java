package EMS;

public class position extends Employee {
    private static final long serialVersionUID = 1L; // Serializable version UID
    private String positionTitle;

    public position(String name, int id, double salary, String nationality, String positionTitle) {
        super(name, id, salary, nationality);
        this.positionTitle = positionTitle;
    }

    @Override
    public void work() {
        System.out.println(getName() + " works as " + positionTitle);
        System.out.println("\n_____________________________________________________________________\n");
    }
}
