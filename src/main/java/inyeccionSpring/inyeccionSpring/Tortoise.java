package inyeccionSpring.inyeccionSpring;

import org.springframework.stereotype.Component;

@Component
public class Tortoise implements IAnimal {

	public void Reproduction() {
		System.out.println("Las tortugas son oviparas");
	}
	
	public void Food() {
		System.out.println("Las totugas comen: hojas, tallos, raíces, flores, semillas y frutos ");
	}
	

}
