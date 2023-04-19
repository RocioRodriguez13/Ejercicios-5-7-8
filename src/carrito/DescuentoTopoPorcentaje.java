/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrito;

/**
 *
 * @author rocio r
 */
public class DescuentoTopoPorcentaje extends Descuento {

	public double montoFinal(double montoInicial) {
		 double tope = montoInicial - (montoInicial * this.dameMonto()/100);
		 if (tope > 500) {
			 return 500;
		 }
		 else 
		 return tope;
	}

}