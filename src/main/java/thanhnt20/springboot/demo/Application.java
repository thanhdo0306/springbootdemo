package thanhnt20.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import thanhnt20.springboot.demo.other.Bikini;

@SpringBootApplication
//@ComponentScan({"thanhnt20.springboot.demo"})
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		// Example about bean (1)
		Dress dress1 = context.getBean(Dress.class);
		System.out.println("Demo by ThanhNT20 ==> Instance 1: " + dress1);
		dress1.wear();

		//	Example about bean (2)
//		Dress dress2= context.getBean(Dress.class);
//		System.out.println("Demo by ThanhNT20 ==> Instance 2: " + dress2);
//		dress1.wear();

		//	Example about bean from Interface
		Outfit outfit = context.getBean(Outfit.class);
		System.out.println("Demo by ThanhNT20 ==> Instance from Interface: " + outfit);
		outfit.wear();

		// Example about component scan
		Bikini bikini = context.getBean(Bikini.class);
		System.out.println("Demo by ThanhNT20 ==> Instance bikini: " + bikini);
		bikini.wear();

	}

}
