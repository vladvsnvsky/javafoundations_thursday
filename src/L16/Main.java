package L16;

class MyNumber{
    public void printReverse(int num){
        if(num == 0)
            return;
        System.out.print(num%10);
        printReverse(num/10);
    }
}

public class Main {

    public static void main(String[] args) {

        MyNumber obj = new MyNumber();
        obj.printReverse(12345);
    }
}
