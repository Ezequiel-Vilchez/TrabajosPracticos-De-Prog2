public class TareaSumarBloque implements Runnable {
    private ContadorBloque contador;

    public TareaSumarBloque(ContadorBloque c) {
        this.contador = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) { 
            contador.incrementar();
        }
    }
}
