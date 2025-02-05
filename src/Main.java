import java.util.*;
import java.lang.*;
public class Main {

    static void mainMenu() {
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
    }

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            Showroom showroom[]=new Showroom[5];
            Car car[]=new Car[5];
            Emploeey emploeey[]=new Emploeey[5];
            int carCounter=0;
            int showroomCounter=0;
            int emploeeyCounter=0;
            int count =100;
            while(count!=0){
                mainMenu();
                count = scanner.nextInt();

                        while(count!=9 && count!=0){
                            switch (count){
                                case 1:
                                    showroom[showroomCounter] = new Showroom();
                                    showroom[showroomCounter].setdetails();
                                    showroomCounter++;
                                    System.out.println();
                                    System.out.println("1].ADD NEW SHOWROOM");
                                    System.out.println("9].GO BACK TO MAIN MENU");
                                    count= scanner.nextInt();
                                    break;
                                case 2:
                                    emploeey[emploeeyCounter] = new Emploeey();
                                    emploeey[emploeeyCounter].setdetails();
                                    emploeeyCounter++;
                                    System.out.println();
                                    System.out.println("2].ADD NEW EMPLOYEE");
                                    System.out.println("9].GO BACK TO MAIN MENU");
                                    count = scanner.nextInt();
                                    break;
                                case 3:
                                    car[carCounter] = new Car();
                                    car[carCounter].setdetails();
                                    carCounter++;
                                    System.out.println();
                                    System.out.println("3].ADD NEW CAR");
                                    System.out.println("9].GO BACK TO MAIN MENU");
                                    count = scanner.nextInt();
                                    break;
                                case 4:
                                    for (int i = 0; i < showroomCounter; i++) {
                                        showroom[i].getdetails();
                                        System.out.println();
                                        System.out.println();
                                    }
                                    System.out.println();
                                    System.out.println("9].GO BACK TO MAIN MENU");
                                    System.out.println("0].EXIT");
                                    count = scanner.nextInt();
                                    break;
                                case 5:
                                    for (int i = 0; i < emploeeyCounter; i++) {
                                        emploeey[i].getdetails();
                                        System.out.println();
                                        System.out.println();
                                    }
                                    System.out.println();
                                    System.out.println("9].GO BACK TO MAIN MENU");
                                    System.out.println("0].EXIT");
                                    count = scanner.nextInt();
                                    break;
                                case 6:
                                    for (int i = 0; i < carCounter; i++) {
                                        car[i].getdetails();
                                        System.out.println();
                                        System.out.println();
                                    }
                                    System.out.println();
                                    System.out.println("9].GO BACK TO MAIN MENU");
                                    System.out.println("0].EXIT");
                                    count = scanner.nextInt();
                                    break;
                                default:
                                    System.out.println("ENTER VALID CHOICE: ");
                                    break;
                            }
                        }

            }


    }
}