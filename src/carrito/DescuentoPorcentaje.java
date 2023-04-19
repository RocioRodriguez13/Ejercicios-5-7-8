/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrito;

/**
 *
 * @author rocio r
 */
public class DescuentoPorcentaje extends Descuento {
	
	public double montoFinal(double montoInicial) {
		return montoInicial - (montoInicial * this.dameMonto()/100);
	}

}
