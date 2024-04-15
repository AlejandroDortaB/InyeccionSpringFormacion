package inyeccionSpring.inyeccionSpring;

import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
	
	
	private IAnimal animal;
	
	@Autowired
	public Zoo(@Qualifier("tortoise") IAnimal animal) {
		this.animal=animal;
	}

	public IAnimal getAnimal() {
		return animal;
	}

	
	public void setAnimal(IAnimal animal) {
		this.animal = animal;
	}
	
	@Bean
	@Scope("prototype")
	public Person generateWorker() {
		return new Person();
	}

}
