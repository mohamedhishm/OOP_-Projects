package EMS;

public class SalesEmployee extends Employee {
    public SalesEmployee(String name, long id, double salary, String nationality, String position) {
        super(name, (int) id, salary, nationality);
    }

    @Override
    public void work() {

    }
}
