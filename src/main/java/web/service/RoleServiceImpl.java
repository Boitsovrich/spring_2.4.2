package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.RoleDao;
import web.dao.UserDao;
import web.model.Role;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Transactional
    @Override
    public Role getRoleByName(String name) {

        return roleDao.getRoleByName(name);
    }

    @Transactional
    @Override
    public void addRole(Role role) {
        roleDao.addRole(role);
    }
}
