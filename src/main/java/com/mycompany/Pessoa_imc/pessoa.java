package com.mycompany.Pessoa_imc;
import java.util.Scanner;
import java.lang.Math;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class pessoa {
    private String nome;
    private String sobrenome;
    private double altura;
    private double peso;
    private double imc;
    private LocalDate data_de_nascimento;
    private double idade;
    public String get_nome(){
        return nome;
    }
    public void set_nome (String nome){
        this.nome = nome;
    }
    public String get_sobrenome(){
        return sobrenome;
    }
    public void set_sobrenome (String sobrenome){
        this.sobrenome = sobrenome;
    }
    public double get_altura(){
        return altura;
    }
    public void set_altura (double altura){
        this.altura = altura;
    }
    public double get_peso(){
        return peso;
    }
    public void set_peso (double peso){
        this.peso = peso;
    }
    public double get_imc(){
        return imc;
    }
    public void set_imc (double imc){
        this.imc = imc;
    }
     public LocalDate get_data_de_nascimento(){
        return data_de_nascimento;
    }
    public void set_data_de_nascimento(LocalDate data_de_nascimento){
        this.data_de_nascimento = data_de_nascimento;
    }
    public void set_idade (double idade){
        this.idade = idade;
    }
    public double get_idade(){
        return idade;
    }
    public double calculoimc(double peso, double altura){
        imc = peso/Math.pow(altura, 2);
        return imc;
    }
    public double calcula_idade(LocalDate data_de_nascimento){
        LocalDate hoje =  LocalDate.now();
        idade = ChronoUnit.YEARS.between(data_de_nascimento, hoje);
        return idade;
    }
    public void InformaObesidade(){
        if(imc < 18.5){
            System.out.println("Nome completo: " + nome + " " + sobrenome);
            System.out.println("Nome de referencia : " + sobrenome + " " + nome.toUpperCase());
            System.out.println("Idade: " + idade);
            System.out.println("Peso : " + peso);
            System.out.println("Altura : " + altura);
            System.out.println("IMC: " + imc);
            System.out.println("Classificacao: abaixo do peso");
        }
        else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Nome completo: " + nome + " " + sobrenome);
            System.out.println("Nome de referencia : " + sobrenome + " " + nome.toUpperCase());
            System.out.println("Idade: " + idade);
            System.out.println("Peso : " + peso);
            System.out.println("Altura : " + altura);
            System.out.println("IMC: " + imc);
            System.out.println("Classificacao: peso normal");        
        }
        else if(imc >= 25 && imc <= 29.9){
            System.out.println("Nome completo: " + nome + " " + sobrenome);
            System.out.println("Nome de referencia : " + sobrenome + " " + nome.toUpperCase());
            System.out.println("Idade: " + idade);
            System.out.println("Peso : " + peso);
            System.out.println("Altura : " + altura);
            System.out.println("IMC: " + imc);
            System.out.println("Classificacao: sobrepeso");
        }
        else if(imc >= 30 && imc <= 34.9){
            System.out.println("Nome completo: " + nome + " " + sobrenome);
            System.out.println("Nome de referencia : " + sobrenome + " " + nome.toUpperCase());
            System.out.println("Idade: " + idade);
            System.out.println("Peso : " + peso);
            System.out.println("Altura : " + altura);
            System.out.println("IMC: " + imc);
            System.out.println("Obesidade grau 1");
        }
        else if(imc >= 35 && imc <= 39.9){
            System.out.println("Nome completo: " + nome + " " + sobrenome);
            System.out.println("Nome de referencia : " + sobrenome + " " + nome.toUpperCase());
            System.out.println("Idade: " + idade);
            System.out.println("Peso : " + peso);
            System.out.println("Altura : " + altura);
            System.out.println("IMC: " + imc);
            System.out.println("Classificacao: obesidade grau 2");
        }
        else{
            System.out.println("Nome completo: " + nome + " " + sobrenome);
            System.out.println("Nome de referencia : " + sobrenome + " " + nome.toUpperCase());
            System.out.println("Idade: " + idade);
            System.out.println("Peso : " + peso);
            System.out.println("Altura : " + altura);
            System.out.println("IMC: " + imc);
            System.out.println("Classificacao: obesidade grau 3");
        }
    }
}
