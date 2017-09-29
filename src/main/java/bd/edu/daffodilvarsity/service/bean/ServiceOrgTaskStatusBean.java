package bd.edu.daffodilvarsity.service.bean;

import bd.edu.daffodilvarsity.model.OrgTaskStatus;
import bd.edu.daffodilvarsity.repository.RepositoryOrgTaskStatus;
import bd.edu.daffodilvarsity.service.ServiceOrgTaskStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */
@Service
public class ServiceOrgTaskStatusBean implements ServiceOrgTaskStatus {

    @Autowired
    RepositoryOrgTaskStatus repositoryOrgTaskStatus;

    @Override
    public Collection<OrgTaskStatus> findAllOrgTaskStatus() {
        Collection<OrgTaskStatus> orgTaskStatus = repositoryOrgTaskStatus.findAll();
        return orgTaskStatus;
    }

    @Override
    public OrgTaskStatus findOneOrgTaskStatus(String status) {
        OrgTaskStatus orgTaskStatus =repositoryOrgTaskStatus.findOne(status);
        return orgTaskStatus;
    }

    @Override
    public OrgTaskStatus create(OrgTaskStatus orgTaskStatus) {
         if (orgTaskStatus.getStatus() != null){
           return null;
        }

        OrgTaskStatus saveOrgTaskStatus = repositoryOrgTaskStatus.save(orgTaskStatus);
        return saveOrgTaskStatus;
    }

    @Override
    public OrgTaskStatus update(OrgTaskStatus orgTaskStatus) {
        OrgTaskStatus orgTaskStatusPersisted = findOneOrgTaskStatus(orgTaskStatus.getStatus());
        if (orgTaskStatusPersisted == null){
            return null;
        }
        OrgTaskStatus updateOrgTaskStatus = repositoryOrgTaskStatus.save(orgTaskStatus);
        return updateOrgTaskStatus;
        //return null;
    }

    @Override
    public void delete(String status) {
        repositoryOrgTaskStatus.delete(status);
    }
}
