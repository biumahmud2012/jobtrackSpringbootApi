package bd.edu.daffodilvarsity.service.bean;

import bd.edu.daffodilvarsity.model.DesignationInfo;
import bd.edu.daffodilvarsity.repository.RepositoryDesignationInfo;
import bd.edu.daffodilvarsity.service.ServiceDesignationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */
@Service
public class ServiceDesignationInfoBean implements ServiceDesignationInfo {

    @Autowired
    RepositoryDesignationInfo repositoryDesignationInfo;

    @Override
    public Collection<DesignationInfo> findAllDesignationInfo() {
        Collection<DesignationInfo> designationInfos = repositoryDesignationInfo.findAll();
        return designationInfos;
    }

    @Override
    public DesignationInfo findOneDesignationInfo(int id) {
        DesignationInfo designationInfo =repositoryDesignationInfo.findOne(id);
        return designationInfo;
    }

    @Override
    public DesignationInfo create(DesignationInfo designationInfo) {
         /*if (designationInfo.getDesig_id() != null){
           return null;
        }*/

        DesignationInfo saveDesignationInfo = repositoryDesignationInfo.save(designationInfo);
        return saveDesignationInfo;
    }

    @Override
    public DesignationInfo update(DesignationInfo designationInfo) {
        DesignationInfo designationInfoPersisted = findOneDesignationInfo(designationInfo.getDesig_id());
        if (designationInfoPersisted == null){
            return null;
        }
        DesignationInfo updateDesignationInfoPersistedInfo = repositoryDesignationInfo.save(designationInfo);
        return updateDesignationInfoPersistedInfo;
    }

    @Override
    public void delete(int id) {
        repositoryDesignationInfo.delete(id);
    }
}
