
package ventasdeautos03;

import java.util.Scanner;

    public class Turismo extends vehiculo {

    // Datos especificos de Turismo
    private int numerodePuertas;
    private boolean tipodeMarchaSincronica = true;

    //Metodo Constructor
  
    //Metodo Constructor
    public Turismo(String Matricula, String Marca, String Modelo, String Color, float tarifaAlquiler, boolean estaDisponible) {
        super(Matricula, Marca, Modelo, Color, tarifaAlquiler, estaDisponible);
        this.numerodePuertas = numerodePuertas;
        this.tipodeMarchaSincronica = tipodeMarchaSincronica;
      
    }// Fin de Metodo Constructor

    public int get_numerodePuertas() {
        return numerodePuertas;
    }

    public void setNumerodePuertas(int numerodePuertas) {
        this.numerodePuertas = numerodePuertas;
    }

    public void setTipodeMarchaSincronica(boolean tipodeMarchaSincronica) {
        this.tipodeMarchaSincronica = tipodeMarchaSincronica;
    }

    public boolean get_tipodeMarchaSincronica() {
        return tipodeMarchaSincronica;
    }

    // Solicitar el registro de alquiler
    @Override
    public float calcularMontoAlquiler() {
        return  tarifaAlquiler;   
    }

    // Mostrar los Datos Solicitados
   @Override
    public String mostrarRegistro(String _Matricula, String _Marca, String _Modelo, String _Color, float _tarifaAlquiler, boolean _estaDisponible, int _numerodePuertas, boolean _tipodeMarcha) {
       return "Matricula: "+Matricula+"\nMarca: +Marca+\nModelo: "+Modelo+
       "\nColor: +Color+\ntarifaAlquiler: "+tarifaAlquiler+"\nestaDisponible: "+estaDisponible+
       "\nnumerodePuertas: "+numerodePuertas+"\ntipodeMarcha: "+tipodeMarchaSincronica;
        }
    //Procesar e Imprimir el calculo de alquiler y Disponibilidad
     
    public void calcularMontoAlquiler(boolean estaDisponible, float tarifaAlquiler){
        if (estaDisponible = true ) {
            
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("Ingrese Cantidad de Dias: ");
            int CantidadDeDias = teclado.nextInt();
            
        Float montoParcial = tarifaAlquiler * CantidadDeDias;
        //calculo =100$ * cantidad de Dias
        
            System.out.println("Recorrido fuera de la Ciudad? 1 Si o 2 No");
            int fueradelaCiudad = teclado.nextInt();
        
        if (fueradelaCiudad == 1){
            float Incremento = montoParcial * 0.15f;
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
         
     }// Fin de calcular Alquiler y Disponibilidad
    
    
     //Impresion del Registro
public void mostrarRegistro(String Matricula, String Marca, String Modelo, String Color, float tarifaAlquiler, boolean estaDisponible){

        
        System.out.println (" Matricula: "+Matricula);
        System.out.println ("Marca: "+Marca);
        System.out.println ("Modelo: "+Modelo);
        System.out.println ("Color: "+Color);
        System.out.println ("Tarifa de alquiler: "+tarifaAlquiler);
        System.out.println ("Disponibilidad: "+estaDisponible);
        System.out.println ("Numero de Puertas: "+numerodePuertas);
        System.out.println ("Tipo de Marcha: "+tipodeMarchaSincronica);

}//fin Impresion
    }