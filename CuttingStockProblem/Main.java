import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int priceListLength = scan.nextInt();
        Pair[] priceList = new Pair[priceListLength];

        for(int i = 0; i < priceListLength; i++) {
            int length = scan.nextInt(); //dlugosci rosnaco
            int price = scan.nextInt();
            Pair pair = new Pair(length, price);
            priceList[i] = pair;
        }

        int sticksResultLength = scan.nextInt();
        int[] sticksResult = new int[sticksResultLength];

        for(int i = 0; i < sticksResultLength; i++) {
            int s = scan.nextInt();
            sticksResult[i] = s;
        }

        Sticks sticks = new Sticks(sticksResultLength, sticksResult);

        String s = scan.nextLine();
        s = scan.nextLine();
        Strategy strategy;

        if(s.equals("minimalistyczna"))
            strategy = new Minimalist(sticksResultLength);
        else if(s.equals("maksymalistyczna"))
            strategy = new Maximalist(sticksResultLength);
        else if(s.equals("ekonomiczna"))
            strategy = new Economic(sticksResultLength);
        else if(s.equals("ekologiczna"))
            strategy = new Ecologic(sticksResultLength);
        else
            assert(false);
        strategy.printAnswer();
    }
}
