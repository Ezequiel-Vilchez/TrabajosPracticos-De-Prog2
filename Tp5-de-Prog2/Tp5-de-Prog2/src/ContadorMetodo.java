public class ContadorMetodo {
    int cuenta = 0;

    
    public synchronized void incrementar() {
        cuenta++; 
    }
}