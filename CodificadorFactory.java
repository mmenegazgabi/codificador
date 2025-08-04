import Codificador; 
import CodificadorSimples;
import CodificadorMedio; 
import CodificadorForte; 
public class CodificadorFactory{

    public static Codificador createCod(int seg){
         Codificador cod;
        swich (seg){
        case 1:
            cod = new CodificadorSimples(); 
            return cod;
        case 5: 
            cod = new CodificarMedio(); 
            return cod; 
        case 10: 
            cod = new CodificadorForte(); 
            return cod; 
        default: 
            return null; 
        }

    }
}