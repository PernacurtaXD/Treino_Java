package com.example.meuorgulho;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ){
        Scanner teclado = new Scanner(System.in);
        int number;

        System.out.println("Digite o número: ");
        number = teclado.nextInt();


        if (number % 2 == 0) {
            System.out.println("O número " + number + " é par");
        }else{
            System.out.println("O número " + number + " é impar");
        }



        teclado.close();
    }
}
