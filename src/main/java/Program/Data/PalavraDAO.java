package Program.Data;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class PalavraDAO {

    public static String getPalavraAleatoria(ArrayList listaPalavras) {

        Random rand = new Random();
        int n = rand.nextInt(listaPalavras.size());

        return (String) listaPalavras.get(n);


    }

    public static ArrayList<String> getListaPalavras() throws IOException {

        String filePath = "C:/#Dev/engSoftwareUniville/POO_II/Termooo/palavras.txt";

        ArrayList<String> listaPalavras = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            // Adicionar cada palavra à lista (assumindo que as palavras estão em uma única coluna)
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


    private final String palavra;

    public PalavraDAO() throws IOException {
        this.palavra = getPalavraAleatoria(getListaPalavras());
    }

    public String toString() {
        return palavra;
    }

}
