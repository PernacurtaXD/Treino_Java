package com.example.treino;
import java.util.Scanner;


public class App {
    public static void main( String[] args ){
        Scanner teclado = new Scanner(System.in);
        float notas[] = new float[3];
        float media = 0, soma = 0;

        for(int i = 0; i < 3; i++){
            
            
            System.out.println("Digite sua " + (i+1) + "º nota:");
            notas[i] = teclado.nextFloat(); 

            soma+=notas[i];
        }
        
        media = soma / 3;

        
        for(int i = 0; i < 3; i++){
            System.out.println((i+1) + "º nota: " + notas[i]);
        } 
        System.out.println("Media: " + media%.2f);
    }
}
