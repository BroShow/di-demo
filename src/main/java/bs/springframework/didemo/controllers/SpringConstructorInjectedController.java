package bs.springframework.didemo.controllers;

import bs.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SpringConstructorInjectedController {

    private GreetingService greetingService;

    //Spring will automatically autowire constructor based
    //@Autowired (This is optional now)
    public SpringConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
