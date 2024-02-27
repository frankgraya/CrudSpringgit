package com.example.demo;

import lombok.NonNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.logging.SocketHandler;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        int[] numeros = {10, 20, 30, 40, 50};

        // Mostrar los números del arreglo
        System.out.println("Números en el arreglo:");
        for (int numero : numeros) {

            System.out.println(numero);
        }

    }

    public static String nombre(String nombre){
        System.out.println("hola" + 1+nombre);

        return nombre;
    }

    public static int sumaElementos(int[] arreglo){
        int suma = 0;
        for (int elemento : arreglo){
            suma += elemento;
        }
        return suma;
    }

    public static int multplicarElementos(int[] arreglo){
        int multiplicacion = 0 ;
        for (int elemento : arreglo){
            multiplicacion++;
            System.out.println("muestra la suma " + multiplicacion);
            multiplicacion *= elemento;
        }
        return multiplicacion;
    }

    public static void verElementos(int[] arreglo){

        for (int elemento : arreglo) {
            int i = elemento;
            System.out.println("su elemento es " + i);
        }
    }

}
