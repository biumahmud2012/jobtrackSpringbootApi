package bd.edu.daffodilvarsity.service.bean;

import bd.edu.daffodilvarsity.model.DepartmentInfo;
import bd.edu.daffodilvarsity.repository.RepositoryDepartmentInfo;
import bd.edu.daffodilvarsity.service.ServiceDepartmentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by mahmud on 12/29/16.
 */

@Service
public class ServiceDepartmentInfoBean implements ServiceDepartmentInfo {

    @Autowired
    RepositoryDepartmentInfo repositoryDepartmentInfo;

    @Override
    public Collection<DepartmentInfo> findAllDepartmentInfo() {
        Collection<DepartmentInfo> departmentInfos = repositoryDepartmentInfo.findAll();
        return departmentInfos;
    }

    @Override
    public DepartmentInfo findOneDepartmentInfo(int id) {
        DepartmentInfo departmentInfo =repositoryDepartmentInfo.findOne(id);
        return departmentInfo;
    }

    @Override
    public DepartmentInfo create(DepartmentInfo departmentInfo) {
        DepartmentInfo savedepartmentInfos = repositoryDepartmentInfo.save(departmentInfo);
        return savedepartmentInfos;
    }

    @Override
    public DepartmentInfo update(DepartmentInfo departmentInfo) {
        DepartmentInfo departmentInfoPersisted = findOneDepartmentInfo(departmentInfo.getDept_id());
        if (departmentInfoPersisted == null){
            return null;
        }
        DepartmentInfo updateDepartmentInfoPersistedInfo = repositoryDepartmentInfo.save(departmentInfo);
        return updateDepartmentInfoPersistedInfo;
    }

    @Override
    public void delete(int id) {
        repositoryDepartmentInfo.delete(id);
    }
}
