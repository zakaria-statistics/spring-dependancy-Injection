package Computer;

public class Test {
    public static void main(String[] args) {
        UC uc=new UC();//instanciation statique
        uc.setVga(new VP());//injection via setter
        uc.printData("Bonjour");
        uc.setUsb(new Souris());
        uc.getUsb().read();



    }
}
