/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicacalificada1;

/**
 *
 * @author hp
 */
public class problema08 {
    public static void main(String args[]) {

    String artefactos[] = {"Plancha", "Licuadora", "Lavadora", "Cocina"};
        double precios[] = {119.5, 216.85, 2299.00, 1699.00};
        double suma = 0;
        System.out.println("Datos del cliente");
        System.out.println("ARTEFACTOS MONTO");
        System.out.println("---------- -----");
        for (int i = 0; i < artefactos.length; i++) {
            suma += precios[i];
            System.out.println(artefactos[i] + " " + precios[i]);
        }
        System.out.println("Precio a pagar es: "+suma);
        if (suma>1200) {
            suma = suma*83/100;
            System.out.println("El descuento es aplicable y pago total es: " + suma);
        }else{
            System.out.println("No es posible aplicar el descuento y el pago total es: "+suma);
        }
}
}
