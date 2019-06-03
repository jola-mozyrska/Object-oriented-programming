import java.util.ArrayList;
public abstract class Strategy {
//    protected int cost;
//    protected int leftover;
//    protected ArrayList<ArrayList<Integer>> dividedSticks;
//    protected boolean usedSticks[];
//    protected PriceList priceList;

//    Sticks sticks;

    public Strategy()//{int sticksResultLength, Sticks sticks, PriceList priceList) {
//        this.cost = 0;
//        this.leftover = 0;
//        this.dividedSticks = new ArrayList<>(10);
//        this.usedSticks = new boolean[sticksResultLength];
//        this.sticks = sticks;
//        this.priceList = priceList;
    }

    public abstract void solution();

    public void printAnswer() {
        System.out.print(cost + "\n" + leftover + "\n");
        for(int i = 0; i < dividedSticks.size(); i++) {
            ArrayList<Integer> current = dividedSticks.get(i);
            for (int j = 0; j < current.size(); j++) {
                System.out.print(current.get(j) + " ");
            }
            System.out.println();
        }
    }
}
