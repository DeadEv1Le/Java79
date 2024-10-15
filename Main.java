import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four-digit number: ");
        int num = scanner.nextInt();

        int a = num / 1000;
        int b = (num % 1000) / 100;
        int c = (num % 100) / 10;
        int d = num % 10;

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        int count = 0;
        if (a == min) count++;
        if (b == min) count++;
        if (c == min) count++;
        if (d == min) count++;

        int newNum = 0;
        if (count == 1) {
            if (a != min) newNum = newNum * 10 + a;
            if (b != min) newNum = newNum * 10 + b;
            if (c != min) newNum = newNum * 10 + c;
            if (d != min) newNum = newNum * 10 + d;
        } else {
            newNum = num;
        }
        System.out.println("Updated number: " + newNum);

        scanner.close();
    }
}