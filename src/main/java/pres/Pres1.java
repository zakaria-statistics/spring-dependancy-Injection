package pres;

import computer.DaoImpl;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();//instanciation statique
        MetierImpl metier =new MetierImpl(dao);//injection via le constructeur
       // metier.setDao(dao);//injection des dependances
        System.out.println("RES="+metier.calcul());
    }
}
