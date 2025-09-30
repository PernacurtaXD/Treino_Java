package com.example.meutreino01.com.example.meutreino01;
import java.util.Scanner;

import javax.security.sasl.SaslException;

public class App 
{
    public static void main( String[] args ){
       Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Infome o número: ");
        numero = teclado.nextInt();


        if (numero > 0) {
            System.out.println("A raiz quadrada de " + numero + " é " + Math.sqrt(numero));
        }else{
        System.out.println("O número " + numero + " é inválido");
        }


       teclado.close();
    }
}
