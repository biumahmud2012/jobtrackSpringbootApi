package bd.edu.daffodilvarsity.service;


import bd.edu.daffodilvarsity.model.PersonInfo;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */
public interface ServicePersonInfo {

    Collection<PersonInfo> findAllPersonInfo();
    PersonInfo findOnePersonInfo(int id);
    PersonInfo create(PersonInfo personInfo);
    PersonInfo update(PersonInfo personInfo);
    void delete(int id);
}
