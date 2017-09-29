package bd.edu.daffodilvarsity.repository;

import bd.edu.daffodilvarsity.model.DesignationInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mahmud on 12/10/16.
 */
@Repository
public interface RepositoryDesignationInfo extends JpaRepository<DesignationInfo, Integer> {
}
