package bd.edu.daffodilvarsity.service.bean;

import bd.edu.daffodilvarsity.model.PersonInfo;
import bd.edu.daffodilvarsity.repository.RepositoryPersonInfo;
import bd.edu.daffodilvarsity.service.ServicePersonInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */
@Service
public class ServicePersonInfoBean implements ServicePersonInfo {

    @Autowired
    RepositoryPersonInfo repositoryPersonInfo;

    @Override
    public Collection<PersonInfo> findAllPersonInfo() {
        Collection<PersonInfo> personInfoss = repositoryPersonInfo.findAll();
        return personInfoss;
    }

    @Override
    public PersonInfo findOnePersonInfo(int id) {
        PersonInfo personInfo = repositoryPersonInfo.findOne(id);
        return personInfo;
    }

    @Override
    public PersonInfo create(PersonInfo personInfo) {
        /*if (personInfo.getEmployeeId() != null){
           return null;
        }*/

        PersonInfo savePersonInfo = repositoryPersonInfo.save(personInfo);
        return savePersonInfo;
    }

    @Override
    public PersonInfo update(PersonInfo personInfo) {
        PersonInfo personInfoPersisted = findOnePersonInfo(personInfo.getId());
        if (personInfoPersisted == null){
            return null;
        }
        PersonInfo updatePersonInfo = repositoryPersonInfo.save(personInfo);
        return updatePersonInfo;
    }

    @Override
    public void delete(int id) {
        repositoryPersonInfo.delete(id);
    }
}
