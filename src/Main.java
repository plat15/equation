import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;
        double x;
        String kq;

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
            kq = "Phương trình có nghiệm là: x = " + -b / a;
        }

        System.out.println("=======================================================");
        System.out.println("Phương trình bạn vừa nhập là: " + a + "x " + b + " = 0");
        System.out.println(kq);
        System.out.println("=======================================================");

    }
}