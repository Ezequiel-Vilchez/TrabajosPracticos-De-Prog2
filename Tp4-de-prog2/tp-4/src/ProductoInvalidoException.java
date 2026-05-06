//3.2
public class ProductoInvalidoException extends RuntimeException {
    public ProductoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

class Producto {
    public Producto(double precio) {
        if (precio <= 0) {
            throw new ProductoInvalidoException("Precio inválido: " + precio);
        }
    }
}
