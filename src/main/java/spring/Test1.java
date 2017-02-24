package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import spring.service.UserService;

/**
 * Test1
 * 
 * @author liuruichao
 * Created on 2016-01-29 10:53
 */
@Service
public class Test1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService);
    }
}
