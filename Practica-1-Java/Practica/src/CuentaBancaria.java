public class CuentaBancaria {
    private int Saldo;
    private int NumeroCuenta;

    public CuentaBancaria(int Saldo, int NumeroCuenta){
        this.Saldo = Saldo;
        this.NumeroCuenta = NumeroCuenta;
    }
    public int getSaldo(){
        return this.Saldo;
    }
    public int getNumeroCuenta(){
        return this.NumeroCuenta;
    }
    public void setSaldo(int Saldo){
        this.Saldo = Saldo;
    }
    public void setNumeroCuenta(int NumeroCuenta){
        this.NumeroCuenta = NumeroCuenta;
    }
    public void Depositar(double monto){
        if (monto > 0) {
            this.Saldo += monto;
        }else{
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }   
    }

}
