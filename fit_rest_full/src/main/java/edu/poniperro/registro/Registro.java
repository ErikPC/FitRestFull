package edu.poniperro.registro;

import java.util.List;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Registro extends PanacheMongoEntity {

    public String semana;
    public String tipo;
    public List listaEjercicios;
    public String comentarios;
}
