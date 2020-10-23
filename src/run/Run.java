/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.util.Scanner;
import Calculadora.*;

/**
 *
 * @author jes
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0; //Guardaremos la opcion del usuario
        int numero1;
        int numero2;

        while (!salir) {
            System.out.println("Ingrese la opcion que desea:");
            System.out.println("1. Sumar");
            System.out.println("0. Salir");
            opcion = sn.nextInt();
            switch (opcion) {
                case 0:
                    salir=true;
                    break;
                case 1:
                    System.out.println("Ingrese numero 1:");
                    numero1 = sn.nextInt();
                    System.out.println("Ingrese numero 2:");
                    numero2 = sn.nextInt();
                    System.out.println("El resultado es:" + Calculadora.sumar(numero1, numero2) + "\n\n");
            }
        }
        System.out.println("-----------------ADIOS---------------------");
    }

}
