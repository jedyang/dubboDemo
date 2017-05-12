package yunsheng.impl;

import yunsheng.api.HelloService;

/**
 * Created by shengyun on 17/5/11.
 */
public class HelloServiceImpl implements HelloService{

    public String sayHello(String name) {
        return "hello" + name;
    }
}
