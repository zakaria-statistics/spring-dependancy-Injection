package computer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("E")

public class Ecran implements VGA{
    @Override
    public void print(String message) {
        System.out.println("======Ecran======");
        System.out.println(message);
        System.out.println("======Ecran======");

    }
}
