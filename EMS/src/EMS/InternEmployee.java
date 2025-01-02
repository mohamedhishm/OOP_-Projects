package EMS;
/*
position attributes :
1-position_title
* function :
* work
*/
public class InternEmployee extends Employee {
    private String universityName ;
    private  int internshipDuration;

    public InternEmployee(String name, int id, double salary, String nationality, String universityName,int internshipDuration) {
        super(name, id, salary, nationality);
        this.universityName = universityName;
        this.internshipDuration=internshipDuration;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getInternshipDuration() {
        return internshipDuration;
    }

    public void setInternshipDuration(int internshipDuration) {
        this.internshipDuration = internshipDuration;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working as an intern as ResearchEmployee for " + internshipDuration + " months at " + universityName);
        System.out.println("\n_____________________________________________________________________\n");
    }
    public void Details() {
        super.Details();
        System.out.println(getName()+" Currently studying at University: " + universityName + ", Internship Duration: " + internshipDuration + " months");

    }
}
