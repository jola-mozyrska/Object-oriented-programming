import java.lang.Exception;

public class Wyjatek extends Exception{};

class WyjatekNawiasowy extends Wyjatek {};

class WyjatekStos extends Wyjatek {};

class PelnyStos extends WyjatekStos {};
class PustyStos extends WyjatekStos {};

class NiewlasciweZamkniecie extends WyjatekNawiasowy {
    char c;
    NiewlasciweZamkniecie(char c) {
        this.c = c;
    }
    char getC() {
        return c;
    }
};
class ZlySymbol extends WyjatekNawiasowy {
    char c;
    ZlySymbol(char c) {
        this.c = c;
    }
    char getC() {
        return c;
    }
};
class NiezamknietyNawias extends WyjatekNawiasowy {};




