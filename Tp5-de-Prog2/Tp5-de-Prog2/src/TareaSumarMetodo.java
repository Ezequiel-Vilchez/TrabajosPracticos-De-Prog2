public class TareaSumarMetodo implements Runnable {
    private ContadorMetodo contador;

    public TareaSumarMetodo(ContadorMetodo c) {
        this.contador = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) { 
            contador.incrementar();
        }
    }
}
