package pkgfinal;

public class Fontanero extends Persona implements Empleado{
    // Constructor
    public Fontanero() {
        super();
    }    
    
    // Método de mostrar datos
    public String MostrarDatos(){
        // Tomamos los valores que fueron asignados
        String nombre = super.getNombre();
        String apellidoPaterno = super.getApellidoPaterno();
        String apellidoMaterno = super.getApellidoMaterno();
        
        // Regresamos en una cadena los datos
        return nombre + " " + apellidoPaterno+ " " + apellidoMaterno;
    }
    
    // Método de trabajar
    public void Trabajar(){
        // Se imprime en pantalla el mensaje con el nombre
        System.out.println(this.MostrarDatos() + " empezó a realizar trabajos de fontanería.");
    }
}
