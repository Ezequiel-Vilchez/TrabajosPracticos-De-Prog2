/**
 * Clase SistemaGestor
 * Propósito: Esta clase se encarga de administrar las configuraciones principales 
 * y conexiones de nuestro sistema. 
 * (Este es un comentario de documentación o Javadoc - Ejercicio 1.1)
 */
public class SistemaGestor {
    // Declaracion de constante con static y final (ejercicio 1.2)
    public static final int MAX_CONEXIONES =10;

    // Método para iniciar el sistema 
    public void iniciarSistema() {
        //Declaracion de variable local que solo se puede usar en el metodo
        String mensaje = "El numero de maximao de conexiones es: "; // Declaración de variable (ejercicio 1.3)
    
        System.out.println(mensaje + MAX_CONEXIONES); // Uso de la variable local y la constante

        /*Explicacion:
        Al usar la palabra static, la variable MAX_CONEXIONES pertenece a la clase y no a una instancia especifica de la clase. Esto significa q se puede acceder a ella sin crear un objeto de la clase SistemaGestor.
        Al usar la palabra final se convierte en una constante, estamos indicando q el valor de MAX_CONEXIONES no puede ser modificado despues de su inicializacion.Daria error al intentar hacer MAX_CONEXIONES = 20 por ejemplo.
        */
    }

}
