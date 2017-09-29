package bd.edu.daffodilvarsity.service.bean;

import bd.edu.daffodilvarsity.model.OrgTaskActivities;
import bd.edu.daffodilvarsity.repository.RepositoryOrgTaskActivities;
import bd.edu.daffodilvarsity.service.ServiceOrgTaskActivities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */
@Service
public class ServiceOrgTaskActivitiesBean implements ServiceOrgTaskActivities {
    @Autowired
    RepositoryOrgTaskActivities repositoryOrgTaskActivities;

    @Override
    public Collection<OrgTaskActivities> findAllOrgTaskActivities() {
        Collection<OrgTaskActivities> orgTaskActivitiess = repositoryOrgTaskActivities.findAll();
        return orgTaskActivitiess;
    }

    @Override
    public OrgTaskActivities findOneOrgTaskActivities(int id) {
        OrgTaskActivities orgTaskActivities =repositoryOrgTaskActivities.findOne(id);
        return orgTaskActivities;
    }

    @Override
    public OrgTaskActivities create(OrgTaskActivities orgTaskActivities) {
         /*if (orgTaskActivities.getTask_id() != null){
           return null;
        }*/

        OrgTaskActivities saveOrgTaskActivities = repositoryOrgTaskActivities.save(orgTaskActivities);
        return saveOrgTaskActivities;
    }

    @Override
    public OrgTaskActivities update(OrgTaskActivities orgTaskActivities) {
        OrgTaskActivities orgTaskActivitiesPersisted = findOneOrgTaskActivities(orgTaskActivities.getActivity_id());
        if (orgTaskActivitiesPersisted == null){
            return null;
        }
        OrgTaskActivities updateOrgTaskActivities = repositoryOrgTaskActivities.save(orgTaskActivities);
        return updateOrgTaskActivities;
    }

    @Override
    public void delete(int id) {
        repositoryOrgTaskActivities.delete(id);
    }
}
