package bd.edu.daffodilvarsity.repository;

import bd.edu.daffodilvarsity.model.OrgTaskTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mahmud on 12/10/16.
 */
@Repository
public interface RepositoryOrgTaskTracker extends JpaRepository<OrgTaskTracker, Integer>{
}