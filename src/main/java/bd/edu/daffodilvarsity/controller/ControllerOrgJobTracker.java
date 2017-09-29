package bd.edu.daffodilvarsity.controller;

import bd.edu.daffodilvarsity.model.OrgJobTracker;
import bd.edu.daffodilvarsity.service.ServiceOrgJobTracker;
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
public class ControllerOrgJobTracker {

    @Autowired
    private ServiceOrgJobTracker serviceOrgJobTracker;

    @RequestMapping(value = "/jobtracker", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<OrgJobTracker>> getOrgJobTrackers() {
        Collection<OrgJobTracker> orgJobTrackers = serviceOrgJobTracker.findAllOrgJobTracker();
        return new ResponseEntity <Collection<OrgJobTracker>>(orgJobTrackers, HttpStatus.OK);

    }

    @RequestMapping(value = "/jobtracker/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <OrgJobTracker> getOrgJobTracker (@PathVariable("id") int id) {
        OrgJobTracker orgJobTracker = serviceOrgJobTracker.findOneOrgJobTracker(id);
        if (orgJobTracker ==null){
            return new ResponseEntity <OrgJobTracker>( HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity <OrgJobTracker>(orgJobTracker, HttpStatus.OK);

    }

    @RequestMapping(value = "/jobtracker", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrgJobTracker> createOrgJobTracker(@RequestBody OrgJobTracker orgJobTracker) {
        OrgJobTracker saveOrgJobTracker = serviceOrgJobTracker.create(orgJobTracker);

        return new ResponseEntity<OrgJobTracker>(saveOrgJobTracker, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/jobtracker/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrgJobTracker> updateOrgJobTracker(@RequestBody OrgJobTracker orgJobTracker) {
        OrgJobTracker updateOrgJobTracker = serviceOrgJobTracker.update(orgJobTracker);
        if (updateOrgJobTracker == null){
            return new ResponseEntity<OrgJobTracker>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<OrgJobTracker>(updateOrgJobTracker, HttpStatus.OK);
    }

    @RequestMapping(value = "/jobtracker/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<OrgJobTracker> daleteOrgJobTracker(@PathVariable("id") int id) {
        serviceOrgJobTracker.delete(id);

        return new ResponseEntity<OrgJobTracker>(HttpStatus.NO_CONTENT);
    }

}
