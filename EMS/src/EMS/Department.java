package EMS;
/*
* Department attributes :
1-position_title
* function :
* work
* */
public class Department extends Employee {
    private String departmentName;
    private String projectName;

    public Department(String name, int id, double salary, String nationality, String departmentName, String projectName) {
        super(name, id, salary, nationality);
        this.departmentName = departmentName;
        this.projectName=projectName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public  void work(){
        System.out.println(getName() + " is working in the " + departmentName + " department "+ "and working on  "+ projectName +" project ");
        System.out.println("\n_____________________________________________________________________\n");
    }
}
