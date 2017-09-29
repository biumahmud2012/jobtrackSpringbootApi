package bd.edu.daffodilvarsity.service;

import bd.edu.daffodilvarsity.model.JobMember;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */
public interface ServiceJobMember {

    Collection<JobMember> findAllJobMember();
    JobMember findOneJobMember(int id);
    JobMember create(JobMember jobMember);
    JobMember update(JobMember jobMember);
    void delete(int id);
}
