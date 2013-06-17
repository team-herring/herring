package org.herring.manager.auth;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.io.IOException;
import java.util.List;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public interface AuthenticationStorage {

    public List<String> getListOfUsername() throws IOException;

    public User getUserByName(String name) throws IOException, UsernameNotFoundException;

    public void addUser(User user) throws IOException, IllegalArgumentException;

    public void deleteUser(String username) throws IOException, IllegalArgumentException;

    public void editUser(User user) throws IOException, IllegalArgumentException;
}
