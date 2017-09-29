package bd.edu.daffodilvarsity.service;

import bd.edu.daffodilvarsity.model.OrgTaskActivities;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */
public interface ServiceOrgTaskActivities {

    Collection<OrgTaskActivities> findAllOrgTaskActivities();
    OrgTaskActivities findOneOrgTaskActivities(int id);
    OrgTaskActivities create(OrgTaskActivities OrgTaskActivities);
    OrgTaskActivities update(OrgTaskActivities OrgTaskActivities);
    void delete(int id);
}
