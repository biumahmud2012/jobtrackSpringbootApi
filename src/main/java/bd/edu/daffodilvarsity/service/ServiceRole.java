package bd.edu.daffodilvarsity.service;


import bd.edu.daffodilvarsity.model.Role;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */
public interface ServiceRole {
    Collection<Role> findAllRole();
    Role findOneRole(String role);
    Role create(Role role);
    Role update(Role role);
    void delete(String role);
}
