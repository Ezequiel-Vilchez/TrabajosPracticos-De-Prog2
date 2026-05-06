public class TareaSumar implements Runnable {
    private Contador contadorCompartido;

    public TareaSumar(Contador c) {
        this.contadorCompartido = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            contadorCompartido.incrementar();
        }
    }
}
