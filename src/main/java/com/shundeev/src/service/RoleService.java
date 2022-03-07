package com.shundeev.src.service;


import com.shundeev.src.models.Role;

import java.util.List;

public interface RoleService {

    List<Role> listRoles();

    Role getRoleById(Long id);

    Role findRoleByName(String roleName);

}