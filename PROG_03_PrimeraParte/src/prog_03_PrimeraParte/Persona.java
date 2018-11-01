package prog_03_PrimeraParte;

/**
 *
 * @author Gonza
 */
public class Persona {
    String nombre;
    int edad;
    float altura;
    
    public Persona(String nombre, int edad, float altura) {
        this.nombre=nombre;
        this.edad=edad;
        this.altura=altura;
    }
    
    public Persona(){
        nombre="Luisa Perez";
        edad=22;
        altura=1.70f;
    }
    
    String consulta_Nombre(){
        return nombre;
    }
    void cambia_Nombre(String nom){
        nombre=nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}   
