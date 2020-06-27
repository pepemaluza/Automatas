package e05.states;

import abstract_clases.State;
import e05.enums.E05_Inputs;
import e05.enums.E05_States;

import java.util.HashMap;

public class EwStopping extends State {

    public EwStopping() {
        HashMap<String, Enum> map = new HashMap<>();
        map.put(E05_Inputs.TIMER,E05_States.NS_GO);
        setPossibleOutcomes(map);
        setDescription("Se frenan los autos EW");
    }

}

