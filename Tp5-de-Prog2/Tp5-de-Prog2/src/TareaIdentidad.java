public class TareaIdentidad implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Obtenemos al hilo que está ejecutando esto y sacamos su nombre
            String nombreHilo = Thread.currentThread().getName();
            System.out.println("Soy el hilo [" + nombreHilo + "] ejecutando el paso " + i);
        }
    }
}
