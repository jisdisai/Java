/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.setenciacontrol;

import java.util.Scanner;

/**
 *
 * @author ISAI
 */
public class EstacionAnio {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el mes del año:");
        int mes = scanner.nextInt();//mes del año

        String estacion = null;

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        }
        else if( mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }
        else if( mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }
        else if( mes == 9 || mes == 10 || mes == 11){
            estacion = "Otoño";
        }
        else{
            estacion = "Mes incorrecto";
        }
        
        System.out.println("estacion:" + estacion + " para el mes: " + mes);
    }
    
}
