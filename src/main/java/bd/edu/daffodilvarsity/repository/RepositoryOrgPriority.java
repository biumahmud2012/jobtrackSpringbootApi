package bd.edu.daffodilvarsity.repository;

import bd.edu.daffodilvarsity.model.OrgPriority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mahmud on 12/4/16.
 */

@Repository
public interface RepositoryOrgPriority extends JpaRepository<OrgPriority, Integer> {


}
