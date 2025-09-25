package L10;

import L10.Models.School;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String CALEA_CATRE_FISIER = "src/L10/Resources/schools.csv";
        try{
            FileReader fr = new FileReader(CALEA_CATRE_FISIER);
            BufferedReader br = new BufferedReader(fr);

            String row;

            do{
                row = br.readLine();
                if(row != null)
                {
                    //Aici putem scrie cod si sa formam obiecte
                    //pe baza randului curent
                    String[] proprietati = row.split(",");

                    //vreau sa creez un obiect scoala
                    School s = new School();

                    s.id = proprietati[0];
                    s.name = proprietati[1];
                    s.city = proprietati[2];
                    s.studentsCount = proprietati[3];
                    if(proprietati[4].equals("true"))
                        s.isPublic = true;
                    else
                        s.isPublic = false;

                }
            }while (row != null);


        }catch (Exception ex){
            System.err.println("A fost o eroare la deschideara fisierului!");
        }

    }
}
