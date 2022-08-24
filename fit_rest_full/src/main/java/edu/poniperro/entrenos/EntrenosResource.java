package edu.poniperro.entrenos;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/entrenos")
public class EntrenosResource {

    @Inject
    EntrenoRepository repository;

    @GET
    public List<Entrenos> getEntrenos() {
        return repository.list();
    }
}
