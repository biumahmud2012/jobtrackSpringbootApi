package bd.edu.daffodilvarsity.service;


import bd.edu.daffodilvarsity.model.DepartmentInfo;

import java.util.Collection;

/**
 * Created by mahmud on 12/29/16.
 */

public interface ServiceDepartmentInfo {

    Collection<DepartmentInfo> findAllDepartmentInfo();
    DepartmentInfo findOneDepartmentInfo(int id);
    DepartmentInfo create(DepartmentInfo departmentInfo);
    DepartmentInfo update(DepartmentInfo departmentInfo);
    void delete(int id);
}
