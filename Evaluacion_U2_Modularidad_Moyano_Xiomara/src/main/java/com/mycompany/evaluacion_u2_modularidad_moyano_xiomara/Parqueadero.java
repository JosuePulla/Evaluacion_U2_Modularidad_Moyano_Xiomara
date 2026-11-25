// 4. Parqueadero (6 pts). Escribe leerMinutos(Scanner sc) (valida 1–1440), horasCobradas(int
// minutos) (la fracción de hora se cobra completa) y tarifa(int horas, char tipo) (auto $1,00 la hora;
// moto $0,50; más de 8 horas: 20 % de descuento). El main lee los datos y muestra horas y total. Prueba: 125
// min, auto → 3 h, $3,00; 600 min, moto → 10 h, $4,00.

package com.mycompany.evaluacion_u2_modularidad_moyano_xiomara;

import java.util.Scanner;

public class Parqueadero {

   
    public static int leerMinutos(Scanner sc) {
        int minutos;

        do {
            System.out.print("Ingrese los minutos: ");
            minutos = sc.nextInt();

            if (minutos < 1 || minutos > 1440) {
                System.out.println("Error: ingrese un valor entre 1 y 1440.");
            }

        } while (minutos < 1 || minutos > 1440);

        return minutos;
    }

   
    public static int horasCobradas(int minutos) {
        return (minutos + 59) / 60;
    }

   
    public static double tarifa(int horas, char tipo) {
        double precioHora;

        if (tipo == 'A' || tipo == 'a') {
            precioHora = 1.00;
        } else {
            precioHora = 0.50;
        }

        double total = horas * precioHora;

      
        if (horas > 8) {
            total = total * 0.80;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutos = leerMinutos(sc);

        System.out.print("Tipo de vehículo (A = Auto, M = Moto): ");
        char tipo = sc.next().charAt(0);

        int horas = horasCobradas(minutos);
        double total = tarifa(horas, tipo);

        System.out.println("\n--- RECIBO DE PARQUEADERO ---");
        System.out.println("Minutos: " + minutos);
        System.out.println("Horas cobradas: " + horas);
        System.out.printf("Total a pagar: $%.2f%n", total);

        sc.close();
    }
}
