package com.guillaumehanotel.webservices01.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.guillaumehanotel.webservices01.ws.HelloWorld;

public class HelloWorldClient{

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:9999/ws/hello?wsdl");
        QName qname = new QName("http://ws.webservices01.guillaumehanotel.com/", "HelloWorldImplService");
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
        System.out.println(hello.getHelloWorldAsString("Guillaume"));

    }

}
