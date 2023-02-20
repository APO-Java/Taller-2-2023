package taller2Hamburguesas;

import java.util.LinkedList;

public class Restaurante {
	private LinkedList<Pedido> pedidos = new LinkedList<Pedido>();
	
	private Pedido pedidoEnCurso;
	
	public Restaurante() {
	}
	
	public void iniciarPedido(String nombreCliente, String direccionCliente) {
		pedidoEnCurso = new Pedido(nombreCliente,direccionCliente);
		pedidos.add(pedidoEnCurso);
	}
}
