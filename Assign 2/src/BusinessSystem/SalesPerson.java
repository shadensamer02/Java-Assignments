package BusinessSystem;

// sales person inhert employee
public class SalesPerson extends employee {
    // extra fields
    private double commission;

    // constructor
    SalesPerson(int id, String name, double basesalary, double commission)
    {
        setid(id);
        setbasesalary(basesalary);
        setname(name);
        this.commission=commission;
        inccounter();
    }

    //override methode
    @Override
    public double calculateSalary() {
        return (getbasesalary() + commission);
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getid());
        System.out.println("Name: " + getname());
        System.out.println("Base Salary: " + getbasesalary());
        System.out.println("commission: " + commission);
        System.out.println("Salary: " + commission+getbasesalary());

    }

    //getters and setters
    public void setcommission( double commission)
    {
        this.commission=commission;
    }

    public double getcommission()
    {
        return commission;
    }
}
