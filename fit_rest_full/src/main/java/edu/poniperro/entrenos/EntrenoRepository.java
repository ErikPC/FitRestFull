package edu.poniperro.entrenos;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import io.quarkus.mongodb.panache.PanacheMongoRepository;

@ApplicationScoped
public class EntrenoRepository implements PanacheMongoRepository<Entrenos> {

    @Inject
    MongoClient mongoClient;

    public List<Entrenos> list() {
        List<Entrenos> list = new ArrayList<>();
        MongoCursor<Document> cursor = getCollection().find().iterator();
        try {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                Entrenos entrenos = new Entrenos();
                entrenos.setId(document.getString("id"));
                entrenos.setLunes(document.getString("lunes"));
                entrenos.setMartes(document.getString("martes"));
                entrenos.setMiercoles(document.getString("miercoles"));
                entrenos.setJueves(document.getString("jueves"));
                entrenos.setViernes(document.getString("viernes"));
                entrenos.setSabado(document.getString("sabado"));
                entrenos.setDomingo(document.getString("domingo"));
            }
        } finally {
            cursor.close();
        }
        return list;
    }

    private MongoCollection getCollection() {
        return mongoClient.getDatabase("registrio").getCollection("entrnos");
    }

    public long getEntrenos() {

        return getCollection().countDocuments();

    }
}
