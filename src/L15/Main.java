package L15;

import java.util.Random;

class Player{
    public Long id;
    public static int total = 0;

    public Player() {
        Random r = new Random();
        id = r.nextLong();
        total++;
        System.out.printf("Obiect Player creat cu id %d --\n", id);
    }

    public static void reset(){
        total = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Player p = new Player();
        p.total = 99;
        p.reset();

    }
}
