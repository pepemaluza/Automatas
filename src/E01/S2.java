package E01;

import fsm.State;


public class S2 implements State{

    @Override
    public State next(State previous) {
        // TODO Auto-generated method stub
        return null;
    }


    public State next (S3 next){
        return null;

    }
    public State next (S4 next){
        return null;

    }

    @Override
    public void printState() {
        // TODO Auto-generated method stub

    }
    
}