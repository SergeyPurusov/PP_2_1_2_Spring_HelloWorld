import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean1.getMessage());

        Cat cat = (Cat) applicationContext.getBean("catBean");
        Cat cat1 = (Cat) applicationContext.getBean("catBean");
        System.out.println(cat.getBean());
        System.out.println(cat1.getBean());

        System.out.println(bean == bean1);
        System.out.println(cat == cat1);
    }
}