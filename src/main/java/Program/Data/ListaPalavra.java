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

//    public static String getPalavraAleatoria() throws IOException {
//
//            String filePath = "C:/#Dev/engSoftwareUniville/POO_II/Termooo/palavras.xlsx";
//            // Carregar o arquivo Excel
//            FileInputStream excelFile = new FileInputStream(filePath);
//            Workbook workbook = new XSSFWorkbook(excelFile);
//
//            // Selecionar uma planilha (assumindo que é a primeira planilha, índice 0)
//            Sheet sheet = workbook.getSheetAt(0);
//
//            // Obter o número total de linhas na planilha
//            int rowCount = sheet.getPhysicalNumberOfRows();
//
//            // Obter um número aleatório para escolher uma linha
//            Random random = new Random();
//            int randomRowIndex = random.nextInt(rowCount);
//
//            // Obter a linha selecionada aleatoriamente
//            Row randomRow = sheet.getRow(randomRowIndex);
//            Cell randomCell = randomRow.getCell(0);
//
//            return randomCell.toString();
//    }


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


    private String palavra;

    public PalavraDAO() throws IOException {
//        this.palavra = getPalavraAleatoria();
        ArrayList<String> listaPalavras = getListaPalavras();

    }

    public String toString() {
        return palavra;
    }



}
