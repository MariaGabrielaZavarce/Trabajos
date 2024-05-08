package ventasdeautos03;

import java.util.Scanner;

public class Deportivo extends vehiculo {
    
   private int Cilindrada;

    //Metodo Constructor
    public Deportivo(String Matricula, String Marca, String Modelo, String Color, int Cilindradra, boolean estaDisponible, int tarifaAlquiler) {
        super(Matricula, Marca, Modelo, Color, tarifaAlquiler, estaDisponible);
        
       this.Cilindrada = 0;
    }// Fin del Constructor

    //Metodos de la Subclase

    public void setCilindrada(int Cilindrada) {
        this.Cilindrada = Cilindrada;
    }
    
    public int get_Cilindrada(){
        return Cilindrada;
    }// Fin Metodo set y get
    
    @Override
    public float calcularMontoAlquiler(){
      return tarifaAlquiler;  
    }

    //Mostrar Datos Solicitados
    @Override
    public String mostrarRegistro(String _Matricula, String _Marca, String _Modelo, String _Color, float _tarifaAlquiler, boolean _estaDisponible, int _numerodePuertas, boolean _tipodeMarcha){
        return "Matricula: "+Matricula+"\nMarca: +Marca+\nModelo: "+Modelo+
               "\nColor: +Color+\ntarifaAlquiler: "+tarifaAlquiler+"\nestaDisponible: "+estaDisponible+
               "\nCilindrada: "+Cilindrada;
    }
    
    //Procesar e Imprimir el calculo de alquiler y Disponibilidad
    
    public void calcularMontoAlquiler(boolean estaDisponible,int tarifaAlquiler) {
       
        if (estaDisponible = true ) {
            
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("Ingrese Cantidad de Dias: ");
            int CantidadDeDias = teclado.nextInt();
            
        float montoParcial = tarifaAlquiler*CantidadDeDias;
        //calculo =150$ * cantidad de Dias

            System.out.println("Pago Total: "+montoParcial+"$");
            } 
        
        else {
            System.out.println("");
            System.out.println("Aviso: El Vehiculo no esta Disponible");
            System.out.println("");
        }
    }

    //Impresion del Registro
public void mostrarRegistro(int Cilindrada,String Matricula, String Marca, String Modelo, String Color, float tarifaAlquiler, boolean estaDisponible){
      
        System.out.println (" Matricula: "+get_Matricula());
        System.out.println ("Marca: "+get_Marca());
        System.out.println ("Modelo: "+get_Modelo());
        System.out.println ("Color: "+get_Color());
        System.out.println ("Tarifa de alquiler: "+get_tarifaAlquiler());
        System.out.println ("Disponibilidad: "+get_estaDisponible());
        System.out.println ("Cilindrada: "+get_Cilindrada());
     }//fin del registro

}
