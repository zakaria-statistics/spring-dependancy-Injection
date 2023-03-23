package Computer;

public class Adapter implements VGA{
    private HDMI hdmi;

    public Adapter(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String message) {
        System.out.println("++++++++Adapter++++++");
        byte[] data = message.getBytes();
        hdmi.print(data);
        System.out.println("++++++++Adapter++++++");

    }
}
