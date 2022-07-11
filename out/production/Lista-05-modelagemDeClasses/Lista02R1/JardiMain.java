package Lista02R1;

import java.util.Scanner;

public class JardiMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos metros de grama deseja ?");
        int metrosGrama = input.nextInt();
        input.close();
        Jardim jardim = new Jardim(metrosGrama);
        System.out.println("A quantidade de adubo : " + jardim.usarAdubo());
        System.out.println("o preço do adubo é: R$" + jardim.precoCorteGrama());
        System.out.println("O preço co corte da grama é: " + jardim.precoCorteGrama());

    }

}
