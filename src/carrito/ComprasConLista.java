/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComprasConLista {

    public static void main(String[] args) throws IOException {

        Producto p1 = new Producto("Atum", 150.30, 001);
        Producto p2 = new Producto("Mermelada", 215.30, 002);
        Producto p3 = new Producto("Leche", 190.00, 003);
        Producto p4 = new Producto("Azucar", 21.30, 002);
        Producto p5 = new Producto("Arroz", 19.80, 003);
        Producto p6 = new Producto("Harina", 195.1, 003);

        Cliente c1 = new Cliente(266311449, "Bianca Rodriguez", "Farina 2300");

        Carrito carro1 = new Carrito(c1, 30);

        List<ItemCarrito> itemListaC;

        itemListaC = new ArrayList<ItemCarrito>();

        ItemCarrito item1 = new ItemCarrito(carro1, p1, 3);

        ItemCarrito item2 = new ItemCarrito(carro1, p3, 2);

        ItemCarrito item3 = new ItemCarrito(carro1, p2, 5);

        ItemCarrito item4 = new ItemCarrito(carro1, p4, 1);

        ItemCarrito item5 = new ItemCarrito(carro1, p5, 2);

        ItemCarrito item6 = new ItemCarrito(carro1, p6, 3);

        itemListaC.add(item1);

        itemListaC.add(item2);

        itemListaC.add(item3);

        itemListaC.add(item4);

        itemListaC.add(item5);

        itemListaC.add(item6);

        Iterator<ItemCarrito> itC = itemListaC.iterator();

        while (itC.hasNext()) { 
            ItemCarrito item = itC.next();

            item.mostrarItem();

        }

        
        
        
    }

}



