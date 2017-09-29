package bd.edu.daffodilvarsity.service;


import bd.edu.daffodilvarsity.model.OrgTaskTracker;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */
public interface ServiceOrgTaskTracker {
    Collection<OrgTaskTracker> findAllOrgTaskTracker();
    OrgTaskTracker findOneOrgTaskTracker(int id);
    OrgTaskTracker create(OrgTaskTracker orgTaskTracker);
    OrgTaskTracker update(OrgTaskTracker orgTaskTracker);
    void delete(int id);
}
