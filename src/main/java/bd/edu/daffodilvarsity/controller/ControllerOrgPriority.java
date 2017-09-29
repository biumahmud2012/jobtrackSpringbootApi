package bd.edu.daffodilvarsity.controller;

import bd.edu.daffodilvarsity.model.OrgPriority;
import bd.edu.daffodilvarsity.service.ServiceOrgPriority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by mahmud on 12/5/16.
 */

@RestController
public class ControllerOrgPriority {

    @Autowired
    private ServiceOrgPriority serviceOrgPriority;

    @RequestMapping(value = "/priority", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <Collection<OrgPriority>> getOrgPrioritys() {
        Collection<OrgPriority> orgPrioritys = serviceOrgPriority.findAllOrgPriority();
        return new ResponseEntity <Collection<OrgPriority>>(orgPrioritys, HttpStatus.OK);

    }

    @RequestMapping(value = "/priority/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <OrgPriority> getOrgPriority (@PathVariable("id") int id) {
        OrgPriority orgPriority = serviceOrgPriority.findOneOrgPriority(id);
        if (orgPriority ==null){
            return new ResponseEntity <OrgPriority>( HttpStatus.NOT_FOUND);
        }
        //Collection<OrgPriority> addressTypes = addressTypeMap.values();
        return new ResponseEntity <OrgPriority>(orgPriority, HttpStatus.OK);

    }

    @RequestMapping(value = "/priority", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrgPriority> createOrgPriority(@RequestBody OrgPriority orgPriority) {
        OrgPriority saveOrgPriority = serviceOrgPriority.create(orgPriority);

        return new ResponseEntity<OrgPriority>(saveOrgPriority, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/priority/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrgPriority> updateOrgPriority(@RequestBody OrgPriority orgPriority) {
        OrgPriority updateOrgPriority = serviceOrgPriority.update(orgPriority);
        if (updateOrgPriority == null){
            return new ResponseEntity<OrgPriority>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<OrgPriority>(updateOrgPriority, HttpStatus.OK);
    }

    @RequestMapping(value = "/priority/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<OrgPriority> daleteOrgPriority(@PathVariable("id") int id) {
        serviceOrgPriority.delete(id);

        return new ResponseEntity<OrgPriority>(HttpStatus.NO_CONTENT);
    }


}
