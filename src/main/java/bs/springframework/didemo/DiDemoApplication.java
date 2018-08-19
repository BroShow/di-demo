package bs.springframework.didemo;

import bs.springframework.didemo.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(SpringPropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SpringSetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SpringConstructorInjectedController.class).sayHello());
    }
}
