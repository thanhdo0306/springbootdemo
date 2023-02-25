package thanhnt20.springboot.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dress")
//@Primary
public class Dress implements Outfit {

    @Override
    public void wear() {
        System.out.println("I'm wearing a dress");
    }
}
