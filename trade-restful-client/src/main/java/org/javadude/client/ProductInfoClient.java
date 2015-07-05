package org.javadude.client;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ProductInfoClient implements ProductClient {

	public String getProductInfo(String productId){
		Client client = new Client();
		WebResource resource = client.resource("http://localhost:8081/trade-restful-service/product/get/"+productId);
		ClientResponse response = resource.type(MediaType.APPLICATION_XML).get(ClientResponse.class);
		String result = response.getEntity(String.class);
		return result;
	}
}
