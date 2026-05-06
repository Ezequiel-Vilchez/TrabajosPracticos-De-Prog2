public class Reporte {
    
    
    public void generarEncabezado() {
        System.out.println(" ENCABEZADO DEL REPORTE ");
    }

    
    public String obtenerCuerpo() {
        return "Este es el cuerpo principal del documento generado.";
    }

    
    public void procesarSecciones(String... secciones) {
        System.out.println("Procesando " + secciones.length + " secciones:");
        
        for (String seccion : secciones) {
            System.out.println("- " + seccion);
        }
    }
}