import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double a,b,c,u,alan;
        Scanner in = new Scanner(System.in);
        System.out.print("a kenarını giriniz: ");
        a = in.nextDouble();
        System.out.print("\n b kenarını giriniz: ");
        b =in.nextDouble();

        c = Math.sqrt((a*a)+(b*b));

        System.out.print("\nHipotenüs : " + c);

        u = (a+b+c)/2;
        System.out.print("\ncevresi: " + 2*u);

        alan= Math.sqrt( u * (u -a)* (u-b) * (u-c));
        System.out.print("\nalanı: " + alan);


    }
}

