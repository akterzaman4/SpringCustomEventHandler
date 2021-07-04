package com.simplilearn;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		EarthquakeEvenPublisher cvp = (EarthquakeEvenPublisher)context.getBean("earthquakeEvenPublisher");
		cvp.publish();

	}

}
