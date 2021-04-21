/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2.pkg1horario;
import java.util.Scanner;
/**
 *
 * @author Adrian Quej
 */
public class Actividad21Horario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
       int hora;
       System.out.println("Este es el horario de Adrian Quej del día martes");
       Scanner miConsola = new Scanner(System.in);
        System.out.println("Escribe una hora del día entre las 0 y 24 horas para mostrar el horario");
        hora = miConsola.nextInt();
        
        switch(hora){
        
            case 0,1,2,3,4,5,6:
                System.out.println("Dormir");
                break;
            case 7,8:
                System.out.println("Desayunar");
                break;
            case 9,10:
                System.out.println("Clase de Física");
                break;
            case 11,12:
                System.out.println("Clase de Ingles");
                break;
            case 13,14:
                System.out.println("Clase de Organización Computacional");
                break;
            case 15:
                System.out.println("Hora de Comer");
                break;
            case 16,17:
                System.out.println("Hacer tarea");
                break;
            case 18:
                System.out.println("Bañarse");
                break;
            case 19,20:
                System.out.println("Clase de Lenguaje de Programación I");
                break;
            case 21:
                System.out.println("Hora de cenar");
                break;
            case 22,23,24:
                System.out.println("Tiempo de esparcimiento");
                break;
            default :
                if (hora>24 || hora<0) {
                    System.out.println("Se debe escribir una hora entre 0 y 24");
                }
    }
    
}
}
