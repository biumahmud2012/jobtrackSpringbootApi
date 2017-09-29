package bd.edu.daffodilvarsity.controller;

import bd.edu.daffodilvarsity.model.DesignationInfo;
import bd.edu.daffodilvarsity.service.ServiceDesignationInfo;
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
public class ControllerDesignationInfo {

    @Autowired
    private ServiceDesignationInfo serviceDesignationInfo;

    @RequestMapping(value = "/designationinfo", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<DesignationInfo>> getDesignationInfos() {
        Collection<DesignationInfo> designationInfos = serviceDesignationInfo.findAllDesignationInfo();
        return new ResponseEntity <Collection<DesignationInfo>>(designationInfos, HttpStatus.OK);

    }

    @RequestMapping(value = "/designationinfo/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <DesignationInfo> getDesignationInfo (@PathVariable("id") int id) {
        DesignationInfo designationInfo = serviceDesignationInfo.findOneDesignationInfo(id);
        if (designationInfo ==null){
            return new ResponseEntity <DesignationInfo>( HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity <DesignationInfo>(designationInfo, HttpStatus.OK);

    }

    @RequestMapping(value = "/designationinfo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DesignationInfo> createDesignationInfo(@RequestBody DesignationInfo designationInfo) {
        DesignationInfo saveDesignationInfo = serviceDesignationInfo.create(designationInfo);

        return new ResponseEntity<DesignationInfo>(saveDesignationInfo, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/designationinfo/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DesignationInfo> updateDesignationInfo(@RequestBody DesignationInfo designationInfo) {
        DesignationInfo updateDesignationInfo = serviceDesignationInfo.update(designationInfo);
        if (updateDesignationInfo == null){
            return new ResponseEntity<DesignationInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<DesignationInfo>(updateDesignationInfo, HttpStatus.OK);
    }

    @RequestMapping(value = "/designationinfo/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<DesignationInfo> daleteDesignationInfo(@PathVariable("id") int id) {
        serviceDesignationInfo.delete(id);

        return new ResponseEntity<DesignationInfo>(HttpStatus.NO_CONTENT);
    }
}
