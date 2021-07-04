package com.simplilearn;

import org.springframework.context.ApplicationListener;

public class EarthquakeEvenHandler  implements ApplicationListener<EarthquakeEvent>{
	
	@Override
	public void onApplicationEvent(EarthquakeEvent event) {
		System.out.println(event.toString());
	}

}
