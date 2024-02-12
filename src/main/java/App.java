import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat Catbean =
                (Cat) applicationContext.getBean("cat");
        Cat Catbean2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println("HelloWorld " + (bean == bean2));
        System.out.println("Cat " + (Catbean == Catbean2));

    }
}