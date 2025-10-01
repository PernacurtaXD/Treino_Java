package com.example.meutreino05;

public class Vendedor extends Funcionario{
    private double vendas;

    public Vendedor(String nome, double salarioBase, double vendas) {
        super(nome, salarioBase);
        this.vendas = vendas;
    }

    @Override
    public double calcularSalarioFinal() {
       
        return salarioBase + (vendas * 0.10);
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        return "Vendedor \nVendas: R$ " + vendas ;
    }

    
    
    
}
