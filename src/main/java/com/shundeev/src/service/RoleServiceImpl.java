package com.shundeev.src.service;

import com.shundeev.src.dao.RoleDAO;
import com.shundeev.src.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleDAO roleDAO;

    @Autowired
    public void setUserDAO(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }

    @Override
    public List<Role> listRoles() {
        return roleDAO.listRoles();
    }

    @Override
    public Role getRoleById(Long id) {
        return roleDAO.getRoleById(id);
    }

    @Override
    public Role findRoleByName(String roleName) {
        return roleDAO.findRoleByName(roleName);
    }
}