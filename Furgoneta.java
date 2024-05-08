
package ventasdeautos03;

import java.util.Scanner;
    
public class Furgoneta extends vehiculo {

    private int capacidadCarga;
    private  int volumenMetrosCubicos;
  
    //Metodo Constructor
    public Furgoneta(String Matricula, String Marca, String Modelo, String Color, float tarifaAlquiler, boolean estaDisponible) {
        super(Matricula, Marca, Modelo, Color, tarifaAlquiler, estaDisponible);
        this.capacidadCarga = capacidadCarga;
        this.volumenMetrosCubicos = volumenMetrosCubicos;
    }
  
    public int get_CapacidadCarga() {
        return capacidadCarga;
    }
 
    public int get_VolumenMetrosCubicos() {
        return volumenMetrosCubicos;
    }
    
    @Override
    public float calcularMontoAlquiler(){
        return tarifaAlquiler;
    }

    @Override
    public String mostrarRegistro(String _Matricula, String _Marca, String _Modelo, String _Color, float _tarifaAlquiler, boolean _estaDisponible, int _numerodePuertas, boolean _tipodeMarcha) {
        return "Matricula: "+Matricula+"\nMarca: +Marca+\nModelo: "+Modelo+
               "\nColor: +Color+\ntarifaAlquiler: "+tarifaAlquiler+"\nestaDisponible: "+estaDisponible+
               "\ncapacidadCarga: "+capacidadCarga+"\nvolumenMetrosCubicos: "+volumenMetrosCubicos;
    }
    //Procesar e Imprimir el calculo de alquiler y Disponibilidad
    
    public void calcularMontoAlquiler(boolean estaDisponible,float capacidadCarga,int tarifaAlquiler){
        if(estaDisponible = true ) {
            
       
            Scanner teclado = new Scanner(System.in);
        
            System.out.println("Ingrese Cantidad de Dias: ");
            int CantidadDeDias = teclado.nextInt();
            
        float montoParcial = tarifaAlquiler * CantidadDeDias;
        //calculo =200$ * cantidad de Dias
        
        if (capacidadCarga > 2.000){
         
            float Incremento = montoParcial * 0.25f;
            float montoTotal = montoParcial + Incremento;
            System.out.println("Pago Total: "+montoTotal+"$");
            
        } 
        else { 
            System.out.println("Pago Total: "+montoParcial+"$");
            }  
            
        } 
        else {
            System.out.println("");
            System.out.println("Aviso: El Vehiculo no esta Disponible");
            System.out.println("");
            
        }
    }
 
    //Impresion del Registro
public void mostrarRegistro(String Matricula, String Marca, String Modelo, String Color, float tarifaAlquiler, boolean estaDisponible,int capacidadCarga, int volumenMetrosCubicos){

        
        System.out.println (" Vehiculo instanciado desde la clase Furgoneta: ");
        System.out.println (" Matricula: "+Matricula );
        System.out.println ("Marca: "+Marca);
        System.out.println ("Modelo: "+Modelo);
        System.out.println ("Color: "+Color);
        System.out.println ("Tarifa de alquiler: "+tarifaAlquiler);
        System.out.println ("Disponibilidad: "+estaDisponible);
        System.out.println ("Capacidad de Cargar: "+capacidadCarga);
        System.out.println ("Volumen de Metros Cubicos : "+volumenMetrosCubicos);
       
     
 }//fin Impresion

}
