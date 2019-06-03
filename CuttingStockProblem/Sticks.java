import java.util.Vector;
public class Sticks {

    public int  sticksResultLength;
    private int[] sticksResult;//rosnaco
    private static int id;

    public int getMinStick() {
        if(id == -1)
            id = 0;
        else
            id++;

        if(id > sticksResultLength - 1)
            return -1; //gdy od skoczyla nam sie lista
        return sticksResult[id];
    }

    public Sticks(int sticksResultLength, int[] sticksResult) {
        this.sticksResultLength = sticksResultLength;
        this.sticksResult = sticksResult;
    }

}
