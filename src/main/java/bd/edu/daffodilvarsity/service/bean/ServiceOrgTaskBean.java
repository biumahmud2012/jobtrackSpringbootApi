package bd.edu.daffodilvarsity.service.bean;

import bd.edu.daffodilvarsity.model.OrgTask;
import bd.edu.daffodilvarsity.repository.RepositoryOrgTask;
import bd.edu.daffodilvarsity.service.ServiceOrgTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */

@Service
public class ServiceOrgTaskBean implements ServiceOrgTask {

    @Autowired
    RepositoryOrgTask repositoryOrgTask;

    @Override
    public Collection<OrgTask> findAllOrgTask() {
        Collection<OrgTask> orgTasks = repositoryOrgTask.findAll();
        return orgTasks;
    }

    @Override
    public OrgTask findOneOrgTask(int id) {
        OrgTask orgTask =repositoryOrgTask.findOne(id);
        return orgTask;
    }

    @Override
    public OrgTask create(OrgTask orgTask) {
        /*if (orgTask.getTask_id() != null){
           return null;
        }*/

        OrgTask saveOrgTask = repositoryOrgTask.save(orgTask);
        return saveOrgTask;
    }

    @Override
    public OrgTask update(OrgTask orgTask) {
        OrgTask orgTaskPersisted = findOneOrgTask(orgTask.getTask_id());
        if (orgTaskPersisted == null){
            return null;
        }
        OrgTask updateOrgTask = repositoryOrgTask.save(orgTask);
        return updateOrgTask;
    }

    @Override
    public void delete(int id) {
        repositoryOrgTask.delete(id);
    }
}
