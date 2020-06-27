package abstract_clases;

import enums.E01_Inputs;
import enums.E01_States;
import models.Value;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class State {
    /*
    Es un mapa que tiene como clave el input y como estado el siguiente estado al que pasara si recibe dicho input
     */
    HashMap<String,E01_States> possibleOutcomes;



    /*
    Es una descripcion del estado actual de la maquina para mostrar en consola
     */
    String description;

    /*
    A partir del input que recibo y el estado en el que estoy, calculo cual sera mi proximo estado
     */
    public E01_States calculateNextState(String value) {
        return getPossibleOutcomes().get(value);
    }

    public HashMap<String, E01_States> getPossibleOutcomes() {
        return possibleOutcomes;
    }

    public void setPossibleOutcomes(HashMap<String, E01_States> possibleOutcomes) {
        this.possibleOutcomes = possibleOutcomes;
    }

    public Set<String> getPossibleActions(){
        return getPossibleOutcomes().keySet().stream().map(Object::toString).collect(Collectors.toSet());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
