import java.util.Scanner;

public class Showroom implements details{
    String showroomName;
    String showroomAddress;
    String managerName;
    int employee;
    int cars=0;
    Scanner scanner =new Scanner(System.in);

    @Override
    public void getdetails(){
        System.out.println("Showroom Name "+ showroomName);
        System.out.println("Showroom Address "+ showroomAddress);
        System.out.println("Manager Name "+managerName);
        System.out.println("Total Employees "+employee);
        System.out.println("Total Cars In Stoke "+cars);

    }

    @Override
    public void setdetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        showroomName = sc.nextLine();
        System.out.print(("SHOWROOM ADDRESS: "));
        showroomAddress = sc.nextLine();
        System.out.print("MANAGER NAME: ");
        managerName = sc.nextLine();
        System.out.print("TOTAL NO OF EMPLOYEES: ");
        employee = sc.nextInt();
        System.out.print("TOTAL CARS IN STOCK: ");
        cars = sc.nextInt();

    }

}
