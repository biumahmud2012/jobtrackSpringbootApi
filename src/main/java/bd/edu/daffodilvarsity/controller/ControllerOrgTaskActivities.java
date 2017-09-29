package bd.edu.daffodilvarsity.controller;

import bd.edu.daffodilvarsity.model.OrgTaskActivities;
import bd.edu.daffodilvarsity.service.ServiceOrgTaskActivities;
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
public class ControllerOrgTaskActivities {

    @Autowired
    private ServiceOrgTaskActivities serviceOrgTaskActivities;

    @RequestMapping(value = "/taskactivities", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<OrgTaskActivities>> getOrgTaskActivitiess() {
        Collection<OrgTaskActivities> orgTaskActivitiess = serviceOrgTaskActivities.findAllOrgTaskActivities();
        return new ResponseEntity <Collection<OrgTaskActivities>>(orgTaskActivitiess, HttpStatus.OK);

    }

    @RequestMapping(value = "/taskactivities/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <OrgTaskActivities> getOrgTaskActivities (@PathVariable("id") int id) {
        OrgTaskActivities orgTaskActivities = serviceOrgTaskActivities.findOneOrgTaskActivities(id);
        if (orgTaskActivities ==null){
            return new ResponseEntity <OrgTaskActivities>( HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity <OrgTaskActivities>(orgTaskActivities, HttpStatus.OK);

    }

    @RequestMapping(value = "/taskactivities", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrgTaskActivities> createOrgTaskActivities(@RequestBody OrgTaskActivities orgTaskActivities) {
        OrgTaskActivities saveOrgTaskActivities = serviceOrgTaskActivities.create(orgTaskActivities);

        return new ResponseEntity<OrgTaskActivities>(saveOrgTaskActivities, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/taskactivities/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrgTaskActivities> updateOrgTaskActivities(@RequestBody OrgTaskActivities orgTaskActivities) {
        OrgTaskActivities updateOrgTaskActivities = serviceOrgTaskActivities.update(orgTaskActivities);
        if (updateOrgTaskActivities == null){
            return new ResponseEntity<OrgTaskActivities>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<OrgTaskActivities>(updateOrgTaskActivities, HttpStatus.OK);
    }

    @RequestMapping(value = "/taskactivities/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<OrgTaskActivities> daleteOrgTaskActivities(@PathVariable("id") int id) {
        serviceOrgTaskActivities.delete(id);

        return new ResponseEntity<OrgTaskActivities>(HttpStatus.NO_CONTENT);
    }
}

