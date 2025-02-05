import java.util.Scanner;
import java.util.UUID;

public class Emploeey extends Showroom implements details{
    String emploeeyName;
    String emploeeyDepartment;
    String emploeeyID;
    int emploeeyAge;

    @Override
    public void getdetails() {
        System.out.println("ID "+emploeeyID);
        System.out.println("Name "+ emploeeyName);
        System.out.println("Age "+emploeeyAge);
        System.out.println("Dpartment "+emploeeyDepartment);
        System.out.println("Showroom Name "+ showroomName);
    }

    @Override
    public void setdetails() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emploeeyID = String.valueOf(uuid);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("EMPLOYEE NAME: ");
        emploeeyName = sc.nextLine();
        System.out.print(("EMPLOYEE AGE: "));
        emploeeyAge = sc.nextInt();
        sc.nextLine();
        System.out.print("EMPLOYEE DEPARTMENT: ");
        emploeeyDepartment = sc.nextLine();
        System.out.print("SHOWROOM NAME: ");
        showroomName = sc.nextLine();
    }
}