package bd.edu.daffodilvarsity.controller;

import bd.edu.daffodilvarsity.model.OrgTask;
import bd.edu.daffodilvarsity.service.ServiceOrgTask;
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
public class ControllerOrgTask {

    @Autowired
    private ServiceOrgTask serviceOrgTask;

    @RequestMapping(value = "/task", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<OrgTask>> getOrgTask() {
        Collection<OrgTask> orgTasks = serviceOrgTask.findAllOrgTask();
        return new ResponseEntity <Collection<OrgTask>>(orgTasks, HttpStatus.OK);

    }

    @RequestMapping(value = "/task/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <OrgTask> getOrgTask (@PathVariable("id") int id) {
        OrgTask orgTask = serviceOrgTask.findOneOrgTask(id);
        if (orgTask ==null){
            return new ResponseEntity <OrgTask>( HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity <OrgTask>(orgTask, HttpStatus.OK);

    }

    @RequestMapping(value = "/task", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrgTask> createOrgTask(@RequestBody OrgTask orgTask) {
        OrgTask saveOrgTask = serviceOrgTask.create(orgTask);

        return new ResponseEntity<OrgTask>(saveOrgTask, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/task/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrgTask> updateOrgTask(@RequestBody OrgTask orgTask) {
        OrgTask updateOrgTask = serviceOrgTask.update(orgTask);
        if (updateOrgTask == null){
            return new ResponseEntity<OrgTask>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<OrgTask>(updateOrgTask, HttpStatus.OK);
    }

    @RequestMapping(value = "/task/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<OrgTask> daleteOrgTask(@PathVariable("id") int id) {
        serviceOrgTask.delete(id);

        return new ResponseEntity<OrgTask>(HttpStatus.NO_CONTENT);
    }
}
