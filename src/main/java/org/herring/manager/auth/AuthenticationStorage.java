package org.herring.manager.auth;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.io.IOException;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public interface AuthenticationStorage {

    public User getUserByName(String name) throws IOException, UsernameNotFoundException;

    public void addUser(User user) throws IOException;

}
