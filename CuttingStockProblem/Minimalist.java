public class Minimalist extends Strategy {

    public Minimalist(int sticksResultLength) {
        super(sticksResultLength);
    }

    static public void reverse() {
        Pair[] x = this.priceList;
        Pair[] d = new Pair[x.length];

        for (int i = 0; i < x.length; i++) {
            d[i] = x[x.length - 1 -i];
        }
        this.priceList = d;
    }

    public void solution(){

    }
}
