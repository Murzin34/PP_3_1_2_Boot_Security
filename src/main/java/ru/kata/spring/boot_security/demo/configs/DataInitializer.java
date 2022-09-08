package ru.kata.spring.boot_security.demo.configs;

import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;
import ru.kata.spring.boot_security.demo.services.RoleService;
import ru.kata.spring.boot_security.demo.services.UserService;

import javax.annotation.PostConstruct;

@Component
public class DataInitializer {

    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    private void init() {
        Role role1 = new Role("ADMIN");
        Role role2 = new Role("USER");
        roleService.addRole(role1);
        roleService.addRole(role2);

        User user = new User();
        user.setUsername("user1");
        user.setAge(13);
        user.setPassword("user1");
        user.addRole(role2);

        User user2 = new User();
        user2.setUsername("admin");
        user2.setAge(18);
        user2.setPassword("admin");
        user2.addRole(role1);

        User user3 = new User();
        user3.setUsername("ivan");
        user3.setAge(55);
        user3.setPassword("ivan");
        user3.addRole(role1);
        user3.addRole(role2);

        userService.saveUser(user);
        userService.saveUser(user2);
        userService.saveUser(user3);
    }
}
