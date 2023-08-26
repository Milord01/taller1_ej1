package Taller1;
import java.util.Scanner;

public class Edades {
    public static void main(String[] args) {
     int juan;
     double x;
     double y;
     int madre;
     int alberto;
     int ana;
     Scanner entrada = new Scanner(System.in);
     System.out.println("Ingrese la edad de Juan:");
     juan = entrada.nextInt();
     x=juan*(2.0/3);
     y=juan*(4.0/3);
     madre=juan+(int)x+(int)y;
     alberto= (int)x;
     ana= (int)y;
     System.out.println("La edad de Juan es: " + juan);
     System.out.println("La edad de Alberto es: " + alberto);
     System.out.println("La edad de Ana es: " + ana);
     System.out.println("La edad de la Madre es: " + madre);
    }

}
