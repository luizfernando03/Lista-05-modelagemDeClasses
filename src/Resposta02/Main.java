package Resposta02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        p1.apresentar();

        System.out.println("Deseja sabe qual o seu crescimento :");
        String usuario = input.next();
        if (usuario.equalsIgnoreCase("S")){
            p1.crescer();
        }else{
            System.out.println("Agradecemos a preferencia");
        }

    }
}
