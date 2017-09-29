package bd.edu.daffodilvarsity.service;

import bd.edu.daffodilvarsity.model.OrgTask;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */

public interface ServiceOrgTask {

    Collection<OrgTask> findAllOrgTask();
    OrgTask findOneOrgTask(int id);
    OrgTask create(OrgTask orgTask);
    OrgTask update(OrgTask orgTask);
    void delete(int id);
}
