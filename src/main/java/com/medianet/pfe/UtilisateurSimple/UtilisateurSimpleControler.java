package com.medianet.pfe.UtilisateurSimple;

import com.medianet.pfe.UtilisateurSimple.UtilisateurSimple;
import com.medianet.pfe.UtilisateurSimple.UtilisateurSimpleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.ThreadContext.isEmpty;

@RestController
@RequestMapping(value = "/api")
public class UtilisateurSimpleControler {
    @Autowired
    UtilisateurImpService service;

    @PostMapping("/user")
    public void add(@RequestBody UtilisateurSimple user){service.add(user);}
    @GetMapping("/user")
    public void getAll(){
        service.getAll();
    }
    @GetMapping("/user/{id}")
    public void getbyId(@PathVariable(name = "id")long id){
        service.getById(id);
    }

    @PutMapping("/user/update")
    public void update(@RequestBody UtilisateurSimple user){
        service.update(user);
    }
    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable(name = "id")long id){service.delete(id);}
}
