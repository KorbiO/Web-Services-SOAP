package ws;

import javax.xml.ws.Endpoint;

public class ServeurJaxWS {
	/*
	 * tester WSDL:  http://localhost:8686/BanqueWS?wsdl
	 */
	public static void main (String[] args) {
		String url = "http://localhost:8686/";
		Endpoint.publish(url, new BanqueService());
		System.out.println("Web Service Déplyé" +url);
	}

}
