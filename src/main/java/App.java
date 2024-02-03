import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW_1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHW_1.getMessage());

        HelloWorld beanHW_2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat_1 = (Cat) applicationContext.getBean("cat");
        Cat beanCat_2 = (Cat) applicationContext.getBean("cat");

        System.out.println(beanHW_1 == beanHW_2);
        System.out.println(beanCat_1 == beanCat_2);
    }
}