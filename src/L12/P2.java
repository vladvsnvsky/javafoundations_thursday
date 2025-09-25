package L12;

class Item{
    String name;
    double price;

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        String text = "-----------------------\n" + "Produs: " + this.name +"\nPret: "+this.price+" RON\n";
        return text;
    }
}

public class P2 {
    public static void main(String[] args) {
        Item i = new Item("Coca Cola", 6.33);
        Item i1 = new Item("Ananas", 21.21);
        Item i2 = i;

        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
    }
}
