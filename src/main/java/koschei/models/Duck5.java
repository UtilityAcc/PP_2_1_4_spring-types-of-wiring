package koschei.models;

import org.springframework.stereotype.Component;


public class Duck5 {
    private Egg6 egg;

    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }

    public Duck5(Egg6 egg){
        this.egg = egg;
    }

}
