package com.consumer.user03;

import com.consumer.user03.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class User03ApplicationTests {
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        userService.hello();
    }

}
