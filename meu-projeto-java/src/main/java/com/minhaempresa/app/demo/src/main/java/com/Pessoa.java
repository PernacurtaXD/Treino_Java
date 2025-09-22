package com.minhaempresa.app.demo.src.main.java.com;
import com.minhaempresa.app.demo.src.main.java.com.example.luis.Sexo;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private Sexo sexo;
    
    public Pessoa(String nome, String sobrenome, Sexo sexo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", sexo=" + sexo + "]";
    }

    
    
}
