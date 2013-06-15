package org.herring.manager.auth.tests;

import org.herring.manager.auth.AuthenticationStorage;
import org.herring.manager.auth.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author Chiwan Park
 * @since 0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/main/webapp")
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/applicationContext.xml")
public class AuthenticationStorageTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private AuthenticationStorage storage;

    @Test
    public void checkAdminUser() throws Exception {
        try {
            User user = storage.getUserByName("admin");
        } catch (UsernameNotFoundException e) {
            User user = new User();
            PasswordEncoder passwordEncoder = new StandardPasswordEncoder();

            user.setUsername("admin");
            user.setPassword(passwordEncoder.encode("herring"));

            user.addRole("ROLE_USER");
            user.addRole("ROLE_ADMIN");

            storage.addUser(user);
        }
    }

}
