package L14;

import java.util.Scanner;

public class CarFactory {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        exemplu1();
          exemplu2();


    }

    public static void exemplu2(){
        new Car("TudorCarz", 882);
        new Car("Speedfan", 1000);
        new Car("AndyGhost", 882);
    }

    public static void exemplu1(){
        displayWelcomeMessage();
        System.out.print("Enter the brand of the car: ");
        String brandInput = readBrand();

        System.out.print("Enter the VIN: ");
        String vinInput = readVIN();

        System.out.println("Enter the Horse Power value: ");
        int horsePowerInput = readHorsePower();

        new Car(brandInput, vinInput, horsePowerInput);
    }

    public static void displayWelcomeMessage(){
        System.out.println("Welcome to the Car Factory!");
        System.out.println("Here you can create your own personalized car!");
        System.out.println("Let's start!");

    }

    public static String readBrand() throws RuntimeException{

        String brand = sc.next();

        return brand;
    }

    public static String readVIN() throws RuntimeException{

        String vin = sc.next();

        return vin;
    }

    public static int readHorsePower() throws RuntimeException{

        int hp = sc.nextInt();

        return hp;
    }
}
