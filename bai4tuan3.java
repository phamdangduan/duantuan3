import java.util.Scanner;

public class bai4tuan3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Mhap a:");
        int a= sc.nextInt();
        System.out.println("Mhap b:");
        int b= sc.nextInt();
        System.out.println("Mhap c:");
        int c= sc.nextInt();
        if(a<b && a<c)
            System.out.println(" a laf so nho nhat ");
        else if (b<c && b<a) {
            System.out.println(" b day la so nho nhat");
        }
            else
            System.out.println(" c day la so nho nhat");
        }
    }

