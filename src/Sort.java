import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        a = scanner.nextInt();
        System.out.println("2. sayıyı giriniz");
        b = scanner.nextInt();
        System.out.println("3. sayıyı giriniz");
        c = scanner.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a<b<c");
            } else {
                System.out.println("a<c<b");
            }
        }
        if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b<a<c");
            } else {
                System.out.println("b<c<a");
            }
        }
        if ((c < a) && (c < b)) {
            if (a < b) {
                System.out.println("c<a<b");
            } else {
                System.out.println("c<b<a");
            }
        }

    }
}