package Student_Application;
/*
this class is responsible for saving students data (name,ID, grades)
calculating the average grade for the student
define if this student pass or fail
and printing this all information
 */
public class Student {
    // variables
    private static int countstudents=0;
    private String name;
    private int id;
    //int numberofsubjects;
    private  double[] grades = new double[3];

    //contructors
    public Student() {
        name="  ";
        id=0;
        //numberofsubjects=3;
        for (int i=0;i<grades.length;i++)
        {
            grades[i]=0;
        }
        countstudents++;

    }
    public Student(String sname, int sid,int subjects, double[] sgrades){
        name=sname;
        id=sid;
        //umberofsubjects=subjects;
        //double[] grades=new double[[numberofsubjects];
        for(int i=0; i<sgrades.length;i++)
        {
            grades[i]=sgrades[i];
        }
        countstudents++;
    }

    //setters

    public void setname(String sname)
    {
        name=sname;
    }
    public void setid (int sid)
    {
        id=sid;
    }
    public void setgrades (double[] sgrades)
    {
        for(int i =0; i<3;i++)
        {
            grades[i]=sgrades[i];
        }
    }

    //getters
    public String getname()
    {
        return (name);
    }
    public int getid ()
    {
        return (id);
    }
    public double[] getgrades ()
    {
        return (grades);
    }
    public static int getnumberofstudents ()
    {
        return (countstudents);
    }


    //methods
    //calculating the average grade for the student
    public double calculateAverage()
    {
        double average=0;
        for(int i=0; i<3; i++)
        {
            average+=grades[i];
            //System.out.println("avegare of turn " + (i+1) + " "+ average);
        }
        return (average/3);
    }
    // define if this student pass or fail
    public String  isPassed()
    {
        double avg=calculateAverage();
        if(avg>=50){
            return ("Pass");
        }
        else return ("Fail");
    }
    // printing all information about this student (name,ID,Average and result)
    public void displayInfo()
    {
        System.out.print("Nmae: ");
        System.out.println(getname());
        System.out.print("ID: ");
        System.out.println(getid());
        /*for(int i=0; i<grades.length;i++) {
            System.out.print(grades[i]);
        }*/
        System.out.print("Average: ");
        System.out.println(calculateAverage());
        System.out.print("Result: ");
        System.out.println(isPassed());
    }
}
