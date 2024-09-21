import java.util.Scanner;

public class bai1tuan3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap 1 so bat ki");
        int a= sc.nextInt();
        if(a>0)
            System.out.println("day la so dương");
        else if (a<0) {
            System.out.println(" day la so am");
        }
            else
            System.out.println("day la so 0");
    }
}