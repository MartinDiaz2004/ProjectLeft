package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*

        System.out.println("Martin Maximiliano Diaz Vilchis");

        int miEntero = 10; //VALOR ENTERO

        float miPuntoFlotante =0.5f; //CALCULOS ARITMETICOS

        double miDecimal = 22.5; //NUMEROS DECIMALES

        String miTexto = "hola soy tu texto java"; //CADENA DE TEXTO

        char miCaracter ='a'; //guardar caracter

        Sc
        Scanner scanner1 = new Scanner(System.in);
        int numero;
        numero = miscanner.nextInt();

        System.out.println(" Mi numero que que he ingresado es "+ numero); */

 //suma de dos numeros
       /* Scanner scanner1 = new Scanner(System.in);
        int numero1;
        int numero2;
        int resultado;

        numero1 = scanner1.nextInt();
        numero2 = scanner1.nextInt();

        resultado = numero1+numero2;

        System.out.println(" el resultado de la suma es "+resultado); /*



        //desarrollar un programa que le pida a el usuario nombre y fecha de nacimiento su edad su peso y su altura y que calcula ims

//ims peso  /altura * altura que muestre una ficha de datos

        */
        /*
        System.out.println("Ingrese los datos  ");
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int edad;
        double altura;
        double peso;
        double imc;

        nombre = scanner.nextLine();
        edad = scanner.nextInt();
        altura = scanner.nextDouble();
        peso = scanner.nextDouble();

        imc = peso/ Math.pow(altura,2);

        System.out.println(" el nombre es "+nombre);
        System.out.println("la edad es"+edad);
        System.out.println("la peso es"+peso);
        System.out.println("la altura es"+altura);
        System.out.println(" el imc es "+imc);


        //desarrollar un programa que le pida al usuario nombre , apellido ,su domicilio , cuanto contizo en 2022 y cuanto impuesto va a pagar. declarar constatnte de isr



         */
/*
        System.out.println("Ingrese los datos  ");
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String apellido;
        String domicilio;
        double  contizacion;
        final double isr = 0.12;
        double impuestoApagar;

        nombre= scanner.nextLine();
        apellido= scanner.nextLine();
        domicilio = scanner.nextLine();
        contizacion = scanner.nextDouble();
        impuestoApagar = scanner.nextDouble();

        impuestoApagar = contizacion*isr;

        System.out.println(" el nombre es "+nombre);
        System.out.println("la apellido es"+apellido);
        System.out.println("la domicilio es"+domicilio);
        System.out.println("la cotizacion es"+contizacion);
        System.out.println(" el isr es "+impuestoApagar);



 */
        //1=pedir a el usuario nombre , apellido ;domicilo , precio de su carro
        //2= calcular impuesto de  tenencia ( 1.3%)

        System.out.println("ingrese los datos de propietario porfavor");
        Scanner sacnner = new Scanner(System.in);

        String nombre;
        String apellido;
        String domicilio;
        double costocarro;
        final double tenencia = 0.013;
        double total;

        nombre = sacnner.nextLine();
        apellido= sacnner.nextLine();
        domicilio = sacnner.nextLine();
        costocarro =sacnner.nextDouble();


        total =costocarro*tenencia;

        System.out.println(" el nombre es "+nombre);
        System.out.println(" el apellido es "+apellido);
        System.out.println(" el domicilo es "+domicilio);
        System.out.println(" el costocarro es "+costocarro);
        System.out.println("la tenencia "+ total );


    }

}