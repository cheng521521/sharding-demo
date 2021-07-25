package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest()
@RunWith(SpringRunner.class)
class DemoApplicationTests {
    private static Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
    @Autowired
    private UserService userService;
    /* 添加一条数据 */
    @Test
    public void testAdd()
    {
        for (int i = 1; i <21 ; i++) {
            String username = "aauser";
            String password = "aapass";
            User user = new User(username, password);
            user.setUserId(i);
            userService.add(user);
        }
    }
    /* 批量添加数据 */
    @Test
    public void testAddBatch()
    {
        String username;
        String password;
        for (int i = 0; i < 50; i++) {
            username = RandomStringUtils.random( 20 );
            password = RandomStringUtils.random( 20 );
            User user = new User(username, password);
            userService.add(user);
        }
    }
    /* 测试查询 */
    @Test
    public void testSelect()
    {
        List<User> users = userService.selectAll();
        logger.info("Total records: {}", users.size());
        for (User user : users) {
            logger.info("{}", user);
        }
    }


}
