/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author pascu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PedidoRefactorizado pedido = new PedidoRefactorizado("Carlos");
        
        pedido.agregarProducto("Smartphone", 500);
        pedido.agregarProducto("auriculares", 50);
        pedido.agregarProducto("cargador", 20);
        
        pedido.mostrarPedido();
    }
    
}
