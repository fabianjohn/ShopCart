package org.emailverification.controller;

import java.io.IOException;
import java.util.Base64;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.emailverification.entity.Product;
import org.emailverification.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/images")
public class ImageController {
	
	@Resource(name="productService")
	private ProductService productService;

	
	@RequestMapping(value = "/savedProduct", method = RequestMethod.GET)
	public String showImage(@RequestParam("image") String code, HttpServletResponse response, HttpServletRequest request) 
	 throws ServletException, IOException{
	//	var base64EncodedImage = Base64.getEncoder().encodeToString();
             Product product = productService.get(code);
             response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
             response.getOutputStream().write(product.getImage());
             
             response.getOutputStream().close();
             
			return "redirect:/";
             

}
	
	
	
	/*
	 * 
	 * 
	 * */
}