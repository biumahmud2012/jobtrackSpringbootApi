package bd.edu.daffodilvarsity.service;

import bd.edu.daffodilvarsity.model.OrgJobTracker;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */
public interface ServiceOrgJobTracker {

    Collection<OrgJobTracker> findAllOrgJobTracker();
    OrgJobTracker findOneOrgJobTracker(int id);
    OrgJobTracker create(OrgJobTracker orgJobTracker);
    OrgJobTracker update(OrgJobTracker orgJobTracker);
    void delete(int id);
}
