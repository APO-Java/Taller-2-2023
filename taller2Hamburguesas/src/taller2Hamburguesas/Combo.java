package taller2Hamburguesas;

import java.util.LinkedList;

public class Combo {
	private double descuento;
	
	private String nombreCombo;
	
	private LinkedList<Producto> itemsCombo = new LinkedList<Producto>();
	
	public Combo(String nombre, double descuento) {
		this.descuento = descuento;
		nombreCombo = nombre;
	}
	
	public String getNombre() {
		return nombreCombo;
	}
	
	public void agregarItemCombo(Producto itemCombo) {
		itemsCombo.add(itemCombo);
	}
	
	public int getPrecio() {
		int precio = 0;
		for (int i = 0; i < itemsCombo.size(); i++) {
			precio += itemsCombo.get(i).getPrecio();
		}
		precio = (int) (precio*(1-descuento));
		return precio;
	}
	
	public String generarTextoFactura() {
		return nombreCombo + "  $" + getPrecio();
	}
}
