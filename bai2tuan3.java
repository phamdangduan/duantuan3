import java.util.Scanner;

public class bai2tuan3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap diem trung binh: ");
        double so=new Scanner(System.in).nextDouble();
        if(so<=10 && so>=8)
            System.out.println("hoc sinh gioi");
        else if(so<8 && so>=6.5)
            System.out.println("hoc sinh kha");
        else if (so<6.5 && so>=5)
            System.out.println("hoc sinh trung binh");
        else
            System.out.println("hoc sinh yeu ");

    }
}
