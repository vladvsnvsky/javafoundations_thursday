package L20;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Suma 3+4 este: " + c.sum(3,4));
        System.out.println("Suma dintre 2.7 + 4.3 este: " + c.sum(2.7, 4.3));
        System.out.println("Suma dintre 3 + 4.0 este " + c.sum(3, 4.0));
        System.out.println("Suma dintre \"3\" + \"4.0\" este " + c.sum("3", "4.0"));
    }
}

class Calculator{

    int sum(int x, int y){
        System.out.println("Functia int-int apelata!");
        return (x+y);
    }

    double sum(double x, double y){
        System.out.println("Functia double-double apelata!");
        return (x+y);
    }

    double sum(String x, String y){

        double xDouble = Double.parseDouble(x);
        double yDouble = Double.parseDouble(y);

        return xDouble + yDouble;
    }

}
