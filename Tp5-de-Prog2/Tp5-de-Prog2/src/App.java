public class App {
    public static void main(String[] args) throws Exception {

        
        System.out.println("Ejercicio 1.1 y 1.2");

        TareaHilo hilo1 = new TareaHilo("Chef 1");
        TareaHilo hilo2 = new TareaHilo("Chef 2");
        hilo1.start();
        hilo2.start();

        Thread trabajador1 = new Thread(new TareaRunnable("Robot A"));
        Thread trabajador2 = new Thread(new TareaRunnable("Robot B"));
        trabajador1.start();
        trabajador2.start();

        
        System.out.println("Ejercicio 2.1 ");
        Contador miContadorAnon = new Contador();
        new Thread(new TareaSumar(miContadorAnon)).start();
        new Thread(new TareaSumar(miContadorAnon)).start();

        
        System.out.println(" Ejercicio 3.1 (Método Sincronizado)");
        ContadorMetodo miContadorMetodo = new ContadorMetodo();
        new Thread(new TareaSumarMetodo(miContadorMetodo)).start();
        new Thread(new TareaSumarMetodo(miContadorMetodo)).start();

        
        System.out.println(" Lanzando Ejercicio 3.2 (Bloque Sincronizado)");
        ContadorBloque miContadorBloque = new ContadorBloque();
        new Thread(new TareaSumarBloque(miContadorBloque)).start();
        new Thread(new TareaSumarBloque(miContadorBloque)).start();

        System.out.println(" Ejercicio 4.1 (Prioridades)");
        Thread p1 = new Thread(new TareaIdentidad(), "Baja Prioridad");
        Thread p10 = new Thread(new TareaIdentidad(), "Alta Prioridad");
        p1.setPriority(1);
        p10.setPriority(10);
        p1.start();
        p10.start();

        System.out.println(" Ejercicio 4.2 (Espera e Interrupción)");

        Runnable tareaLarga = () -> {
            try {
                Thread.sleep(5000); // Duerme 5 segundos
                System.out.println("Hilo Secundario 4.2: Terminé mi tarea larga con éxito");
            } catch (InterruptedException e) {
                System.out.println("Hilo Secundario 4.2: Fui interrumpido.");
            }
        };

        Thread hiloExperimento = new Thread(tareaLarga);
        hiloExperimento.start();

        

        Thread.sleep(3000);
        System.out.println("RESULTADOS FINALES DE LOS CONTADORES ");
        System.out.println("Resultado 3.1 (Método): " + miContadorMetodo.cuenta);
        System.out.println("Resultado 3.2 (Bloque): " + miContadorBloque.cuenta);
    }
}
