package L12;

public class P1 {
    public static void main(String[] args) {
        System.out.println("Valoarea lui E este " + Math.E);
        System.out.println("Valoarea lui PI este " + Math.PI);

        int x = -13;
        System.out.printf("Valoarea absoluta a lui %d este %d\n", x, Math.abs(x));

        double a = 59.6;
        System.out.printf("Math.floor(%f) are valoarea %f\n", a, Math.floor(a));

        double b = 59.3;
        System.out.printf("Math.ceil(%f) are valoarea %f\n", b, Math.ceil(b));

        double c = 59.49;
        System.out.printf("Math.round(%f) are valoarea %d\n", c, Math.round(c));

        double d = 59.50;
        System.out.printf("Math.round(%f) are valoarea %d\n", d, Math.round(d));


    }
}
