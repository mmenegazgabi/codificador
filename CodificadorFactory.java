public class CodificadorFactory {
    public Codificador getCodificador(int nivelSeguranca) {
        switch(nivelSeguranca) {
            case 1:
                return new CodificadorSimples();
            case 5:
                return new CodificadorMedio();
            case 10:
                return new CodificadorForte();
            default:
                throw new IllegalArgumentException("Nível de segurança inválido: " + nivelSeguranca);
        }
    }
}