package com.example.meutreino;
import java.util.Scanner;

public class Main02 
{
    public static void main( String[] args ){
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = teclado.nextInt();


        System.out.println("Digite o segundo número: ");
        num2 = teclado.nextInt();


        if (num1 > num2) {
            System.out.println("O primeiro número digitado é maior que o segundo número.");
        }else if(num1 == num2){
            System.out.println("O primeiro número e o segundo número são iguais.");
        }else{
            System.out.println("O segundo número digitado é maior que o primeiro número.");
        }


        teclado.close();
    }
}
