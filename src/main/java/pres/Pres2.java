package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        //DaoImpl dao = new DaoImpl();
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cdao =Class.forName(daoClassName);
        IDao dao = (IDao) cdao.getConstructor().newInstance(); // <=> new DaoImpl()

        //MetierImpl metier =new MetierImpl();
        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        //metier.setDao(dao); //Statique

        //Method setDao=cMetier.getDeclaredMethod("setDao", IDao.class);
        //setDao.invoke(metier, dao); //injection des dependances dynamique

        System.out.println("RES=" +metier.calcul());

    }
}
