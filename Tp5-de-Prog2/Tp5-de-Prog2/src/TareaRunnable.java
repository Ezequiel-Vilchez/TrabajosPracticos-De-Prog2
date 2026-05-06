public class TareaRunnable implements Runnable {
    private String nombre;

    public TareaRunnable(String nombre) {
        this.nombre = nombre;
    }

    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("El " + nombre + " (Runnable) contando: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
