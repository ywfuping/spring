package com.yawei.test;

import com.yawei.aop.MyAdvice;
import com.yawei.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class SpringTestCase {
    @Autowired
    private UserService userService;

    @Test
    public void testSayHi(){
        userService.sayHi();
    }


}
