package BusinessSystem;


// manager inhert employee
public class Manager extends employee{

    // extra fields
    private double bonus;

    // constructor
    Manager(int id, String name, double basesalary, double bouns)
    {
        setid(id);
        setname(name);
        setbasesalary(basesalary);
        this.bonus=bouns;
        inccounter();
    }

    //override methode
    @Override
    public double calculateSalary() {
        return (getbasesalary() + bonus);
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getid());
        System.out.println("Name: " + getname());
        System.out.println("Base Salary: " + getbasesalary());
        System.out.println("bonus: " + bonus);
        System.out.println("Salary: " + bonus+getbasesalary());

    }

    //getters and setters
    public void setbouns( double bonus)
    {
        this.bonus=bonus;
    }

    public double getbonus()
    {
        return bonus;
    }
}
