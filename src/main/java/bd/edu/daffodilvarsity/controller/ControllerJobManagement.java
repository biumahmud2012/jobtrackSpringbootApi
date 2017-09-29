package bd.edu.daffodilvarsity.controller;

import bd.edu.daffodilvarsity.model.JobManagement;
import bd.edu.daffodilvarsity.service.ServiceJobManagement;
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
public class ControllerJobManagement {

    @Autowired
    private ServiceJobManagement serviceJobManagement;

    @RequestMapping(value = "/jobmanagement", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<JobManagement>> getJobManagements() {
        Collection<JobManagement> jobManagements = serviceJobManagement.findAllJobManagement();
        return new ResponseEntity <Collection<JobManagement>>(jobManagements, HttpStatus.OK);

    }

    @RequestMapping(value = "/jobmanagement/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <JobManagement> getJobManagement (@PathVariable("id") int id) {
        JobManagement jobManagement = serviceJobManagement.findOneJobManagement(id);
        if (jobManagement ==null){
            return new ResponseEntity <JobManagement>( HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity <JobManagement>(jobManagement, HttpStatus.OK);

    }

    @RequestMapping(value = "/jobmanagement", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JobManagement> createJobManagement(@RequestBody JobManagement jobManagement) {
        JobManagement saveJobManagement = serviceJobManagement.create(jobManagement);

        return new ResponseEntity<JobManagement>(saveJobManagement, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/jobmanagement/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JobManagement> updateJobManagement(@RequestBody JobManagement jobManagement) {
        JobManagement updateJobManagement = serviceJobManagement.update(jobManagement);
        if (updateJobManagement == null){
            return new ResponseEntity<JobManagement>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<JobManagement>(updateJobManagement, HttpStatus.OK);
    }

    @RequestMapping(value = "/jobmanagement/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<JobManagement> daleteJobManagement(@PathVariable("id") int id) {
        serviceJobManagement.delete(id);

        return new ResponseEntity<JobManagement>(HttpStatus.NO_CONTENT);
    }
}
