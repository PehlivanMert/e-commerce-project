package dev.pehlivan.ecommerceproject;

import dev.pehlivan.ecommerceproject.model.User;
import dev.pehlivan.ecommerceproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testRegisterUser() {
        User user = new User();
        user.setUsername("testuser");
        user.setPassword("password");


        User registeredUser = userService.save(user);

        assertNotNull(registeredUser);
        assertEquals("testuser", registeredUser.getUsername());
    }
}


