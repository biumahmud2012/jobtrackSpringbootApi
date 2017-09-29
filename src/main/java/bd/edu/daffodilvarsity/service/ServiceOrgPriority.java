package bd.edu.daffodilvarsity.service;


import bd.edu.daffodilvarsity.model.OrgPriority;

import java.util.Collection;

/**
 * Created by mahmud on 12/5/16.
 */

public interface ServiceOrgPriority {

    Collection<OrgPriority> findAllOrgPriority();
    OrgPriority findOneOrgPriority(int id);
    OrgPriority create(OrgPriority orgPriority);
    OrgPriority update(OrgPriority orgPriority);
    void delete(int id);
    

}
