package bd.edu.daffodilvarsity.service.bean;

import bd.edu.daffodilvarsity.model.OrgPriority;
import bd.edu.daffodilvarsity.repository.RepositoryOrgPriority;
import bd.edu.daffodilvarsity.service.ServiceOrgPriority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by mahmud on 12/7/16.
 */

@Service
public class ServiceOrgPriorityBean implements ServiceOrgPriority {

    @Autowired
    RepositoryOrgPriority repositoryOrgPriority;


    @Override
    public Collection<OrgPriority> findAllOrgPriority() {
        Collection<OrgPriority> orgPrioritys = repositoryOrgPriority.findAll();
        return orgPrioritys;
    }

    @Override
    public OrgPriority findOneOrgPriority(int id) {
        OrgPriority orgPriority =repositoryOrgPriority.findOne(id);
        return orgPriority;
    }

    @Override
    public OrgPriority create(OrgPriority orgPriority) {
        /*if (orgPriority.getPriority_no() != null){
           return null;
        }*/

        OrgPriority saveOrgPriority = repositoryOrgPriority.save(orgPriority);
        return saveOrgPriority;
    }

    @Override
    public OrgPriority update(OrgPriority orgPriority) {
        OrgPriority orgPriorityPersisted = findOneOrgPriority(orgPriority.getPriority_no());
        if (orgPriorityPersisted == null){
            return null;
        }
        OrgPriority updateOrgPriority = repositoryOrgPriority.save(orgPriority);
        return updateOrgPriority;
    }

    @Override
    public void delete(int id) {
        repositoryOrgPriority.delete(id);
        /*boolean deleted = delete(id);
        if (!deleted){
            return new ResponseEntity<OrgPriority>(HttpStatus.INTERNAL_SERVER_ERROR);
        }*/
        //remove(id);
    }
}
