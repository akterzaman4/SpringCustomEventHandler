package com.simplilearn;

import org.springframework.context.ApplicationEvent;

public class EarthquakeEvent extends ApplicationEvent  {
	
	private static final long serialVersionUID=1l;
	public EarthquakeEvent(Object source) {
	super(source);	
	}

	@Override
	public String toString() {
		return "Earth quake alert";
	}
}
