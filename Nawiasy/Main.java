import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String wyrazenie = scan.nextLine();
        boolean poprawne = false;
        try {
            poprawne = Stos.sprawdzPoprawnosc(wyrazenie);
        }
        catch (PustyStos e) {
            System.out.println("Pusty stos");
        }
        catch (PelnyStos e) {
            System.out.println("Pełny stos");
        }
        catch (NiewlasciweZamkniecie e) {
            System.out.printf("NiewlasciweZamkniecie %c\n",e.getC());
        }
        catch (ZlySymbol e) {
            System.out.printf("ZlySymbol %c\n",e.getC());
        }
        catch (NiezamknietyNawias e) {
            System.out.println("NiezamknietyNawias");
        }

        if(poprawne)
            System.out.println("Wyrazenie poprawne");
        else
            System.out.println("Wyrazenie niepoprawne");
    }
}
