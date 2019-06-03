import java.lang.Exception;
import java.lang.String;

public class Stos {
    public char[]elem;
    private int liczbaElem;

    public boolean czyPelny() {
        if(this.elem.length == liczbaElem)
            return true;
        return false;
    }

    public Stos(int rozmiar) {
        elem = new char[rozmiar];
        liczbaElem = 0;
    }

    public boolean czyPusty() {
        if(liczbaElem == 0)
            return true;
        return false;
    }

    public char pop() {
        char c = elem[--liczbaElem];
        elem[liczbaElem] = 0;
        return c;
    }

    public void push(char c) {
        this.elem[liczbaElem] = c;
        liczbaElem++;
    }

    static public boolean sprawdzPoprawnosc(String wyrazenie) throws PustyStos, PelnyStos, NiewlasciweZamkniecie,
            ZlySymbol, NiezamknietyNawias{
        Stos stos = new Stos(10);
        for(int i = 0; i < wyrazenie.length(); i++) {
            char c = wyrazenie.charAt(i);

            if(c == ')') {
                if(stos.czyPusty()) {
                    throw new PustyStos();
                }
                char top = stos.pop();
                if(top == '[') {
                    throw new NiewlasciweZamkniecie(c);
                }
            }

            else if(c == ']') {
                if(stos.czyPusty()) {
                    throw new PustyStos();
                }

                int top = stos.pop();
                if(top == '(') {
                    throw new NiewlasciweZamkniecie(c);
                }
            }

            else if(c != '(' && c != '[')
                throw new ZlySymbol(c);
            if(c == '(' || c == '[') {
                if(stos.czyPelny())
                    throw new PelnyStos();
                stos.push(c);
            }
        }
        if(!stos.czyPusty()) {
            throw new NiezamknietyNawias();
        }
        return true;
    }

}
