import java.util.ArrayList;
import java.util.List;

// Esta clase puede crear una lista de productos 
public class PedidoRefactorizado {
    private String cliente;
    private List<String> productos;
    private double total;
    
    public PedidoRefactorizado(String cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0;
    }
    
    // En este metodo añadimos un producto a la lista "productos" si se cumplen x condiciones
    // En este caso si el precio del producto añadido es mayor que 0, dicho producto se añadira a la lista llamada "productos"
    public void agregarProducto(String producto, double precio) {
        if (precio > 0 ) {
            productos.add(producto);
            total += precio;
        } else if (producto == null) {
           System.err.println("Producto no existente");
        } else {
            System.err.println("No puede haber un precio negativo");
        }
        
    }
    
    // Este metodo lo que hace es coger el resultado de la variable "total"
    // En caso de que el resultado de "total" sea mayor que 100, se le reducira un 10% al resultado
    public double calcularTotal() {
        if (total > 100) {
            return total * 0.90; // 10% de descuento si el pedido supera los 100
            } else {
            return total;
        }
    }
    
    // Este metodo nos muestra el pedido que se ha hecho
    // dandonos el nombre del cliente, la lista de productos que tiene y el valor total de la lista de productos
    public void mostrarPedido() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Productos: " + productos);
        System.out.println("Total: " + calcularTotal());
    }
}