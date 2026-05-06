public class TareaHilo extends Thread {
    private String nombre;

    public TareaHilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) { 
            System.out.println("El " + nombre + " va en el número: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
