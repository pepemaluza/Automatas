package e05.states;

import abstract_clases.State;
import e05.enums.E05_Inputs;
import e05.enums.E05_States;

import java.util.HashMap;

public class EwGoReady extends State {

    public EwGoReady() {
        HashMap<String, Enum> map = new HashMap<>();
        map.put(E05_Inputs.CAR_NS, E05_States.EW_STOPPING);
        setPossibleOutcomes(map);
        setDescription("Se termino el timer");
    }

}

