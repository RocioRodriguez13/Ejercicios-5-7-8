/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrito;

/**
 *
 * @author rocio r
 */
public class Cliente {
	private int dni;
	private String nombre;
	private String dire;
	
	public Cliente(int dni, String nom, String dire) {
		this.dni= dni;
		nombre = nom;
		this.dire = dire;		
	}
	public int dameDni() {
		return dni;
	}
	public String dameNombre() {
		return nombre;
	}
	public String dameDire() {
		return dire;
	}

}

