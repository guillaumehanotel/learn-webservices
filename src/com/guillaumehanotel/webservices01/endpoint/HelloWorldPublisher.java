package com.guillaumehanotel.webservices01.endpoint;

import javax.xml.ws.Endpoint;
import com.guillaumehanotel.webservices01.ws.HelloWorldImpl;

public class HelloWorldPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
	}
	
}
