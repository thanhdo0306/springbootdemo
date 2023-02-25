package thanhnt20.springboot.demo;

import org.springframework.stereotype.Component;

@Component("dress")
public class Dress implements Outfit {

    @Override
    public void wear() {
        System.out.println("I'm wearing a dress");
    }
}
