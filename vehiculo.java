
package ventasdeautos03;

public abstract class vehiculo {
  String Matricula;
  private String Marca;
  String Modelo;
  private String Color;
  float tarifaAlquiler;
  boolean estaDisponible;
  
 public vehiculo(String Matricula, String Marca, String Modelo, String Color, float tarifaAlquiler, boolean estaDisponible) {
    
   this.Matricula = Matricula;
   this.Marca = Marca;
   this.Modelo = Modelo;
   this.Color = Color;
   this.tarifaAlquiler = tarifaAlquiler;
   this.estaDisponible = estaDisponible;
} 
//Fin Metodo Constructor

public abstract float calcularMontoAlquiler();

public String mostrarRegistro(String _Matricula, String _Marca, String _Modelo, String _Color, float _tarifaAlquiler, boolean _estaDisponible, int _numerodePuertas, boolean _tipodeMarcha){
    return "Matricula: "+Matricula+"\nMarca: +Marca+\nModelo: "+Modelo+
    "\nColor: +Color+\ntarifaAlquiler: "+tarifaAlquiler+"\nestaDisponible: "+estaDisponible;
}

//Inicio Metodo get

public String get_Matricula(){
    return Matricula;
}

public String get_Marca(){
    return Marca;
}

public String get_Modelo(){
    return Modelo;
}

public String get_Color(){
    return Color;
}

public float get_tarifaAlquiler(){
    return tarifaAlquiler;
}

public boolean get_estaDisponible(){
    return estaDisponible;
}
//fin Metodo Getter

public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setTarifaAlquiler(float tarifaAlquiler) {
        this.tarifaAlquiler = tarifaAlquiler;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }
   
//Impresion del Registro
public void mostrarRegistro(String Matricula, String Marca, String Modelo, String Color, float tarifaAlquiler, boolean estaDisponible){

        System.out.println (" Matricula: "+Matricula );
        System.out.println ("Marca: "+Marca);
        System.out.println ("Modelo: "+Modelo);
        System.out.println ("Color: "+Color);
        System.out.println ("Tarifa de alquiler: "+tarifaAlquiler);
        System.out.println ("Disponibilidad: "+estaDisponible);
        
}//fin Impresion       
     
}
