package xmlbased.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("autowireConfig.xml");
//        Department d = ctx.getBean("dept1", Department.class);
        Department d = ctx.getBean("dept2", Department.class);

        System.out.println(d);
    }
}
