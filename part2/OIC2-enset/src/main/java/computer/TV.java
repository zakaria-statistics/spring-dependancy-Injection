package computer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository

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
