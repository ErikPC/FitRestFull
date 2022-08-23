package edu.poniperro.registro;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.bson.types.ObjectId;

@Path("/registro")
public class RegistroResource {

    @Inject
    RegistroRepository repository;

    @GET
    public Response get() {
        return Response.ok(repository.listAll()).build();
    }

    @GET
    @Path("/{semana}")
    public Response get(@PathParam("semana") String semana) {
        Registro registro = repository.findById(new ObjectId(semana));
        return Response.ok(registro).build();
    }

}
