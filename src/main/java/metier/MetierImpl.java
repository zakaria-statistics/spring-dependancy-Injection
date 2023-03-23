package metier;


import computer.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service()
public class MetierImpl implements IMetier {


    private IDao dao; //Couplage faible en utilisant interface

    public MetierImpl(@Qualifier("wsv") IDao dao) { //injection via le constructeur
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double d=dao.getDate();
        double res=d*11.4;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
