package ext;

import Computer.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("wsv")
public class DaoImpl2 implements IDao {
    @Override
    public double getDate() {
        System.out.println("Version Web Service");
        double data=55;
        return data;
    }
}
