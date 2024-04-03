package programa1;

public class Persona {
private String ID;
private String primer_Nombre;
private String primer_Apellido;
private  int Edad;
private String Genero;
private int Peso;
private int Talla;
private String Direccion;
private String Email;

public Persona (String ID,String primer_Nombre,String primer_Apellido, int Edad, String Genero, int Peso, int Talla, String Direccion, String Email) {
 this.ID=ID;
 this.primer_Nombre= primer_Nombre;
 this.primer_Apellido = primer_Apellido;
 this.Edad = Edad;
 this.Peso=Peso;
 this.Talla=Talla;
 this.Direccion = Direccion;
 this.Email = Email;
}//fin del metodo constructor 

    public String getID() {
        return ID;
    }

    public String getPrimer_Nombre() {
        return primer_Nombre;
    }

    public String getPrimer_Apellido() {
        return primer_Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public int getPeso() {
        return Peso;
    }

    public int getTalla() {
        return Talla;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getEmail() {
        return Email;
    }
//fin de metodo getter()

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPrimer_Nombre(String primer_Nombre) {
        this.primer_Nombre = primer_Nombre;
    }

    public void setPrimer_Apellido(String primer_Apellido) {
        this.primer_Apellido = primer_Apellido;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public void setTalla(int Talla) {
        this.Talla = Talla;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
//fin de metodo setter() 
  
}//Fin de la clase 