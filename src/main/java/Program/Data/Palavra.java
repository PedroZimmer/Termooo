package Program.Data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Palavra {

    private PalavraDAO palavra;

    public Palavra() throws IOException {
        this.palavra = new PalavraDAO();
    }

    public static boolean PalavraExiste(String palavra) throws IOException {
        ArrayList<String> palavras = PalavraDAO.getListaPalavras();
        return palavras.contains(palavra);
    }

    public String toString() {
        return palavra.toString();
    }










}
