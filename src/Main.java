import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;
        double x = 0;
        String kq = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số a: ");
        a = sc.nextInt();

        System.out.println("Nhập số b: ");
        b = sc.nextInt();

        if (a == 0) {
            if (b == 0) {
                kq = "Phương trình có vô số nghiệm.";
            } else {
                kq = "Phương trình vô nghiệm.";
            }
        } else {
            kq = String.valueOf(x = (double) -b / a);
        }

        System.out.println("=======================================================");
        System.out.println("Phương trình bạn vừa nhập là: " + a + "x " + b + " = 0");
        System.out.println("Nghiệm của phương trình là: " + kq);
        System.out.println("=======================================================");

    }
}