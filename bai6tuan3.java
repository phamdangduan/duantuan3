import java.util.Scanner;

public class bai6tuan3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a= sc.nextInt();
        System.out.println("Nhap b: ");
        int b= sc.nextInt();
        System.out.println("Chọn phép toán:");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Nhân");
        System.out.println("4. Chia");
        int kq= sc.nextInt();
        if(kq==1)
        {
            System.out.println("tong la: " +(a+b));
        } else if (kq==2) {
            System.out.println("hieu la: " +(a-b));
        } else if (kq==3) {
            System.out.println("tich la: " + (a * b));
        }
            else
            System.out.println("tich la: " + (a/b));

        }
    }

