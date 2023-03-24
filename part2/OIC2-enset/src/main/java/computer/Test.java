package computer;

public class Test {
    public static void main(String[] args) {
        UC uc=new UC(new VP(), new Souris());//instanciation statique

        uc.printData("Bonjour");

        uc.getUsb().read();



    }
}
