package principal1;
import java.util.Scanner;
public class Principal1 {

    public static void main(String[] args) {
       // Objeto c1DOG
        Circunferencia DOG1 = new Circunferencia();

        // Datos al  Usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el valor de radio:");
        double radio = scanner.nextDouble();

        // Obejto c2DOG
        Circunferencia DOG2 = new Circunferencia(radio);

        // Informacion c1
        System.out.println("Información  C1:");
        System.out.println("Radio: " + DOG1.getRadio());
        System.out.println("Diametro: " + DOG1.getDiametro());
        System.out.println("Longitud: " + DOG1.getLongitud());
        System.out.println("Area: " + DOG1.getArea());

        //  Información c2
        System.out.println("Información  C2:");
        System.out.println("Diametro: " + DOG2.getDiametro());
        System.out.println("Longitud: " + DOG2.getLongitud());
        System.out.println("Area: " + DOG2.getArea());
    }
}//Fin de la clase
    

