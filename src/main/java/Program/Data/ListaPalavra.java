package Program.Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ListaPalavra {


    public static ArrayList<String> getListaPalavras() throws IOException {

        String filePath = "C:/#Dev/engSoftwareUniville/POO_II/Termooo/palavras.txt";

        ArrayList<String> listaPalavras = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            listaPalavras.add(line);
        }

        return listaPalavras;
    }

    public static void imprimirLista() throws IOException {
        ArrayList<String> listaPalavras = getListaPalavras();
        for (String palavra : listaPalavras) {
            System.out.println(palavra);
        }
    }


    public ListaPalavra() throws IOException {
        ArrayList<String> listaPalavras = getListaPalavras();

    }


}
