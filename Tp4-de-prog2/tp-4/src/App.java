import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

    //2.1
    //2.2
    public static void registrarUsuario(String nombre, int edad) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        System.out.println("Usuario " + nombre + " registrado con éxito.");

        
    }
    public static void main(String[] args) throws Exception {
        //1.1
        try {
            int abc = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Mensaje de error: " + e.getMessage());
            System.out.println("Tipo de clase: " + e.getClass().getName());
        }

        System.out.println("-------------------------------------------------");

        //1.2
        try {
            int div = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        } finally {
            System.out.println("Limpieza final");
        }

        System.out.println("-------------------------------------------------");
        //1.3

        String entrada = "0";
        try {
            int num = Integer.parseInt(entrada);
            int divi = 100 / num;
            System.out.println("Resultado: " + divi);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error de cálculo o conversión.");
        }

        System.out.println("-------------------------------------------------");
        registrarUsuario("Carlos", 28);


        try {
            
            registrarUsuario("Laura", -2);
        } 
        
        catch (IllegalArgumentException e) {
            
            System.out.println("Error de validación capturado: " + e.getMessage());
        }
        System.out.println("-------------------------------------------------");
        //4.1
        
        try (BufferedReader br = new BufferedReader(new FileReader("personas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } 
        catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }


    }
    
}
