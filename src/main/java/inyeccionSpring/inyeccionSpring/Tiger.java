package inyeccionSpring.inyeccionSpring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Tiger implements IAnimal {

	@Override
	public void Reproduction() {
		System.out.println("Los tigres son mamífero");

	}

	@Override
	public void Food() {
		System.out.println("Los tigres comen Carne ");

	}

}
