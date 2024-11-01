package com.mycompany.pessoa_imc;
import java.util.Scanner;
public class Pessoa_IMC {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       pessoa p = new pessoa();
       System.out.println("Digite o seu nome ");
       String input_nome = entrada.nextLine();
       p.set_nome(input_nome);
       System.out.println("Digite o seu sobrenome ");
       String input_sobrenome = entrada.nextLine();
       p.set_sobrenome(input_sobrenome);
       System.out.println("Digite o seu peso ");
       double input_peso = entrada.nextDouble();
       p.set_peso(input_peso);
       System.out.println("Digite a sua altura ");
       double input_altura = entrada.nextDouble();
       p.set_altura(input_altura);
       double imc = p.calculoimc(input_peso, input_altura);
       p.set_imc(imc);
       p.InformaObesidade();
    }
}
