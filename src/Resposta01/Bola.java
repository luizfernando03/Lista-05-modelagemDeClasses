package Resposta01;

import java.util.Scanner;

public class Bola {

    double circuferencia ;
    String cor ;
    String marca ;
    Double velocidade ;
    String material ;

    public Bola(double circuferencia, String cor, String marca, Double velocidade, String material) {
        this.circuferencia = circuferencia;
        this.cor = "cinza";
        this.marca = "penalty";
        this.velocidade = velocidade;
        this.material = material;
    }

    public Bola() {
        this.circuferencia = circuferencia;
        this.cor = "cinza";
        this.marca = "penalty";
        this.velocidade = velocidade;
        this.material = material;

    }

    public String mostraCor() {
        System.out.println(cor);
        return cor;


    }

    public void trocaCor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma cor");
        cor = input.next();
        System.out.println("A cor de sua bola agora é " + cor);

    }
}