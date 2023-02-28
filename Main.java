import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner s1 = new Scanner(System.in);
            Scanner s2 = new Scanner(System.in)	;
            System.out.print("Enter number of Employees: ");
            int length = s1.nextInt();
            Salary[] so = new Salary[length];
            for (int x = 0; x< length; x++) {
            	System.out.print("Enter name: ");
            	String name = s2.nextLine();
            	System.out.print("Enter age: ");
            	int age = s1.nextInt();
            	System.out.print("Enter postion (1) Manager (2) Service Crew: ");
            	int position = s1.nextInt();
            	System.out.print("Enter hours worked: ");
            	double time = s1.nextDouble();
            	so [x] = new Salary(name, age, position, time);
            }
            for (int x = 0; x< length; x++) {
            	so [x].DisplayInfo();
            }
	}

}
