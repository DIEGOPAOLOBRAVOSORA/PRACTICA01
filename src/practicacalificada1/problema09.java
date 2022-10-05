/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicacalificada1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class problema09 {
    
public static void main(String []args){ 
Scanner dato = new Scanner(System.in); 
int c=0; int a; float m =0;
System.out.println("Ingresarantidad de atletas");
c = dato.nextInt(); String atleta[] = new String[c];
float tiempo[] = new float[c];
for( a=0;a<c;a++){ 
System.out.println("Ingres nombre del atleta");
atleta[a] = dato.next();
System.out.println("Ingrese tiempo del recorrido");
tiempo[a] = dato.nextFloat();
} 
for (int i = 1; i < tiempo.length; i++) { 
if (m > tiempo[i]) { m = tiempo[i]; 
}else{ 
m = tiempo[i]; 
System.out.println("El ganador es el atleta con el tiempo "+m); }
} 
} }

