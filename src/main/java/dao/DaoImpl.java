package Computer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("bd")
public class DaoImpl implements IDao{

    @Override
    public double getDate() {
        System.out.println("Version base de donnees");
        double data=34;
        return data;
    }
}
