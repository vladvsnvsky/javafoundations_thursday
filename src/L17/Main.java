package L17;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        //myArr va fi un array de dimensiune 5
        int[] myArr = {4, -8, 9, 3};

        //accesarea elementelor unui array se face prin scrierea numelui array-ului
        //si pozitia elementului intre paranteze patrate
        System.out.println(myArr[2]);

        //nu putem adauga sau elimina
        //adica are dimensiune constanta
        //UN ARRAY NU ISI POATE MODIFICA DIMENSIUNEA

        //putem doar accesa si modifica elementele deja existente
        myArr[3] = 7;

    }
}
