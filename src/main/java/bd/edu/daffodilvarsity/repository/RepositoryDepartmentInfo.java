package bd.edu.daffodilvarsity.repository;


import bd.edu.daffodilvarsity.model.DepartmentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mahmud on 12/29/16.
 */

@Repository
public interface RepositoryDepartmentInfo extends JpaRepository<DepartmentInfo, Integer> {
}