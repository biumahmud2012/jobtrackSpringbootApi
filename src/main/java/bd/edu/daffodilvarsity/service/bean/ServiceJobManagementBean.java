package bd.edu.daffodilvarsity.service.bean;

import bd.edu.daffodilvarsity.model.JobManagement;
import bd.edu.daffodilvarsity.repository.RepositoryJobManagement;
import bd.edu.daffodilvarsity.service.ServiceJobManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */
@Service
public class ServiceJobManagementBean implements ServiceJobManagement {

    @Autowired
    RepositoryJobManagement repositoryJobManagement;

    @Override
    public Collection<JobManagement> findAllJobManagement() {
        Collection<JobManagement> jobManagements = repositoryJobManagement.findAll();
        return jobManagements;
    }

    @Override
    public JobManagement findOneJobManagement(int id) {
        JobManagement jobManagement =repositoryJobManagement.findOne(id);
        return jobManagement;
    }

    @Override
    public JobManagement create(JobManagement jobManagement) {
         /*if (jobManagement.getJob_id() != null){
           return null;
        }*/

        JobManagement saveJobManagement = repositoryJobManagement.save(jobManagement);
        return saveJobManagement;
    }

    @Override
    public JobManagement update(JobManagement jobManagement) {
        JobManagement jobManagementPersisted = findOneJobManagement(jobManagement.getJob_id());
        if (jobManagementPersisted == null){
            return null;
        }
        JobManagement updateJobManagement = repositoryJobManagement.save(jobManagement);
        return updateJobManagement;
    }

    @Override
    public void delete(int id) {
        repositoryJobManagement.delete(id);
    }
}
