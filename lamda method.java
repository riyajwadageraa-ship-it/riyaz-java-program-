
interface Add {
    int sum(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        Add obj = (a, b) -> a + b;

        System.out.println("Sum = " + obj.sum(10, 20));
    }
}