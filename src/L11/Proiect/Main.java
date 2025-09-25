package L11.Proiect;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ii cere profesurului notele
        System.out.println("Introduceti notele de la tastatura.");
        System.out.println("Dupa ce ati terminat, apasati X.");

        double suma = 0.0;
        int nrNote = 0;

        Scanner sc = new Scanner(System.in);
        String line;
        do{
            line = sc.nextLine();
            if(line.equals('X'))
            {
                //1 calculeaza media
                //2 afiseaza media
                //3 opreste programul
            }
            try{
                double nota = Double.parseDouble(line);
                //nota trebuie adaugata la o suma
                suma += nota;
                //nota trebuie si numarata
                nrNote++;
            }catch (Exception ex){
                System.err.println("Nu ati introdus o valoare corecta!");
            }
        }while(line != null);

    }
}
