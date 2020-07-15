package pkgfinal;

public class Final{
    public static void main(String[] args) {
        /* CARPINTERO */
        // Instanciar el objeto de carpintero
        Carpintero carpintero = new Carpintero();
        
        // Asignarle valor a los atributos
        carpintero.setNombre("Daniela");
        carpintero.setApellidoPaterno("Ruiz");
        carpintero.setApellidoMaterno("Aburto");
        
        // Llamar al método de trabajar
        carpintero.Trabajar();
        
        /* FONTANERO */
        // Instanciar el objeto de fontanero
        Fontanero fontanero = new Fontanero();
        
        // Asignarle valor a los atributos
        fontanero.setNombre("Daniela");
        fontanero.setApellidoPaterno("Ruiz");
        fontanero.setApellidoMaterno("Aburto");
        
        // Llamar al método de trabajar
        fontanero.Trabajar();
    }
}
