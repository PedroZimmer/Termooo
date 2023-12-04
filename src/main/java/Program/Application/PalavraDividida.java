package Program.Application;

import Program.Data.Palavra;

import java.util.ArrayList;

public class PalavraDividida {

    private String palavra;

    private ArrayList<String> letras;

    public PalavraDividida(Palavra palavra) {
//        this.letras = palavra.toString().split("");
        this.palavra = palavra.toString();
        this.letras = new ArrayList<>();
        for (int i = 0; i < this.palavra.length(); i++) {
            this.letras.add(this.palavra.substring(i, i + 1));
        }
    }

    public ArrayList<String> getLetras() {
        return letras;
    }

    public String toString() {
        return letras.toString();
    }


}
