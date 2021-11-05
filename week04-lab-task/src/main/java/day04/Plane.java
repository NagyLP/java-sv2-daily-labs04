package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private int maxCapacity;
    private List<Passanger> passangerList = new ArrayList<>();

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean addPassanger(Passanger passanger) {
        if (passangerList.size() >= maxCapacity) {
            return false;
            passangerList.add(passanger);
        }
            return true;
    }

    public int getNumberOfPackages() {
        int reply = 0;
        for (Passanger passanger : passangerList)
            reply += passanger.getPacketQual();
        return reply;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Passanger> getPassangerList() {
        return passangerList;
    }
}
