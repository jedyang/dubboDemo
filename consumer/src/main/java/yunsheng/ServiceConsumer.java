package yunsheng;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import yunsheng.api.HelloService;

/**
 * Created by shengyun on 17/5/12.
 */
public class ServiceConsumer {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-consumer.xml"});
        context.start();

        HelloService helloService = (HelloService)context.getBean("helloService");

        System.out.println(helloService.sayHello("yunsheng"));
    }
}
