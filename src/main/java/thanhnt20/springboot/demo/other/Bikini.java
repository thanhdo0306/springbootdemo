package thanhnt20.springboot.demo.other;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import thanhnt20.springboot.demo.Outfit;

@Component("bikini")
//@Primary
public class Bikini implements Outfit {
    @Override
    public void wear() {
        System.out.println("I'm wearing bikini");
    }
}
