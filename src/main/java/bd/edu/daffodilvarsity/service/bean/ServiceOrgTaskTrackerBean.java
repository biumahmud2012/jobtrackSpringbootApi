package bd.edu.daffodilvarsity.service.bean;

import bd.edu.daffodilvarsity.model.OrgTaskTracker;
import bd.edu.daffodilvarsity.repository.RepositoryOrgTaskTracker;
import bd.edu.daffodilvarsity.service.ServiceOrgTaskTracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */

@Service
public class ServiceOrgTaskTrackerBean implements ServiceOrgTaskTracker {

    @Autowired
    RepositoryOrgTaskTracker repositoryOrgTaskTracker;

    @Override
    public Collection<OrgTaskTracker> findAllOrgTaskTracker() {
        Collection<OrgTaskTracker> orgTaskTrackers = repositoryOrgTaskTracker.findAll();
        return orgTaskTrackers;
    }

    @Override
    public OrgTaskTracker findOneOrgTaskTracker(int id) {
        OrgTaskTracker orgTaskTracker =repositoryOrgTaskTracker.findOne(id);
        return orgTaskTracker;
    }

    @Override
    public OrgTaskTracker create(OrgTaskTracker orgTaskTracker) {
         /*if (orgTaskTracker.getTask_id() != null){
           return null;
        }*/

        OrgTaskTracker saveOrgTaskTracker = repositoryOrgTaskTracker.save(orgTaskTracker);
        return saveOrgTaskTracker;
    }

    @Override
    public OrgTaskTracker update(OrgTaskTracker orgTaskTracker) {
        OrgTaskTracker orgTaskTrackerPersisted = findOneOrgTaskTracker(orgTaskTracker.getTask_id());
        if (orgTaskTrackerPersisted == null){
            return null;
        }
        OrgTaskTracker updateOrgTaskTracker = repositoryOrgTaskTracker.save(orgTaskTracker);
        return updateOrgTaskTracker;
    }

    @Override
    public void delete(int id) {
        repositoryOrgTaskTracker.delete(id);
    }
}
