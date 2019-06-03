import java.util.Vector;

public class Maximalist extends Strategy {

    public Maximalist(int sticksResultLength, Sticks sticks, PriceList priceList) {
        super(sticksResultLength, sticks, priceList);
    }

    public void solution(){
        int idStick = sticks.sticksResultLength - 1;
        int firstToCheck = sticks.sticksResultLength - 1;
        int idPriceList = 0;
        int boughtSticks = 0;
        int lefttoBuy = sticks.sticksResultLength;

        while(lefttoBuy > 0) {
            idPriceList = 0;
            idStick = firstToCheck;
            Vector<Integer> division = new Vector<Integer>(1);
            boolean found = false;
            int rest = 0;

            while(sticksResult[idStick] == -1) {
                idStick--;
            }

            while(!found) {
                rest = priceList[idPriceList].key;
                division = new Vector<Integer>(1);
                division.add(rest);
                boolean paid = false;

                if(rest >= sticksResult[idStick]) {
                    firstToCheck = idStick-1;

                    while (idStick >= 0 && lefttoBuy > 0) { //czy patyk z cennika jest ok
                        if (sticksResult[idStick] != -1 && rest >= sticksResult[idStick]){
                            found = true;
                            division.add(sticksResult[idStick]);

                            rest -= sticksResult[idStick];

                            if (!paid) {
                                cost += priceList[idPriceList].value;
                                paid = true;
                            }

                            sticksResult[idStick] = -1;
                            lefttoBuy--;
                        }
                        idStick--;
                    }
                }
                else
                    idPriceList++;
            }

            dividedSticks.add(boughtSticks, division);
            boughtSticks++;

            idPriceList = 0;
            leftover += rest;
        }
    }
}
