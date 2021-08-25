package com.company;

import model.Pessoa;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoaZero = new Pessoa();
        Pessoa pessoaUm = new Pessoa("Wes", 25, "um");
        Pessoa pessoaDois = new Pessoa("Bil", 58, "dois", 80.0, 1.72);
        //Pessoa pessoa3 = new Pessoa("wes", 25);
        //Por não existir um construtor gerado adequadamente para esse objeto na casse Pessoa, ocorre um erro





        //Análise das variáveis imc e maiorDeIdade

        double imc = pessoaDois.calcularIMC();

        if (imc == -1){
            System.out.println("Baixo peso");
        }else if(imc == 0){
            System.out.println("Peso saudável");
        }else {
            System.out.println("Sobrepeso");
        }

        boolean maiorDeIdade = pessoaDois.eMaiorDeIdade();

        if (maiorDeIdade){
            System.out.println("É maior de idade");
        }else {
            System.out.println("Não é maior de idadhe");
        }

        //Imprimindo dados da pessoa
        String dataShow = pessoaDois.toString();
        System.out.println(pessoaDois);
    }
}