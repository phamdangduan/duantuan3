import javax.swing.*;
import java.util.Scanner;

public class bai5tuan3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a:");
        int a= sc.nextInt();
        System.out.println("nhap b:");
        int b= sc.nextInt();
        System.out.println("nhap c:");
        int c= sc.nextInt();
        if(a+b>c && a+c>b && b+c>a)
        {
            if(a==b && b==c)
                System.out.println("tam giac deu");
            else if (a==b || a==c || b==c) {
                System.out.println("tam giac can");
            } else if (a*2 + b*2 == c*2 || a*2 + c*2 == b*2 || b*2 + c*2 == a*2) {
                System.out.println("tam giac vuong");}
                else
                System.out.println("tam giac binh thuong");
            }
        else
            System.out.println("khong phai la tam giac");
        }

    }

