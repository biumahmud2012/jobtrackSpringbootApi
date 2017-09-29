package bd.edu.daffodilvarsity.service;



import bd.edu.daffodilvarsity.model.OrgTaskStatus;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */
public interface ServiceOrgTaskStatus {

    Collection<OrgTaskStatus> findAllOrgTaskStatus();
    OrgTaskStatus findOneOrgTaskStatus(String status);
    OrgTaskStatus create(OrgTaskStatus orgTaskStatus);
    OrgTaskStatus update(OrgTaskStatus orgTaskStatus);
    void delete(String status);
}
