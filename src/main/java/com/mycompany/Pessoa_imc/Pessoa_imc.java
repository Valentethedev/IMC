package com.mycompany.Pessoa_imc;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Pessoa_imc {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        pessoa p[] = new pessoa[10];
        for(int i = 0; i < p.length; i++){
            p[i] = new pessoa();
        }
        for (int i = 0; i < p.length; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1));
            String input_nome = entrada.next();
            p[i].set_nome(input_nome);
            System.out.println("Digite o sobrenome da pessoa " + (i + 1));
            String input_sobrenome = entrada.next();
            p[i].set_sobrenome(input_sobrenome);
            System.out.println("Digite a data de nascimento da pessoa " + (i + 1) + " no formato dd/MM/yyyy");
            String nascimento = entrada.next();
            LocalDate data_nascimento = LocalDate.parse(nascimento, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            p[i].set_data_de_nascimento(data_nascimento);
            p[i].calcula_idade(p[i].get_data_de_nascimento());
            System.out.println("Digite a altura da pessoa " + (i + 1));
            double input_altura = entrada.nextDouble();
            p[i].set_altura(input_altura);
            System.out.println("Digite o peso da pessoa " + (i + 1));
            double input_peso = entrada.nextDouble();
            p[i].set_peso(input_peso);
            double imc = p[i].calculoimc(input_peso, input_altura);
            p[i].set_imc(imc);
            p[i].InformaObesidade();
        }
    }
}
