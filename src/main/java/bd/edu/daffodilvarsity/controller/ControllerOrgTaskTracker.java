package bd.edu.daffodilvarsity.controller;


import bd.edu.daffodilvarsity.model.OrgTaskTracker;
import bd.edu.daffodilvarsity.service.ServiceOrgTaskTracker;
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
public class ControllerOrgTaskTracker {

    @Autowired
    private ServiceOrgTaskTracker serviceOrgTaskTracker;

    @RequestMapping(value = "/tasktracker", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<OrgTaskTracker>> getOrgTaskTrackers() {
        Collection<OrgTaskTracker> orgTaskTrackers = serviceOrgTaskTracker.findAllOrgTaskTracker();
        return new ResponseEntity <Collection<OrgTaskTracker>>(orgTaskTrackers, HttpStatus.OK);

    }

    @RequestMapping(value = "/tasktracker/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <OrgTaskTracker> getOrgTaskTracker (@PathVariable("id") int id) {
        OrgTaskTracker orgTaskTracker = serviceOrgTaskTracker.findOneOrgTaskTracker(id);
        if (orgTaskTracker ==null){
            return new ResponseEntity <OrgTaskTracker>( HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity <OrgTaskTracker>(orgTaskTracker, HttpStatus.OK);

    }

    @RequestMapping(value = "/tasktracker", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrgTaskTracker> createOrgTaskTracker(@RequestBody OrgTaskTracker orgTaskTracker) {
        OrgTaskTracker saveOrgTaskTracker = serviceOrgTaskTracker.create(orgTaskTracker);

        return new ResponseEntity<OrgTaskTracker>(saveOrgTaskTracker, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/tasktracker/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrgTaskTracker> updateOrgTaskTracker(@RequestBody OrgTaskTracker orgTaskTracker) {
        OrgTaskTracker updateOrgTaskTracker = serviceOrgTaskTracker.update(orgTaskTracker);
        if (updateOrgTaskTracker == null){
            return new ResponseEntity<OrgTaskTracker>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<OrgTaskTracker>(updateOrgTaskTracker, HttpStatus.OK);
    }

    @RequestMapping(value = "/tasktracker/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<OrgTaskTracker> daleteOrgTaskTracker(@PathVariable("id") int id) {
        serviceOrgTaskTracker.delete(id);

        return new ResponseEntity<OrgTaskTracker>(HttpStatus.NO_CONTENT);
    }
}
