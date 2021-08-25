package model;

public class Pessoa {
    private String nome, id;
    private Integer idade;
    private Double peso, altura, IMC;

    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, Integer idade, String id, Double peso, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public Double calcularIMC() {
        IMC = peso * altura * altura;
        if (IMC < 20) {
            return -1.0;
        } else if (IMC >= 20 && IMC <= 25) {
            return 0.0;
        } else
            return 1.0;
    }

    public boolean eMaiorDeIdade() {
        if (idade >= 18) {
            return true;
        } else
            return false;
    }

    public String toString() {
        return "Pessoa{" +
                "Nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", idade='" + idade + '\'' +
                ", peso='" + peso + '\'' +
                ", altura='" + altura + '\'' +
                '}';
    }
}
