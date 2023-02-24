package com.medianet.pfe.UtilisateurSimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class  UtilisateurService implements UtilisateurImpService{
    @Autowired
    UtilisateurSimpleRepository utilisateurSimpleRepository;

    @Override
    public void add( UtilisateurSimple user){utilisateurSimpleRepository.save(user);}
    @Override
    public List<UtilisateurSimple> getAll(){
        return utilisateurSimpleRepository.findAll();
    }

    @Override
    public void update(UtilisateurSimple user) {
        utilisateurSimpleRepository.save(user);

    }
    @Override
    public UtilisateurSimple getById( long id){return utilisateurSimpleRepository.findById(id).get();}



    @Override
    public void delete(long id){utilisateurSimpleRepository.deleteById(id);}
}
