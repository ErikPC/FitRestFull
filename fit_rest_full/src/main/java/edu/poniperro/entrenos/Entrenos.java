package edu.poniperro.entrenos;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Entrenos extends PanacheMongoEntity {

    public String id;
    public String lunes;
    public String martes;
    public String miercoles;
    public String jueves;
    public String viernes;
    public String sabado;
    public String domingo;

}
