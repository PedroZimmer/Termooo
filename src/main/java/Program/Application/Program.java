package Program.Application;

import Program.Data.Palavra;
import Program.Data.PalavraDAO;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

import static Program.Application.Rodada.testPalavra;
import static Program.Data.PalavraDAO.getPalavraAleatoria;

public class Program {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        Palavra palavra = new Palavra();

        PalavraDividida palavraDividida = new PalavraDividida(palavra);

        System.out.println("Bem vindo ao jogo Termooo!");
        System.out.println("O jogo consiste em acertar a palavra secreta, que é uma palavra de 5 letras.");
        System.out.println("Você tem 5 chances para acertar a palavra secreta.");
        System.out.println("Boa sorte!");
        System.out.println("---------------INICIO DO JOGO---------------");
        System.out.println("REGRAS:");
        System.out.println("Quando a letra estiver entre colchetes, significa que a letra está na palavra, mas não na posição correta.");
        System.out.println("Quando a letra estiver entre chaves, significa que a letra não está na palavra.");
        System.out.println(" ");
//        System.out.println("A palavra secreta é: " + palavraDividida);
        System.out.println(" ");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + "ª TENTATIVA");
            System.out.println("Digite uma palavra: ");
            String tentativa = sc.nextLine();
            if (Palavra.PalavraExiste(tentativa)) {
                if (tentativa.equals(palavra.toString())) {
                    System.out.println("Parabéns, você acertou a palavra!");
                    System.exit(0);
                } else {
//                    System.out.println("alksjdaslkdj");
                    testPalavra(tentativa, palavraDividida.getLetras());
                }
            } else {
                System.out.println("A palavra não existe!");
                i = i - 1;
            }


        }
        System.out.println("A palavra secreta é: " + palavraDividida);


    }


}
