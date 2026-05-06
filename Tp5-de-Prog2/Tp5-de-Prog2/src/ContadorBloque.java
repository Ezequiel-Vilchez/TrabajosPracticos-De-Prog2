public class ContadorBloque {
    int cuenta = 0;

    public void incrementar() {
        
        synchronized(this) {
            cuenta++;
        }
    }
}