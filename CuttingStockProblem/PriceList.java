public class PriceList {
    int priceListLength;
    Pair[] priceList;
    static int id;

    public void priceList(int priceListLength, Pair[] priceList) {
        this.priceListLength = priceListLength;
        this.priceList = priceList;
        this.id = -1;
    }

    public Pair getMxStick() {
        if(id == -1)
            id = priceListLength-1;
        else
            id--;

//        if(id < 0)
//            return Null; co wtedy
        return priceList[id];
    }

    public Pair getMinStick() {
        if(id == -1)
            id = 0;
        else
            id++;

//        if(id > priceListLength - 1)
//            return Null; co wtedy
        return priceList[id];
    }

}
