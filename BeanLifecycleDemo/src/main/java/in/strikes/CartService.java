package in.strikes;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService implements BeanNameAware, ApplicationContextAware /* InitializingBean,DisposableBean */ {

    Map<Integer,String> mp;

    public CartService(){
        mp = new HashMap<>();
        System.out.println("CartService constructor is called...");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Initializing callback : Bean is ready");
//        mp.put(1,"Amit");
//        mp.put(2,"Sumit");
//    }


    @PostConstruct
    public void start2(){
        System.out.println("Initializing callback : Bean is ready");
        mp.put(1,"Amit");
        mp.put(2,"Sumit");
    }

    public void addCart(){
        System.out.println("Added to cart");
    }

    public String getValue(int key){
        return mp.get(key);
    }

//    public void stop(){
//        mp.clear();
//        System.out.println("Bean is getting destroyed");
//    }

//    public void start(){
//        System.out.println("Initializing callback : Bean is ready");
//        mp.put(1,"Amit");
//        mp.put(2,"Sumit");
//    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context name is : "+applicationContext.getClass());
    }


//    @Override
//    public void destroy() throws Exception {
//        mp.clear();
//        System.out.println("Bean is getting destroyed");
//    }

    @PreDestroy
    public void stop(){
        mp.clear();
        System.out.println("Bean is getting destroyed");
    }
}
