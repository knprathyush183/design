package com.designpatterns.behavirol.state.tvremoteexample;

public class TVContext implements State{

    private State TvState;

    public State getTvState() {
        return TvState;
    }

    public void setTvState(State tvState) {
        TvState = tvState;
    }

    @Override
    public void doAction() {
        this.TvState.doAction();
    }
}
