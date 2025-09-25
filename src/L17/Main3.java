package L17;

public class Main3 {
    public static void main(String[] args) {
        long arr[]= {6, -8, 13};

        //How many bytes does the array occupy?
        int longSize = Long.SIZE;
        System.out.println("arr are dimensiunea de " + arr.length * Long.SIZE / 8+ " bytes");


        double arr2[] = {18, 19.2, -0, 243.23};
        //How many bits does the arr2 occupy?
        System.out.println("arr2 are dimensiunea de " + arr.length * Double.SIZE+ " bytes");
    }
}
