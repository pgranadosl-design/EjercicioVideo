/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeross;
import java.util.Scanner;
/**
 *
 * @author Paul Granados
 */
public class Numeross {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número ");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("Error: el número debe ser positivo");
        } else if (numero < 10) {
            System.out.println("El numero tiene 1 cifra");
        } else if (numero < 100) {
            System.out.println(" El numero tiene 2 cifras");
        } else if (numero < 1000) {
            System.out.println(" El numero tiene 3 cifras");
        } else {
            System.out.println("Error: el número tiene más de 3 cifras");
        }
    }
}
// cambios para el laboratorio virtual
//PRUEBA

    

