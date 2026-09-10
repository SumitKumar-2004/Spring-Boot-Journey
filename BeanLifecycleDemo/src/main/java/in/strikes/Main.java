package in.strikes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

//        AppConfig config = context.getBean(AppConfig.class);
//        config.demo();

        CartService cartService =context.getBean(CartService.class);
        System.out.println(cartService.getValue(2));

        context.close();
    }
}