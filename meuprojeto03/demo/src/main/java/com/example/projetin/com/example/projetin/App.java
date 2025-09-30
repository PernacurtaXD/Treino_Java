package com.example.projetin;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Carro carro = new Carro("Prisma", "Chevrolet", "RTK1563", 2019);


        System.out.println(carro.toString());
        carro.desligar();
    }
}
