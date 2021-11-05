package day04;

public class Passanger {

    private String name;
    private String passId;
    private int packetQual;


    public Passanger(String name, String passId, int packetQual) {
        this.name = name;
        this.passId = passId;
        this.packetQual = packetQual;
    }

     public String getName() {
        return name;
    }

    public String getPassId() {
        return passId;
    }

    public int getPacketQual() {
        return packetQual;
    }
}

