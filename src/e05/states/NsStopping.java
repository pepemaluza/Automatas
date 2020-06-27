package e05.states;

import abstract_clases.State;
import e05.enums.E05_Inputs;
import e05.enums.E05_States;

import java.util.HashMap;

public class NsStopping extends State {

    public NsStopping() {
        HashMap<String, Enum> map = new HashMap<>();
        map.put(E05_Inputs.TIMER,E05_States.EW_GO);
        setPossibleOutcomes(map);
        setDescription("Se frenan los autos NS");
    }

}

