package L20;

public class Casting {
    public static void main(String[] args) {
        /**
         * Widening Casting
         * Conversia de la un tip de data mai mic
         * la un tip de data mai mare
         * Ordinea marimii tipurilor de data primitive:
         * byte  -> short  ->  int ->  long ->  float  -> double
         *          char
         * 1byte    2bytes   4bytes   8bytes   4bytes      8bytes
         * 8bits    16        32      64        32          64
         */

        int i = 10;
        double iDouble = i;
        float iFloat = i;
        long iLong = i;

        char x = 'A';
        int xChar = x;
        System.out.println(xChar); //valoarea lui 'A' din codul ASCII

        /**
         * Narrowing Casting
         * Conversia de la un tip de data mai mic
         * la un tip de data mai mare
         * Ordinea marimii tipurilor de data primitive:
         * byte  -> short  ->  int ->  long ->  float  -> double
         *          char
         * 1byte    2bytes   4bytes   8bytes   4bytes      8bytes
         * 8bits    16        32      64        32          64
         */

        short p = 66;
        //p in memorie: 00000000 01000010
        byte p_byte = (byte)p;
        //p_byte: 01000010
        System.out.println(p_byte);
    }
}
