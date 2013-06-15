package org.herring.manager.auth;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class HerringAuthenticationProvider implements AuthenticationProvider {

    private AuthenticationStorage authenticationStorage;
    private PasswordEncoder passwordEncoder;

    public HerringAuthenticationProvider() {
        authenticationStorage = null;
        passwordEncoder = new StandardPasswordEncoder();
    }

    public void setAuthenticationStorage(AuthenticationStorage authenticationStorage) {
        this.authenticationStorage = authenticationStorage;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        if (authenticationStorage == null)
            throw new IllegalStateException("Zookeeper Client must be set.");

        if (!supports(authentication.getClass()))
            return null;

        User user;
        String password = authentication.getCredentials().toString();
        List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();

        try {
            user = authenticationStorage.getUserByName(authentication.getName());
        } catch (IOException e) {
            throw new AuthenticationServiceException("Authentication Storage has a problem. msg: " + e.getMessage());
        }

        if (!passwordEncoder.matches(password, user.getPassword()))
            throw new BadCredentialsException("Password is not valid for this user.");

        for (String role : user.getRoles())
            grantedAuths.add(new SimpleGrantedAuthority(role));

        return new UsernamePasswordAuthenticationToken(user.getUsername(), password, grantedAuths);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }

}
