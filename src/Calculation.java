import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen x: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap vao so nguyen y: ");
        int y = Integer.parseInt(scanner.nextLine());
        calculate(x, y);
    }

    public static void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Phep cong: x + y = " + a);
            System.out.println("Phep tru: x - y = " + b);
            System.out.println("Phep nhan: x * y = " + c);
            System.out.println("Phep chia: x / y = " + d);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
