import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     double armut = 2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,tutar;
     System.out.print("Armut kaç kilo? :");
     Scanner arm = new Scanner(System.in);
     armut *= arm.nextDouble();

     System.out.print("Elma kaç kilo? :");
     Scanner elm = new Scanner(System.in);
     elma *= elm.nextDouble();

     System.out.print("Domates kaç kilo? :");
     Scanner dom = new Scanner(System.in);
     domates *= dom.nextDouble();

     System.out.print("Muz kaç kilo? :");
     Scanner mz = new  Scanner(System.in);
     muz *= mz.nextDouble();

     System.out.print("Patlıcan kaç kilo? :");
     Scanner pat = new Scanner(System.in);
     patlican *= pat.nextDouble();

     tutar = armut+elma+domates+muz+patlican;

     System.out.println("Tutar:"+tutar);

    }
}

// arm,elm vs Bunlar girilen kilogram miktarı.