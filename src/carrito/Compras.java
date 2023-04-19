/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrito;

import java.io.IOException;

public class Compras {

	public static void main(String[] args) throws IOException {
		
		
		
		Producto p1 = new Producto("Atum",150.30,001);
		Producto p2 = new Producto("Mermelada",215.30,002);
		Producto p3 = new Producto("Leche",190.80,003);

		Cliente c1 = new Cliente(266311449, "Bianca Rodriguez", "Farina 2300");
		
		Carrito carro1 = new Carrito(c1,30);
		
		ItemCarrito item[] = new ItemCarrito[3];
		item[0] = new ItemCarrito(carro1,p1,3);
		item[1] = new ItemCarrito(carro1,p3,2);
		item[2] = new ItemCarrito(carro1,p2,5);		
		
		mostrarCompra(item,carro1, c1);
	}	
 
	public static void mostrarCompra(ItemCarrito cargaItem[], Carrito carro1, Cliente c1){
		
		System.out.println("Carro: "+carro1.dameNum()+"--"+"Cliente: "+c1.dameNombre());
		for (ItemCarrito  items : cargaItem) {
			items.mostrarItem();
			carro1.sumarMonto(items);			
		}
		System.out.println("Total: "+carro1.dameMontoTotal());
                Descuento dFijo = new DescuentoFijo();
		dFijo.asignaMonto(100);
		System.out.println("Monto con descuento: "+ dFijo.montoFinal(carro1.dameMontoTotal()));
	}
 
        
        
        
}
