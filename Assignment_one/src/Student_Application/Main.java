package Student_Application;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student[] mystudents = new Student[3];
        for (int k=0 ; k<3 ; k++)
        {
            mystudents[k]=new Student();
        }

        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<3;i++)
        {
            System.out.print("Enter the name of student " + (i+1) + " : ");
            mystudents[i].setname(scanner.next());
            System.out.println();
            System.out.print("Enter ID : " );
            mystudents[i].setid(scanner.nextInt());
            System.out.println();
            double[] tempgrades = new double[3];
            for(int j =0 ; j<3;j++)
            {
                System.out.print("Enter the grade of subject number "+(j+1)+" : " );
                tempgrades[j]=scanner.nextDouble();
                System.out.println();
            }
            mystudents[i].setgrades(tempgrades);
            mystudents[i].displayInfo();
            System.out.println("---------------------------------");
        }
        scanner.close();

    }
}