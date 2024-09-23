import java.util.Scanner;

public class bai3tuan3
        {
            public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("nhập a: ");
            double a=new Scanner(System.in). nextDouble();
            System.out.println("nhập b: ");
            double b=new Scanner(System.in). nextDouble();
            System.out.println("nhập c: ");
            double c=new Scanner(System.in). nextDouble();
            double delta = Math.pow(b,2)-(4*a*c);
            System.out.println("denta la "+delta);
            if(delta>0)
            {
                double x1= (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem : " +x1 );
                double x2= (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem : " +x2 );
            } else if (delta==0)
            {
                double x3= -b / (2 * a);
                System.out.println("Phuong trinh co 1 nghiem: " +x3);
            } else
            {
                System.out.println("Phuong trinh vo nghiem. ");
            }
        }
        }


