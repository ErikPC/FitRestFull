package edu.poniperro.registro;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.arc.lookup.LookupIfProperty.List;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

@ApplicationScoped
public class RegistroRepository implements PanacheMongoRepository<Registro> {

    public Registro findBySemana(String semana) {
        return find("semana", semana).firstResult();
    }

}
