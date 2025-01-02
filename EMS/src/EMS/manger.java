package EMS;

// ManagerEmployee is a subclass of Department
class ManagerEmployee extends Department {
    private int teamSize;

    public ManagerEmployee(String name, int id, double salary, String nationality, String departmentName, String projectName, int teamSize) {
        super(name, id, salary, nationality, departmentName, projectName);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void work() {
        System.out.println(getName() + " is managing a team of " + teamSize + " employees in the " + getDepartmentName() + " department.");
        System.out.println("\n_____________________________________________________________________\n");
    }


    public void Details() {
        super.Details();
        //  System.out.println(getName()+" is Managing Team Size: " + teamSize);

    }

    public void assignTask(String task) {
        System.out.println(getName() + " is assigning task: " + task + " to their team in the " + getDepartmentName() + " department.");
        System.out.println("\n_____________________________________________________________________\n");
    }
}

