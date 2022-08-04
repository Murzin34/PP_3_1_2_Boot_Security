package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.models.Role;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Transactional
public interface RoleDAO {
    List<Role> getAllRoles();

    void addRole(Role role);

    Role findById(int id);

    Set<Role> findByIdRoles(List<Long> roles);
}
