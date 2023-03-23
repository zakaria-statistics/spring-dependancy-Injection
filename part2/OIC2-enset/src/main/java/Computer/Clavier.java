package Computer;

public class Clavier implements USB{

    @Override
    public int read() {
        System.out.println("je suis un clavier");
        return (int) (Math.random()*100);
    }

}
