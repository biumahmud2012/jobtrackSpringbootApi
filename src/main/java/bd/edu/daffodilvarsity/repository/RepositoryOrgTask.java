package bd.edu.daffodilvarsity.repository;

import bd.edu.daffodilvarsity.model.OrgTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mahmud on 12/10/16.
 */

@Repository
public interface RepositoryOrgTask extends JpaRepository<OrgTask, Integer> {
}
