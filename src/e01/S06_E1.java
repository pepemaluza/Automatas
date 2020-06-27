package e01;

import abstract_clases.State;
import enums.E01_Inputs;
import enums.E01_States;

import java.util.HashMap;

public class S06_E1 extends State {

    public S06_E1() {
        HashMap<String, Enum> map = new HashMap<>();
        map.put(E01_Inputs.FINISH_SERVING,E01_States.S0);
        setPossibleOutcomes(map);
        setDescription("Terminando de servir cafe");
    }


}
