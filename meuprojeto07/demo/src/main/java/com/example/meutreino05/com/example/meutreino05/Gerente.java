package com.example.meutreino05;

public class Gerente extends Funcionario{

    

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {

    return salarioBase + (salarioBase * 0.30);
    }



    
 @Override
    public String toString() {
        return "\nGerente" + super.toString();
    }

    
}
