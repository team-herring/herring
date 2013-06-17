package org.herring.manager.controller;

import org.herring.manager.auth.AuthenticationStorage;
import org.herring.manager.auth.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Chiwan Park
 * @since 0.1
 */
@Controller
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationStorage authenticationStorage;

    @RequestMapping(value = "/login.view", method = RequestMethod.GET)
    public ModelAndView viewLogin(HttpServletRequest request) {
        ModelAndView view = new ModelAndView("login");

        @SuppressWarnings("unchecked")
        Map<String, String[]> parameterMap = request.getParameterMap();

        boolean failure = false;
        if (parameterMap.containsKey("failure")) {
            String[] failureValues = parameterMap.get("failure");

            if (failureValues.length > 0)
                failure = Boolean.valueOf(failureValues[0]);
        }

        view.addObject("failure", failure);

        return view;
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @RequestMapping(value = "/addUser.view", method = RequestMethod.GET)
    public ModelAndView viewAddUser() {
        ModelAndView view = new ModelAndView("addUser");

        List<String> userRoles = new ArrayList<String>();

        userRoles.add("ROLE_ADMIN");
        userRoles.add("ROLE_USER");

        view.addObject("userRoles", userRoles);

        return view;
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "/addUser.do", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute User user) {
        ModelAndView view = new ModelAndView("addUserResult");
        boolean failure = false;

        try {
            authenticationStorage.addUser(user);
        } catch (Exception e) {
            failure = true;
            view.addObject("failureInfo", e.getMessage());
        }

        view.addObject("failure", failure);
        view.addObject("successInfo", user.toString());

        return view;
    }

    @RequestMapping(value = "/accessDenied.view", method = RequestMethod.GET)
    public ModelAndView viewAccessDenied() {
        ModelAndView view = new ModelAndView("accessDenied");

        return view;
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "/deleteUser.do", method = RequestMethod.POST)
    public ModelAndView deleteUser(HttpServletRequest request, Principal principal) {
        ModelAndView view = new ModelAndView("deleteUserResult");
        boolean failure = false;

        String username = request.getParameter("username");

        try {
            if (username.equals(principal.getName()))
                throw new IllegalArgumentException("Logged User cannot be removed.");

            authenticationStorage.deleteUser(username);
        } catch (Exception e) {
            failure = true;
            view.addObject("failureInfo", e.getMessage());
        }

        view.addObject("failure", failure);

        return view;
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "/editUser.view", method = RequestMethod.GET)
    public ModelAndView viewEditUser(HttpServletRequest request) {
        ModelAndView view = new ModelAndView("editUser");
        boolean failure = false;

        User user = null;
        String username = request.getParameter("username");

        try {
            user = authenticationStorage.getUserByName(username);
        } catch (Exception e) {
            failure = true;
            view.addObject("failureInfo", e.getMessage());
        }

        List<String> userRoles = new ArrayList<String>();

        userRoles.add("ROLE_ADMIN");
        userRoles.add("ROLE_USER");

        view.addObject("userRoles", userRoles);
        view.addObject("failure", failure);
        view.addObject("user", user);

        return view;
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "/editUser.do", method = RequestMethod.POST)
    public ModelAndView editUser(@ModelAttribute User user) {
        ModelAndView view = new ModelAndView("editUserResult");
        boolean failure = false;

        try {
            authenticationStorage.editUser(user);
        } catch (Exception e) {
            failure = true;
            view.addObject("failureInfo", e.getMessage());
        }

        view.addObject("successInfo", user.toString());
        view.addObject("failure", failure);

        return view;
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "/listUser.view", method = RequestMethod.GET)
    public ModelAndView viewListUser(Principal principal) {
        ModelAndView view = new ModelAndView("listUser");
        boolean failure = false;

        try {
            List<String> userList = authenticationStorage.getListOfUsername();

            view.addObject("userList", userList);
        } catch (Exception e) {
            failure = true;
            view.addObject("failureInfo", e.getMessage());
        }

        view.addObject("failure", failure);
        view.addObject("currentUsername", principal.getName());

        return view;
    }

}
