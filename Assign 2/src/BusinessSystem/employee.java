package BusinessSystem;
//abstract class
public abstract class employee {
        //Fields
        private static int counter=0;
        private int id;
        private String name;
        private double baseSalary;

        // constructor
        employee(){
            id=0;
            name="no name";
            baseSalary =0.0;
        }
        employee(int id, String name, double baseSalary)
        {
            this.id=id;
            this.name=name;
            this.baseSalary=baseSalary;

        }

        //Getters and Setters
        public void setid( int id)
        {
            this.id=id;
        }
        public void setname( String name)
        {
            this.name=name;
        }
        public void setbasesalary( double baseSalary)
        {
            this.baseSalary=baseSalary;
        }
        public void inccounter()
        {
            counter++;
        }

        public int getid()
        {
            return id;
        }
        public String getname()
        {
            return name;
        }
        public double getbasesalary()
        {
            return baseSalary;
        }
        public int getCounter()
        {
            return counter;
        }

        //Abstract Method
        public abstract double calculateSalary();

        //Concrete Method
        public void displayInfo() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Base Salary: " + baseSalary);
        }

    }

