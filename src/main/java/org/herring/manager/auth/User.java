package org.herring.manager.auth;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class User {

    private String username;
    private String password;
    private List<String> roles;

    public User() {
        username = null;
        password =null;
        roles = new ArrayList<String>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getRoles() {
        return roles.toArray(new String[0]);
    }

    public void setRoles(String[] roles) {
        this.roles.clear();

        for (String role : roles)
            addRole(role);
    }

    public void addRole(String role) {
        if (!roles.contains(role))
            roles.add(role);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("<User>\n");
        builder.append("Username: " + username);
        builder.append("Password: " + password);
        builder.append("Roles: ");

        for (String role : roles)
            builder.append(role);

        return builder.toString();
    }

}
