package L17;
import java.util.*;
public class Main4 {
    public static void main(String[] args) {
        //definirea unei liste
        //crearea variabilei in memoria Stack ce va identifica lista din Heap
        List<String> myCars;
        //myCars acum este neinitializat, deci nu poate afisat

        myCars = new ArrayList<>(); //initializare - variabila referentiaza un obiect din Heap
        //dimensiunea lui myCars acum este 0
        System.out.println("myCars: " + myCars);
        System.out.println("size: " + myCars.size());

        //putem adauga elemente in lista
        myCars.add("Dacia");
        myCars.add("Toyota");
        myCars.add("Toyota Hybrid cu GPL");

        System.out.println("Garajul meu: " + myCars);

        myCars.remove("Dacia");

        myCars.remove(0);

        System.out.println("Garajul meu: " + myCars);

        myCars.addFirst("Mercedes");
        System.out.println("Garajul meu: " + myCars);

        myCars.add(1, "ATV");
        System.out.println("Garajul meu: " + myCars);
    }
}
