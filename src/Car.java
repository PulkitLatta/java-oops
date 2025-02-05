import java.util.Scanner;

public class Car extends Showroom implements details{
    String carName;
    String carColor;
    String carFuelType;
    int carPrice;
    String carType;
    String carTransmission;

    @Override
    public void getdetails() {
        System.out.println("Car Name "+ carName);
        System.out.println("Car Color "+carColor);
        System.out.println("Car Fule Type "+carFuelType);
        System.out.println("Car Price "+carPrice);
        System.out.println("Car Type "+carType);
        System.out.println("Car Transmission "+carTransmission);
    }


    @Override
    public void setdetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.print("CAR NAME: ");
        carName = sc.nextLine();
        System.out.print(("CAR COLOR: "));
        carColor = sc.nextLine();
        System.out.print("CAR FUEL TYPE(PETROL/DIESEL): ");
        carFuelType = sc.nextLine();
        System.out.print("CAR PRICE: ");
        carPrice = sc.nextInt();
        sc.nextLine();
        System.out.print("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
        carType = sc.nextLine();
        System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        carTransmission = sc.nextLine();
        cars++;
    }
}
