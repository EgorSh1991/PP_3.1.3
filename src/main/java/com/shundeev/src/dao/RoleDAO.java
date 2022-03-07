package com.shundeev.src.dao;

import com.shundeev.src.models.Role;

import java.util.List;

public interface RoleDAO {

    List<Role> listRoles();

    Role getRoleById(Long id);

    Role findRoleByName(String roleName);

}