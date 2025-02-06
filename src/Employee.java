import java.util.Scanner;
import java.util.UUID;

public class Employee extends Showroom implements details{
    String employeeName;
    String employeeDepartment;
    String employeeID;
    int employeeAge;

    @Override
    public void getdetails() {
        System.out.println("ID "+employeeID);
        System.out.println("Name "+ employeeName);
        System.out.println("Age "+employeeAge);
        System.out.println("Dpartment "+employeeDepartment);
        System.out.println("Showroom Name "+ showroomName);
    }

    @Override
    public void setdetails() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        employeeID = String.valueOf(uuid);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("EMPLOYEE NAME: ");
        employeeName = sc.nextLine();
        System.out.print(("EMPLOYEE AGE: "));
        employeeAge = sc.nextInt();
        sc.nextLine();
        System.out.print("EMPLOYEE DEPARTMENT: ");
        employeeDepartment = sc.nextLine();
        System.out.print("SHOWROOM NAME: ");
        showroomName = sc.nextLine();
    }
}