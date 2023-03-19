package ru.gb.hm3.factory_method;

import ru.gb.hm3.factory_method.Action;

public abstract class Bird {

    public void toFly(){
        Action action = action();
        action.toFly();

    }
    public void  toSwim(){
        Action action = action();
        action.toSwim();
    }

    public abstract Action action();
}
