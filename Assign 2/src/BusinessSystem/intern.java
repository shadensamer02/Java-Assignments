package BusinessSystem;

// intern inhert employee
public class intern extends employee{

    // constructor
    intern (int id, String name, double basesalary)
    {
        setid(id);
        setname(name);
        setbasesalary(3000);
        inccounter();
    }

    //override methode
    @Override
    public void setbasesalary(double baseSalary) {
        super.setbasesalary(3000);
    }

    //override methode
    @Override
    public double calculateSalary() {
        return getbasesalary();
    }
}
