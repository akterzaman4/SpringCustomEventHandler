package com.simplilearn;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EarthquakeEvenPublisher  implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher publisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
	}
	
	public void publish() {
		EarthquakeEvent earthquakeEvent = new EarthquakeEvent(this);
		publisher.publishEvent(earthquakeEvent);
	}
}

