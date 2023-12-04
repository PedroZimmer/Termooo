package Program.Application;

import java.util.ArrayList;

public class Rodada {

    public static void testPalavra(String tentativa, ArrayList<String> palavra) {

        String[] tentativaDividida = tentativa.split("");

        for (int i = 0; i < tentativaDividida.length; i++) {
            if (tentativaDividida[i].equals(palavra.get(i))) {
                System.out.print(tentativaDividida[i]);
            } else {
                if (palavra.contains(tentativaDividida[i]) ){
                    System.out.print("[" + tentativaDividida[i] + "]");
                }
                else {
                    System.out.print("{" + tentativaDividida[i] + "}");
                }
            }
        }

        System.out.println(" ");
    }



    public void printTentativa() {



    }


}
