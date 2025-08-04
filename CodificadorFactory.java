public class CodificadorFactory{

    public static Codificador createCod(int seg){
         Codificador cod;
        switch (seg){
        case 1:
            cod = new CodificadorSimples(); 
            return cod;
        case 5: 
            cod = new CodificadorMedio(); 
            return cod; 
        case 10: 
            cod = new CodificadorForte(); 
            return cod; 
        default: 
            return null; 
        }

    }
}