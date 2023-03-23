package computer;

public class Souris implements USB{
    @Override
    public int read() {
        System.out.println("je suis une souris");
        return (int) (Math.random()*100);
    }
}
