package abstract_clases;

import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class State {
    /*
    Es un mapa que tiene como clave el input y como estado el siguiente estado al que pasara si recibe dicho input
     */
    HashMap<String, Enum> possibleOutcomes;



    /*
    Es una descripcion del estado actual de la maquina para mostrar en consola
     */
    String description;

    /*
    A partir del input que recibo y el estado en el que estoy, calculo cual sera mi proximo estado
     */
    public Object calculateNextState(String value) {
        return getPossibleOutcomes().get(value);
    }

    public HashMap<String, Enum> getPossibleOutcomes() {
        return possibleOutcomes;
    }

    public void setPossibleOutcomes(HashMap<String, Enum> possibleOutcomes) {
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
