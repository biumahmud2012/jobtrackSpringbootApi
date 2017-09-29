package bd.edu.daffodilvarsity.controller;

import bd.edu.daffodilvarsity.model.Role;
import bd.edu.daffodilvarsity.service.ServiceRole;
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
public class ControllerRole {

    @Autowired
    private ServiceRole serviceRole;

    @RequestMapping(value = "/role", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Role>> getReligionInfos() {
        Collection<Role> roles = serviceRole.findAllRole();
        return new ResponseEntity <Collection<Role>>(roles, HttpStatus.OK);

    }

    @RequestMapping(value = "/role/{role}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <Role> getRole (@PathVariable("role") String role) {
        Role roleOne = serviceRole.findOneRole(role);
        if (roleOne ==null){
            return new ResponseEntity <Role>( HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity <Role>(roleOne, HttpStatus.OK);

    }

    @RequestMapping(value = "/role", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Role> createRole(@RequestBody Role role) {
        Role saveRole = serviceRole.create(role);

        return new ResponseEntity<Role>(saveRole, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/role/{role}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Role> updateRole(@RequestBody Role role) {
        Role updateRole = serviceRole.update(role);
        if (updateRole == null){
            return new ResponseEntity<Role>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<Role>(updateRole, HttpStatus.OK);
    }

    @RequestMapping(value = "/role/{role}", method = RequestMethod.DELETE)
    public ResponseEntity<Role> daleteRole(@PathVariable("role") String role) {
        serviceRole.delete(role);

        return new ResponseEntity<Role>(HttpStatus.NO_CONTENT);
    }
}
