package bd.edu.daffodilvarsity.controller;


import bd.edu.daffodilvarsity.model.PersonInfo;
import bd.edu.daffodilvarsity.service.ServicePersonInfo;
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
public class ControllerPersonInfo {

    @Autowired
    private ServicePersonInfo servicePersonInfo;

    @RequestMapping(value = "/personinfo", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<PersonInfo>> getPersonInfos() {
        Collection<PersonInfo> personInfos = servicePersonInfo.findAllPersonInfo();
        return new ResponseEntity <Collection<PersonInfo>>(personInfos, HttpStatus.OK);

    }

    @RequestMapping(value = "/personinfo/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <PersonInfo> getPersonInfo (@PathVariable("id") int id) {
        PersonInfo personInfo = servicePersonInfo.findOnePersonInfo(id);
        if (personInfo ==null){
            return new ResponseEntity <PersonInfo>( HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity <PersonInfo>(personInfo, HttpStatus.OK);

    }

    @RequestMapping(value = "/personinfo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonInfo> createEmployeeInfo(@RequestBody PersonInfo personInfo) {
        PersonInfo savePersonInfo = servicePersonInfo.create(personInfo);

        return new ResponseEntity<PersonInfo>(savePersonInfo, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/personinfo/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonInfo> updateEmployeeInfo(@RequestBody PersonInfo personInfo) {
        PersonInfo updatePersonInfo = servicePersonInfo.update(personInfo);
        if (updatePersonInfo == null){
            return new ResponseEntity<PersonInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<PersonInfo>(updatePersonInfo, HttpStatus.OK);
    }

    @RequestMapping(value = "/personinfo/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<PersonInfo> daletePersonInfo(@PathVariable("id") int id) {
        servicePersonInfo.delete(id);

        return new ResponseEntity<PersonInfo>(HttpStatus.NO_CONTENT);
    }
}
