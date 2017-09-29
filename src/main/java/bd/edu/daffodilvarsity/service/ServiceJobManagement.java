package bd.edu.daffodilvarsity.service;

import bd.edu.daffodilvarsity.model.JobManagement;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */
public interface ServiceJobManagement {
    Collection<JobManagement> findAllJobManagement();
    JobManagement findOneJobManagement(int id);
    JobManagement create(JobManagement jobManagement);
    JobManagement update(JobManagement jobManagement);
    void delete(int id);

}
