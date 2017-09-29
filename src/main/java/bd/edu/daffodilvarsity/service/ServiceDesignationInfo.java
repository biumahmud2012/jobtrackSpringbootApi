package bd.edu.daffodilvarsity.service;

import bd.edu.daffodilvarsity.model.DesignationInfo;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */
public interface ServiceDesignationInfo {
    Collection<DesignationInfo> findAllDesignationInfo();
    DesignationInfo findOneDesignationInfo(int id);
    DesignationInfo create(DesignationInfo designationInfo);
    DesignationInfo update(DesignationInfo designationInfo);
    void delete(int id);

}
