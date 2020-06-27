package e01;

import abstract_clases.State;
import enums.E01_Inputs;
import enums.E01_States;

import java.util.HashMap;
import java.util.List;

public class S00_E1 extends State {

    public S00_E1() {
        HashMap<String, E01_States> map = new HashMap<>();
        map.put(E01_Inputs.MATERIALS_AVAILABLE,E01_States.S2);
        map.put(E01_Inputs.MATERIALS_NOT_AVAILABLE,E01_States.S1);
        setPossibleOutcomes(map);
        setDescription("Esperando vaso");
    }

}