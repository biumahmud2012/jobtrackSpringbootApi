package bd.edu.daffodilvarsity.service.bean;

import bd.edu.daffodilvarsity.model.OrgJobTracker;
import bd.edu.daffodilvarsity.repository.RepositoryOrgJobTracker;
import bd.edu.daffodilvarsity.service.ServiceOrgJobTracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */

@Service
public class ServiceOrgJobTrackerBean implements ServiceOrgJobTracker {

    @Autowired
    RepositoryOrgJobTracker repositoryOrgJobTracker;

    @Override
    public Collection<OrgJobTracker> findAllOrgJobTracker() {
        Collection<OrgJobTracker> orgJobTrackers = repositoryOrgJobTracker.findAll();
        return orgJobTrackers;
    }

    @Override
    public OrgJobTracker findOneOrgJobTracker(int id) {
        OrgJobTracker orgJobTracker =repositoryOrgJobTracker.findOne(id);
        return orgJobTracker;
    }

    @Override
    public OrgJobTracker create(OrgJobTracker orgJobTracker) {
        OrgJobTracker saveOrgJobTracker = repositoryOrgJobTracker.save(orgJobTracker);
        return saveOrgJobTracker;
    }

    @Override
    public OrgJobTracker update(OrgJobTracker orgJobTracker) {
        OrgJobTracker orgJobTrackerPersisted = findOneOrgJobTracker(orgJobTracker.getWho());
        if (orgJobTrackerPersisted == null) {
            return null;
        }
        OrgJobTracker updateOrgJobTracker = repositoryOrgJobTracker.save(orgJobTracker);
        return updateOrgJobTracker;
    }

    @Override
    public void delete(int id) {
        repositoryOrgJobTracker.delete(id);
    }


}
