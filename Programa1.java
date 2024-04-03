package programa1;

import java.util.Scanner;

public class Programa1 {

    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
    
     //Ingresar Datos 
     System.out.println("Ingresar primer Nombre:");
    String primerNombre = entrada.nextLine();
   
     System.out.println("Ingresar primer Apellido:");
     String primerApellido = entrada.nextLine();
     
     System.out.println("Ingresar Edad:");
     String Edad = entrada.nextLine();
     
     System.out.println("Ingresar Genero (F/M)");
     String Genero = entrada.nextLine();
     
     System.out.println("Ingresar Peso:(Kg)");
     String Peso = entrada.nextLine();
     
     System.out.println("Ingresar Talla(cm):");
     String Talla = entrada.nextLine();
     
     System.out.println("Ingresar Direccion:");
     String Direccion = entrada.nextLine();
     
     System.out.println("Ingresar Email:");
     String Email = entrada.nextLine();
     
     //Mostrar Datos 
     
     System.out.println("Ingresar Datos");
     System.out.println("primer Nombre:"+ primerNombre);
     System.out.println("primer Apellido"+ primerApellido);
     System.out.println("Edad"+ Edad);
     System.out.println("Genero"+ Genero);
     System.out.println("Peso"+ Peso);
     System.out.println("Talla" + Talla + "cm");
     System.out.println("Direccion"+ Direccion);
     System.out.println("Email"+ Email);
    }//Fin de Main
     
}//Fin de la clase
