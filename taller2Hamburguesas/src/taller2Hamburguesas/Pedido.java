package taller2Hamburguesas;

public class Pedido {
	//Atributos 
	private static int numeroPedidos;
	
	private int idPedido;
	
	private String nombreCliente;
	
	private String direccionCliente;
	
	//Métodos
	public Pedido(String nombreCliente, String direccionCliente) {
		numeroPedidos++;
		idPedido = numeroPedidos;
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
	}
	
	public void agregarProducto(Producto nuevoItem) {
		
	}
	
}
