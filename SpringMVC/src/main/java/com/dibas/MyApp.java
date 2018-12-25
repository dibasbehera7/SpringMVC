package com.dibas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		// Fruit myFruit = new Fruit();
		// Vegetable myvegetable = new Vegetable();

		@SuppressWarnings("resource")
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		Fruit myFruit = appContext.getBean("fruit", Fruit.class);
		Vegetable myvegetable = (Vegetable) appContext.getBean("vegetable");
		System.out.println(myFruit.talkAboutYou());
		System.out.println(myvegetable.talkAboutYou());

		/*
		 * Configuration Spring Beans from External Properties Files
		 */
		Fruit externalFruit = appContext.getBean("externalFruit",Fruit.class);
		System.out.println("External Fruit:\n"+externalFruit.talkAboutYou());
		
		
		/*
		 * Setting Bean Properties Example
		 */
		// Vegetable vegWithName = (Vegetable) appContext.getBean("vegWithName");
		// System.out.println(vegWithName.talkAboutYou());
		/*
		 * Setting Collection Type Bean Properties
		 */
		// Fruit fruitWithListAndMap = (Fruit)  
		// appContext.getBean("fruitWithListAndMap");
		// System.out.println(fruitWithListAndMap.talkAboutYou());
		/*
		 * Setting Bean properties using p-namespace
		 */
		// Vegetable vegUsingPNamespace = (Vegetable)
		// appContext.getBean("vegUsingPNamespace");
		// System.out.println(vegUsingPNamespace.talkAboutYou());

		((FileSystemXmlApplicationContext) appContext).close();

	}

}
