public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(SistemaGestor.MAX_CONEXIONES);

        SistemaGestor sistema = new SistemaGestor();
        sistema.iniciarSistema();

        CuentaBancaria cuenta = new CuentaBancaria(1000, 12345);
        System.out.println("Saldo: " + cuenta.getSaldo());
        cuenta.Depositar(500);
        System.out.println("Saldo despues del deposito: " + cuenta.getSaldo());

        System.out.println("-----------------------------");

        CuentaBancaria cuenta2 = new CuentaBancaria(2000, 67890);
        System.out.println("Saldo: " + cuenta2.getSaldo());
        cuenta2.Depositar(-1);
        System.out.println("Saldo despues del deposito: " + cuenta2.getSaldo());

        System.out.println("-----------------------------");
        Reporte repo = new Reporte();

        repo.generarEncabezado();

        repo.obtenerCuerpo();

        repo.procesarSecciones("Matematicas", "Programacion", "Web1");
        
        System.out.println("---------------------------------------------------------------");


        Usuario p2 = new Usuario("Ezequiel");
        System.out.println("Nombre: " + p2.getNombre());

        Usuario p3 = new Usuario("Jose", 32);
        System.out.println("Nombre: " + p3.getNombre() + " Edad: " + p3.getEdad());

        p3.actualizarPerfil("Jose921@gmial.com");
        p3.actualizarPerfil("JJose111@gmial.com", 256496502);
        System.out.println("---------------------------------------------------------------");
    }
}
