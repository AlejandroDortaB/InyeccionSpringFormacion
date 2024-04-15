package inyeccionSpring.inyeccionSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	//Ejemplo con XML
    	  System.out.println("Ejemplo con XML");
    	ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Zoo zooXml= contexto.getBean("zoo",Zoo.class);
    	zooXml.getAnimal().Food();
    	zooXml.getAnimal().Reproduction();
        System.out.println("");
        
      //Ejemplo con ZooConfig
    	AnnotationConfigApplicationContext contexto2= new AnnotationConfigApplicationContext(ZooConfig.class);
    	System.out.println("Ejemplo con ZooConfig");
    	Zoo zooConfig= contexto.getBean("zoo",Zoo.class);
    	zooConfig.getAnimal().Food();
    	zooConfig.getAnimal().Reproduction();
        System.out.println("");
      
        
        //Comprobando el singleton
        System.out.println("Comprobando el singleton");
    	Zoo zooConfig2= contexto.getBean("zoo",Zoo.class);
    	System.out.println(zooConfig);
    	System.out.println(zooConfig2);
    	 System.out.println("");
    	 
    	//Comprobando el Prototype
    	System.out.println("Comprobando el Prototype");
    	System.out.println("");
    	System.out.println(zooConfig.generateWorker());
    	System.out.println(zooConfig.generateWorker());
    	 System.out.println("");
    	 
    	
    	
         
    }
}
