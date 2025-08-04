import java.time.LocalDate;

public class CodificadorMedio implements Codificador {
    public String getNome() {
        return "Codificador Medio";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2004, 09, 03);
    }

    public int getNivelSeguranca(){
        return 5;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char) (c + 5));
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            encoded.append((char) (c - 5));
        }
        
        return encoded.toString();
    }
}