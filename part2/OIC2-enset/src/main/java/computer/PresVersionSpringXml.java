package computer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresVersionSpringXml {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        UC uc=(UC) springContext.getBean("uc");
        uc.printData("Hello world");
        System.out.println(uc.readData());
    }
}
