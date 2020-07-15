package pkgfinal;

// Crear la interfaz
public interface Empleado {
    // Método de trabajar
    default void Trabajar(){}
    
    // Método para mostrar datos
    default String MostrarDatos(){
        return "";
    }
}
