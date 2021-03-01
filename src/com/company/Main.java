package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int selec;
        int subtam;
        int tsc;
        String ts;
        String cadena;
        String subcadena;

        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Este programa realiza diferentes operaciones con cadenas");
        while(true) {
            System.out.println("Elija una opcion");
            System.out.println("1. Tamaño de la cadena");
            System.out.println("2. Subcadena");
            System.out.println("3. Comparacion de palabras");
            System.out.println("4. comparacion de tamaños");
            System.out.println("5. Salir");
            selec = Integer.parseInt(in.nextLine());
            if (selec == 1){
                System.out.println("Ha elegido el tamaño de la cadena");
                System.out.println("Ingrese una cadena de texto");
                ts = in.nextLine();
                System.out.println("Usted ingresó la cadena: "+ts);
                System.out.println("La cantidad de letras es de: "+ ts.length());
                System.out.println("Presione enter para continuar");
                in.nextLine();
            }else if(selec == 2){
                System.out.println("Ha elegido las subcadenas");
                System.out.println("Ingrese una cadena de caracteres");
                cadena = in.nextLine();
                tsc = cadena.length();
                System.out.println("El tamaño de la cadena es de: "+ cadena.length());
                System.out.println("Ingrese el tamaño de la subcadena");
                subtam = Integer.parseInt(in.nextLine());
                if(subtam > tsc) {
                    while (subtam > tsc) {
                        System.out.println("Se necesita que el tamaño de la subcadena sea menor que la cadena original");
                        System.out.println("Ingrese el tamaño de la subcadena");
                        subtam = Integer.parseInt(in.nextLine());
                    }
                }
                System.out.println("El tamaño de la subcadena es de:" + subtam);
                subcadena = cadena.substring(0, subtam);
                System.out.println("La cadena " + cadena + " y su subcadena " + subcadena);
                System.out.println("Presione enter para continuar");
                in.nextLine();
            }else{
                break;
            }
        }
    }
}
