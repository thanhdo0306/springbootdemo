package thanhnt20.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GirlFriend {

    @Autowired
    @Qualifier("bikini")
    public Outfit outfit;

    public GirlFriend(Outfit outfit) {
        this.outfit = outfit;
    }

    public GirlFriend() {
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

}
