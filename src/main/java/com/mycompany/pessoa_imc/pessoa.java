package com.mycompany.pessoa_imc;
import java.util.Scanner;
import java.lang.Math;
public class pessoa {
    private String nome;
    private String sobrenome;
    private double altura;
    private double peso;
    private double imc;
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
    public double calculoimc(double peso, double altura){
        imc = peso/Math.pow(altura, 2);
        return imc;
    }
    public void InformaObesidade(){
        if(imc < 18.5){
            System.out.println(nome + " " + sobrenome + " seu IMC e " + imc + " e voce esta abaixo do peso");
        }
        else if(imc >= 18.5 && imc <= 24.9){
            System.out.println(nome + " " + sobrenome + " seu IMC e " + imc + " e voce esta com peso normal");
        }
        else if(imc >= 25 && imc <= 29.9){
            System.out.println(nome + " " + sobrenome + " seu IMC e " + imc + " e voce esta com sobrepeso");
        }
        else if(imc >= 30 && imc <= 34.9){
            System.out.println(nome + " " + sobrenome + " seu IMC e " + imc + " e voce esta com obesidade grau 1");
        }
        else if(imc >= 35 && imc <= 39.9){
            System.out.println(nome + " " + sobrenome + " seu IMC e " + imc + " e voce esta com obesidade grau 2");
        }
        else{
            System.out.println(nome + " " + sobrenome + " seu IMC e " + imc + " e voce esta com obesidade grau 3");
        }
    }
}
