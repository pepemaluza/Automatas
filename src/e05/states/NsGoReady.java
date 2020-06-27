package e05.states;

import abstract_clases.State;
import e05.enums.E05_Inputs;
import e05.enums.E05_States;

import java.util.HashMap;

public class NsGoReady extends State {

    public NsGoReady() {
        HashMap<String, Enum> map = new HashMap<>();
        map.put(E05_Inputs.CAR_EW, E05_States.NS_STOPPING);
        setPossibleOutcomes(map);
        setDescription("Se termino el Timer");
    }

}

