package org.example;

import org.example.modelos.FechasJava;
import org.example.modelos.Vehiculo;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*Vehiculo vehiculo = new Vehiculo();

        Scanner lea = new Scanner(System.in);
        System.out.print("Digite la marca del vehiculo: ");
        vehiculo.setMarca(lea.nextLine());*/

        FechasJava fechasJava = new FechasJava();
        fechasJava.probarFechas();

        Vehiculo ferrari_f8 = new Vehiculo();

        System.out.println("Kilometraje antes de asignación " + ferrari_f8.getKilometraje());

        ferrari_f8.setKilometraje(10.0);

        System.out.println("Kilometraje despues del seteo " + ferrari_f8.getKilometraje());

        ferrari_f8.setKilometraje(-10.0);

    }
}