package bd.edu.daffodilvarsity.controller;

import bd.edu.daffodilvarsity.model.OrgTaskStatus;
import bd.edu.daffodilvarsity.service.ServiceOrgTaskStatus;
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
public class ControllerOrgTaskStatus {

    @Autowired
    private ServiceOrgTaskStatus serviceOrgTaskStatus;

    @RequestMapping(value = "/taskstatus", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<OrgTaskStatus>> getOrgTaskStatuss() {
        Collection<OrgTaskStatus> orgTaskStatuss = serviceOrgTaskStatus.findAllOrgTaskStatus();
        return new ResponseEntity <Collection<OrgTaskStatus>>(orgTaskStatuss, HttpStatus.OK);

    }

    @RequestMapping(value = "/taskstatus/{status}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <OrgTaskStatus> getOrgTaskStatus (@PathVariable("status") String status) {
        OrgTaskStatus orgTaskStatus = serviceOrgTaskStatus.findOneOrgTaskStatus(status);
        if (orgTaskStatus ==null){
            return new ResponseEntity <OrgTaskStatus>( HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity <OrgTaskStatus>(orgTaskStatus, HttpStatus.OK);

    }

    @RequestMapping(value = "/taskstatus", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrgTaskStatus> createOrgTaskStatus(@RequestBody OrgTaskStatus orgTaskStatus) {
        OrgTaskStatus saveOrgTaskStatus = serviceOrgTaskStatus.create(orgTaskStatus);

        return new ResponseEntity<OrgTaskStatus>(saveOrgTaskStatus, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/taskstatus/{status}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrgTaskStatus> updateOrgTaskStatus(@RequestBody OrgTaskStatus orgTaskStatus) {
        OrgTaskStatus updateOrgTaskStatus = serviceOrgTaskStatus.update(orgTaskStatus);
        if (updateOrgTaskStatus == null){
            return new ResponseEntity<OrgTaskStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<OrgTaskStatus>(updateOrgTaskStatus, HttpStatus.OK);
    }

    @RequestMapping(value = "/taskstatus/{status}", method = RequestMethod.DELETE)
    public ResponseEntity<OrgTaskStatus> daleteOrgTaskStatus(@PathVariable("status") String status) {
        serviceOrgTaskStatus.delete(status);

        return new ResponseEntity<OrgTaskStatus>(HttpStatus.NO_CONTENT);
    }
}
