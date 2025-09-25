package L14;

import java.util.UUID;

public class Car {
    private String brand;
    private String vin; //vehicle identification number
    private int horsePower;

    public Car(String brand, String vin, int horsePower){
        this.brand = brand;
        this.vin = vin;
        this.horsePower = horsePower;
        System.out.println("An object of Car has been created: " + this);
    }

    public Car(String brand, int horsePower){
        this.brand = brand;
        this.vin = UUID.randomUUID().toString();
        this.horsePower = horsePower;
        System.out.println("An object of Car has been created: " + this);
        System.out.println("The VIN has been randomly created:" + this.vin);
    }

}
