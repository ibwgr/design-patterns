package com.iluwatar.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Condition {

    private List<ConditionObserver> observers = new ArrayList<>();

    public void addObserver(ConditionObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(ConditionObserver obs) {
        observers.remove(obs);
    }

    public void notifyObservers(Condition currentCondition){
        for(ConditionObserver obs : observers){
            obs.update(currentCondition);
        }

    }

}
