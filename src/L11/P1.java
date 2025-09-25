package L11;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //flux de iesire
        System.out.println("Hello! What is your name?");

        //flux de intrare
        String name = scanner.nextLine();

        //flux de iesire
        System.out.println("Nice to meet you, " + name + "!");
    }
}
