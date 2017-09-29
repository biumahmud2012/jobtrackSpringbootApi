package bd.edu.daffodilvarsity.controller;

import bd.edu.daffodilvarsity.model.JobMember;
import bd.edu.daffodilvarsity.service.ServiceJobMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by mahmud on 12/10/16.
 */
@RestController
public class ControllerJobMember {

    @Autowired
    private ServiceJobMember serviceJobMember;

    @RequestMapping(value = "/jobmember", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<JobMember>> getJobMembers() {
        Collection<JobMember> jobMembers = serviceJobMember.findAllJobMember();
        return new ResponseEntity <Collection<JobMember>>(jobMembers, HttpStatus.OK);

    }

    @RequestMapping(value = "/jobmember/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <JobMember> getJobMember (@PathVariable("id") int id) {
        JobMember jobMember = serviceJobMember.findOneJobMember(id);
        if (jobMember ==null){
            return new ResponseEntity <JobMember>( HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity <JobMember>(jobMember, HttpStatus.OK);

    }

    @RequestMapping(value = "/jobmember", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JobMember> createJobMember(@RequestBody JobMember jobMember) {
        JobMember saveJobMember = serviceJobMember.create(jobMember);

        return new ResponseEntity<JobMember>(saveJobMember, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/jobmember/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JobMember> updateJobMember(@RequestBody JobMember jobMember) {
        JobMember updateJobMember = serviceJobMember.update(jobMember);
        if (updateJobMember == null){
            return new ResponseEntity<JobMember>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<JobMember>(updateJobMember, HttpStatus.OK);
    }

    @RequestMapping(value = "/jobmember/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<JobMember> daleteJobMember(@PathVariable("id") int id) {
        serviceJobMember.delete(id);

        return new ResponseEntity<JobMember>(HttpStatus.NO_CONTENT);
    }

}
