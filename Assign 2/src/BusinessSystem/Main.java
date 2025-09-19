package BusinessSystem;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.InputMismatchException;

//MAIN CLASS "BusinessSystem"
public class Main
{
    public static void main(String[] args)
    {
            LinkedList<employee> MyEmployees = new LinkedList<>(); //liked list to carry the employees
            Scanner scanner = new Scanner(System.in); //opening the scanner
            while (true) //while the user didn't choose to exit this loop will operate
            {
                int choice = 0;
                boolean flag =true;
                while (flag) { //while the user didn't enter a valid number this loop will operate
                    System.out.println("please choose one option");
                    System.out.println("1) Add new employee");
                    System.out.println("2) View all employees");
                    System.out.println("3) View total payroll");
                    System.out.println("4) View total number of employees");
                    System.out.println("5) exit");
                    System.out.print("your choice is : ");
                    try { //incase the user didn't enter an integer input
                        choice = scanner.nextInt();
                        //break;
                    }
                    catch (InputMismatchException e) { //catch the error
                        System.out.println("Error: Can't enter a text please choose a number from the list");
                        scanner.nextLine();

                    }
                    if(choice>0 && choice<=5) //if the input is in the range
                    {
                        flag=false; //stop the loop
                    }
                    else { //if not will remain in the same loop tell he enters a valid number
                        System.out.println("please choose from 1 to 5 only");
                        System.out.println("--------------------------------------------");
                    }
                }
                System.out.println("--------------------------------------------");
                switch (choice) //switch to all the options in the application
                {
                    case (1): //adding new employee
                        int employeetype=0;
                        boolean flage2=true;
                        while (flage2) //while the user didn't enter a valid number this loop will operate
                        {
                            //choosing the type of the employee
                            System.out.println("please choose the type of this employee");
                            System.out.println("1) manager");
                            System.out.println("2) sales person");
                            System.out.println("3) intern");
                            System.out.print("please enter a number from this list (1-2-3) : ");
                            try{  //incase the user didn't enter an integer input
                                employeetype = scanner.nextInt();
                                //break;
                            } catch (InputMismatchException e){ //catch the erroe
                                System.out.println("Error: Can't enter a text please choose a number from the list");
                                scanner.nextLine();
                            }

                            if(employeetype>0 && employeetype<=3)  //if the input is in the range
                            {
                                flage2=false; //stop the loop
                            }
                            else //if not will remain in the same loop tell he enters a valid number
                            {
                                System.out.println("please choose number between 1 and 3");
                                System.out.println("--------------------------------------------");
                            }
                        }
                        System.out.println("--------------------------------------------");
                        // taking employee data ID,NAME,BASE SALARY
                        System.out.print("please enter the name of the employee : ");
                        String employeename = scanner.next();
                        System.out.print("please enter the ID of the employee : ");
                        int employeeid = scanner.nextInt();
                        System.out.print("please enter the Base Salary of the employee : ");
                        double employeebasesalary = scanner.nextDouble();
                        //switch according to the employee type
                        switch (employeetype)
                        {
                            case (1): //manager
                                //taking the bouns of the manager
                                System.out.print("please enter the Bouns of the employee : ");
                                double employeebouns = scanner.nextDouble();
                                //creating the object
                                Manager manager = new Manager(employeeid, employeename, employeebasesalary, employeebouns);
                                // adding the manager to the employee linked list
                                MyEmployees.add(manager);
                                break;
                            case (2): // sales person
                                //taking the commission of the sales person
                                System.out.print("please enter the commission of the employee : ");
                                double employeecommission = scanner.nextDouble();
                                //creating the object
                                SalesPerson salesPerson = new SalesPerson(employeeid, employeename, employeebasesalary, employeecommission);
                                // adding the sales person to the linked list
                                MyEmployees.add(salesPerson);
                                break;
                            case (3): // intern
                                //creating the object
                                intern intern = new intern(employeeid, employeename, employeebasesalary);
                                // adding the intern to the linked list
                                MyEmployees.add(intern);
                        }
                        // the adding process is DONE !!
                        System.out.println("EMPLOYEE IS ADDED SUCCESSFULLY!");
                        System.out.println("--------------------------------------------");
                        break;
                    case (2): //view all employees
                        for (int i = 0; i < MyEmployees.size(); i++) //looping on the employee linked list
                        {
                            //getting employee dataة
                            //get the type of the employee
                            String type = MyEmployees.get(i).getClass().getSimpleName();
                            System.out.println("This employee is a/an : "+type);
                            MyEmployees.get(i).displayInfo();
                            System.out.println("--------------------------------------------");


                            // another method without using the method display info
                            /*int Employeeid = MyEmployees.get(i).getid();
                            String Employeename = MyEmployees.get(i).getname();
                            Double basesalary = MyEmployees.get(i).getbasesalary();
                            Double salary = MyEmployees.get(i).calculateSalary();
                            Double Extra = salary - basesalary;
                            //get the type of the employee
                            String type = MyEmployees.get(i).getClass().getSimpleName();
                            // switch according to the employee type
                            switch (type)
                            {
                                case ("Manager"):
                                    //printing employee data
                                    System.out.println("Manager ID : " + Employeeid);
                                    System.out.println("Manager name : " + Employeename);
                                    System.out.println("Manger base salary : " + basesalary);
                                    System.out.println("Manager bouns : " + Extra);
                                    System.out.println("Manager salary : " + salary);
                                    break;
                                case ("SalesPerson"):
                                    //printing employee data
                                    System.out.println("SalesPerson ID : " + Employeeid);
                                    System.out.println("SalesPerson name : " + Employeename);
                                    System.out.println("SalesPerson base salary : " + basesalary);
                                    System.out.println("SalesPerson commission : " + Extra);
                                    System.out.println("SalesPerson salary : " + salary);
                                    break;
                                case ("intern"):
                                    //printing employee data
                                    System.out.println("intern ID : " + Employeeid);
                                    System.out.println("intern name : " + Employeename);
                                    System.out.println("intern base salary : " + basesalary);
                                    System.out.println("intern salary : " + salary);
                                    break;
                            }*/
                        }

                        break;
                    case (3): //view total payroll
                        Double salary = 0.0; // set counter to zero
                        //looping on the employee linked list
                        for (int i = 0; i < MyEmployees.size(); i++)
                        {
                            //add the employee salary to the counter
                            salary += MyEmployees.get(i).calculateSalary();
                        }
                        System.out.print("The total payroll is : ");
                        System.out.println(salary);
                        System.out.println("--------------------------------------------");
                        break;
                    case (4): //view total number of employees

                        if(MyEmployees.size()>0){ //incase my list is not empty
                            System.out.print("Total number of employees are : ");
                            //get the counter field it is static over all objects
                            System.out.println(MyEmployees.get(0).getCounter());
                        }
                        else { // incase the list is still empty
                            System.out.println("You have no Employees yet you can add one from the main menu");
                        }
                        System.out.println("--------------------------------------------");
                        break;
                    case (5): //exit the program
                        System.out.println("SYSTEM IS CLOSING.......");
                        System.out.println("Thank you for using this application !");
                        scanner.close(); //closing the scanner
                        return;
                }
            }
    }
}


