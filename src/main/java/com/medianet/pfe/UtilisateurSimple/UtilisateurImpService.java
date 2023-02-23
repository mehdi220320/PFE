package com.medianet.pfe.UtilisateurSimple;

import java.util.List;
import java.util.Optional;

public interface UtilisateurImpService {
    public void add(UtilisateurSimple utilisateurSimple);
    public  List<UtilisateurSimple> getAll();
    public void update(UtilisateurSimple utilisateurSimple);
    public UtilisateurSimple getById(long id);
    public void delete(long id);
}
