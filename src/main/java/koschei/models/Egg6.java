package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    private Deth8 death;
    @Autowired
    public Egg6(Deth8 death) {
        this.death = death;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + death.toString();
    }
}
