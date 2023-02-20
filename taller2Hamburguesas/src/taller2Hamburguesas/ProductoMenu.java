package taller2Hamburguesas;

public class ProductoMenu {
	
	//Atributos
	private String nombre;
	
	private int precioBase;
	
	//Métodos
	public ProductoMenu(String nombre, int precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPrecio() {
		return precioBase;
	}
	
	public String generarTextoFactura() {
		return nombre + "  $" + precioBase;
	}
	
}
