package bd.edu.daffodilvarsity.service.bean;

import bd.edu.daffodilvarsity.model.Role;
import bd.edu.daffodilvarsity.repository.RepositoryRole;
import bd.edu.daffodilvarsity.service.ServiceRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */
@Service
public class ServiceRoleBean implements ServiceRole {

    @Autowired
    RepositoryRole repositoryRole;

    @Override
    public Collection<Role> findAllRole() {
        Collection<Role> roles = repositoryRole.findAll();
        return roles;
    }

    @Override
    public Role findOneRole(String role) {
        Role roleOne =repositoryRole.findOne(role);
        return roleOne;
    }

    @Override
    public Role create(Role role) {
         if (role.getRole() != null){
           return null;
        }

        Role saveRole = repositoryRole.save(role);
        return saveRole;
    }

    @Override
    public Role update(Role role) {
        Role rolePersisted = findOneRole(role.getRole());
        if (rolePersisted == null){
            return null;
        }
        Role updateRole = repositoryRole.save(role);
        return updateRole;
        //return null;
    }

    @Override
    public void delete(String role) {
        repositoryRole.delete(role);
    }
}
