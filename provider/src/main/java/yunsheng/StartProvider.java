package yunsheng;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shengyun on 17/5/11.
 */
public class StartProvider {
    public static void main (String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});


        context.start();
        System.out.println("dubbo-provider 启动,按任意键退出--");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
