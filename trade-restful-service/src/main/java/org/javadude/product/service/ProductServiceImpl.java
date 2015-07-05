package org.javadude.product.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.javadude.product.Product;
import org.javadude.product.dao.ProductInfoDAO;

@Path("/product")
public class ProductServiceImpl extends ProductServiceContext implements ProductService{

	@GET
	@Path("/get/{productId}")
	@Produces(MediaType.APPLICATION_XML)
	public Product getProductService(@PathParam("productId") String productId) {
		
		ProductInfoDAO productInfoDAO = (ProductInfoDAO) context.getBean("productInfoDAOImpl");
		Product product =productInfoDAO.getProductInfo(productId);
		return product;
	}

}
