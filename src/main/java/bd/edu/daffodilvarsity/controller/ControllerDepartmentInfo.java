package bd.edu.daffodilvarsity.controller;

import bd.edu.daffodilvarsity.model.DepartmentInfo;
import bd.edu.daffodilvarsity.service.ServiceDepartmentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by mahmud on 12/29/16.
 */

@RestController
public class ControllerDepartmentInfo {

    @Autowired
    private ServiceDepartmentInfo serviceDepartmentInfo;

    @RequestMapping(value = "/departmentinfo", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<DepartmentInfo>> getDepartmentInfos() {
        Collection<DepartmentInfo> departmentInfos = serviceDepartmentInfo.findAllDepartmentInfo();
        return new ResponseEntity <Collection<DepartmentInfo>>(departmentInfos, HttpStatus.OK);

    }

    @RequestMapping(value = "/departmentinfo/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <DepartmentInfo> getDepartmentInfo (@PathVariable("id") int id) {
        DepartmentInfo departmentInfo = serviceDepartmentInfo.findOneDepartmentInfo(id);
        if (departmentInfo ==null){
            return new ResponseEntity <DepartmentInfo>( HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity <DepartmentInfo>(departmentInfo, HttpStatus.OK);

    }

    @RequestMapping(value = "/departmentinfo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DepartmentInfo> createDepartmentInfo(@RequestBody DepartmentInfo departmentInfo) {
        DepartmentInfo saveDepartmentInfo = serviceDepartmentInfo.create(departmentInfo);

        return new ResponseEntity<DepartmentInfo>(saveDepartmentInfo, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/departmentinfo/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DepartmentInfo> updateDepartmentInfo(@RequestBody DepartmentInfo departmentInfo) {
        DepartmentInfo updateDepartmentInfo = serviceDepartmentInfo.update(departmentInfo);
        if (updateDepartmentInfo == null){
            return new ResponseEntity<DepartmentInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<DepartmentInfo>(updateDepartmentInfo, HttpStatus.OK);
    }

    @RequestMapping(value = "/departmentinfo/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<DepartmentInfo> daleteDepartmentInfo(@PathVariable("id") int id) {
        serviceDepartmentInfo.delete(id);

        return new ResponseEntity<DepartmentInfo>(HttpStatus.NO_CONTENT);
    }
}
