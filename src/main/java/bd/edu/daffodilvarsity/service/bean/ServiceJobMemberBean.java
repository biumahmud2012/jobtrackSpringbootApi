package bd.edu.daffodilvarsity.service.bean;

import bd.edu.daffodilvarsity.model.JobMember;
import bd.edu.daffodilvarsity.repository.RepositoryJobMember;
import bd.edu.daffodilvarsity.service.ServiceJobMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by mahmud on 12/15/16.
 */
@Service
public class ServiceJobMemberBean implements ServiceJobMember {

    @Autowired
    RepositoryJobMember repositoryJobMember;
    @Override
    public Collection<JobMember> findAllJobMember() {
        Collection<JobMember> jobMember = repositoryJobMember.findAll();
        return jobMember;
    }

    @Override
    public JobMember findOneJobMember(int id) {
        JobMember jobMember =repositoryJobMember.findOne(id);
        return jobMember;
    }

    @Override
    public JobMember create(JobMember jobMember) {
        JobMember saveJobMember = repositoryJobMember.save(jobMember);
        return saveJobMember;
    }

    @Override
    public JobMember update(JobMember jobMember) {
        JobMember jobMemberPersisted = findOneJobMember(jobMember.getJob_id());
        if (jobMemberPersisted == null){
            return null;
        }
        JobMember updateJobMember = repositoryJobMember.save(jobMember);
        return updateJobMember;
    }

    @Override
    public void delete(int id) {
        repositoryJobMember.delete(id);
    }
}
