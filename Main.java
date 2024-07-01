import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Billing bill = new Billing();
        bill.Output();
        bill.Price(sc.nextInt());
    }
}