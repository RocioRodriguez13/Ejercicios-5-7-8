/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrito;

/**
 *
 * @author rocio r
 */
public class ItemCarrito {
	
	private Carrito carro;
	private Producto prod;
	private int cantidad;
	private double montoItem;
	
	public ItemCarrito(Carrito num, Producto p, int cantidad) {
		carro= num;
		prod = p;
		this.cantidad=cantidad;
		montoItem= prod.un_precio() * cantidad;	
	}
	public double dameMontoItem() {
		return montoItem;
	}
	public void mostrarItem() {
		System.out.println("Prod: "+ prod.un_nombre()+"--"+"Cant: " +cantidad+"--"+ "Precio: "
	+prod.un_precio()+"Sub Total: "+ montoItem);
	}

}
