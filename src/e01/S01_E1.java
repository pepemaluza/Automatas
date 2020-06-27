package e01;

import abstract_clases.State;
import enums.E01_Inputs;
import enums.E01_States;

import java.util.HashMap;

public class S01_E1 extends State {

    public S01_E1() {
        HashMap<String, Enum> map = new HashMap<>();
        map.put(E01_Inputs.MATERIALS_AVAILABLE,E01_States.S2);
        map.put(E01_Inputs.MATERIALS_NOT_AVAILABLE,E01_States.S1);
        setPossibleOutcomes(map);
        setDescription("Esperando vaso");
    }
}
