package e05.states;

import abstract_clases.State;
import e05.enums.E05_Inputs;
import e05.enums.E05_States;

import java.util.HashMap;

public class NsGo extends State {

    public NsGo() {
        HashMap<String, Enum> map = new HashMap<>();
        map.put(E05_Inputs.CAR_EW, E05_States.NS_GO_CHANGE);
        map.put(E05_Inputs.TIMER,E05_States.NS_GO_READY);
        setPossibleOutcomes(map);
        setDescription("Autos NS avanzando");
    }

}

