import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanHW_1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHW_2 = (HelloWorld) applicationContext.getBean(("helloworld"));

        Cat beanC_1 = (Cat) applicationContext.getBean("cat");
        Cat beanC_2 = (Cat) applicationContext.getBean("cat");

        System.out.println("beans HelloWord: " + (beanHW_1 == beanHW_2));
        System.out.println("beans Cat: " + (beanC_1 == beanC_2));
    }
}