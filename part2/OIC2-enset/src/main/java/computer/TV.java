package computer;

public class TV implements HDMI{
    public TV() {
    }

    @Override
    public void print(byte[] data) {
        System.out.println("-------TV--------");
        String message = new String(data);
        System.out.println(message);
        System.out.println("-------TV--------");
    }
}
