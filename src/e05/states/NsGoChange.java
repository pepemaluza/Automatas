package e05.states;

import abstract_clases.State;
import e05.enums.E05_Inputs;
import e05.enums.E05_States;

import java.util.HashMap;

public class NsGoChange extends State {

    public NsGoChange() {
        HashMap<String, Enum> map = new HashMap<>();
        map.put(E05_Inputs.TIMER, E05_States.NS_STOPPING);
        setPossibleOutcomes(map);
        setDescription("Llego un auto EW");
    }

}

