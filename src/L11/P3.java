package L11;
import java.util.Random;
public class P3 {
    public static void main(String[] args) {
        Random r = new Random();
        int rezultat = r.nextInt();
        System.out.printf("%d a fost generat random\n", rezultat);

        Random r2 = new Random();
        int rezultat2 = r.nextInt(5);
        System.out.printf("%d a fost generat random\n", rezultat2);

        Random r3 = new Random(100);
        Random r4 = new Random(100);

        System.out.println();
        System.out.println("random3: " + r3.nextInt());
        System.out.println("random4: " + r4.nextInt());
        System.out.println();
        System.out.println("random3: " + r3.nextInt());
        System.out.println("random4: " + r4.nextInt());
        System.out.println();
        System.out.println("random3: " + r3.nextInt());
        System.out.println("random4: " + r4.nextInt());
        System.out.println();
        System.out.println("random3: " + r3.nextInt());
        System.out.println("random4: " + r4.nextInt());
        System.out.println();
        System.out.println("random3: " + r3.nextInt());
        System.out.println("random4: " + r4.nextInt());

    }
}
