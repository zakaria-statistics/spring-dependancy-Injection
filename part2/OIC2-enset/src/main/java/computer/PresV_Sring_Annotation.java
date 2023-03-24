package computer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresV_Sring_Annotation {
    public static void main(String[] args) {

        ApplicationContext springContext=new AnnotationConfigApplicationContext("computer");
        UC uc=springContext.getBean(UC.class);
        uc.printData("Hi everyone!");
        System.out.println(uc.readData());
    }
}
