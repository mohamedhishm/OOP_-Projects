package EMS;

public class LegalEmployee {
    private String name;
    private String legalArea;

    public LegalEmployee(String name ,String legalArea) {
       this.name=name;
        this.legalArea = legalArea;

    }

    public String getName() {
        return name;
    }

    public String getLegalArea() {
        return legalArea;
    }


    public void work() {
        System.out.println(name+ " is working in the legal department, specializing in " + legalArea + " law.\n");
    }
}
