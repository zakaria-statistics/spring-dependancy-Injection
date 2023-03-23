package computer;

public class Adapter implements VGA{
    private HDMI hdmi;

    public Adapter(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    public HDMI getHdmi() {
        return hdmi;
    }

    @Override
    public void print(String message) {
        System.out.println("++++++++Adapter++++++");
        byte[] data = message.getBytes();
        hdmi.print(data);
        System.out.println("++++++++Adapter++++++");

    }
}
