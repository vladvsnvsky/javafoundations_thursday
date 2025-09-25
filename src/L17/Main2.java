package L17;

public class Main2 {
    public static void main(String[] args) {
        //myArr va fi un array de dimensiune 5
        int[] myArr = new int[5];

        //afisarea elementelor unui array
        //trebuie parcursa fiecare pozitie din array
        //adica de la la 0 pana la pozitia length-1
        for(int index = 0; index < myArr.length; index++){
            System.out.printf("Elementul de pe pozitia %d are valoarea %d \n", index, myArr[index]);
        }
    }
}
