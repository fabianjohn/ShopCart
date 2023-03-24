package org.emailverification.controller;

import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.List;
import java.util.Random;

import org.emailverification.entity.Category;
import org.emailverification.entity.Product;
import org.emailverification.services.CategoryService;
import org.emailverification.services.CustomersServices;
import org.emailverification.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
	
	@Autowired
	CustomersServices custService;
	
	@Autowired
	CategoryService catService;
	
	@Autowired
	ProductService  productService;
	
	@RequestMapping("/gg")
	public String home() {
		return "home";
	}
	
	@GetMapping("/add")
    public String CatForm(Model model){
       model.addAttribute("category", new Category());
        System.out.print("Registration successful");
               return "category";
               
	}
	
	@GetMapping("/addproduct")
    public String ProductForm(Model model){
       model.addAttribute("product", new Product());
      
               return "input_product";
               
	}
	
	@GetMapping("/")
	public String viewJobs(Model model)
	{
		List<Category>listcategory = catService.listAll();
		List<Product>listproduct = productService.listAll();
		model.addAttribute("listcategory", listcategory);
		model.addAttribute("listproduct", listproduct);
		System.out.print("Get / ");
		
		return "home";
	}
	
	@RequestMapping(value = "/saved", method = RequestMethod.POST)
	public String saveCategory(@ModelAttribute("category") 	Category newcat, Model model) {
                model.addAttribute("message", "Register Successful");
                System.out.println("Add success");
                catService.save(newcat);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/savedProduc", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product newproduct, Model model) {
		      Product product = new Product();
			  Random random = new Random();
			  int randomCode = random.nextInt(100000); 
			  product.setCode(randomCode);
                model.addAttribute("message", "Product added Successful");
                System.out.print(randomCode);
                productService.save(newproduct);
		return "redirect:/";
	}
	
	@RequestMapping({"/apply"})
	 public ModelAndView findCategory(Category category) {
	 ModelAndView mv = new ModelAndView();
	 mv.addObject("obj", category);
	 mv.setViewName("cat_home");
	 
	 return mv;
}

	
	@RequestMapping({"/input_product"})
	 public ModelAndView loadImage(Product product) {
	 ModelAndView mv = new ModelAndView();
	
	Base64.Encoder encoder = Base64.getEncoder();
	 String encoded = encoder.encodeToString(product.getImage());
	 Encoder encodeBase64 = Base64.getUrlEncoder();
	   String base64Encoded = new String("UTF-8");
	   mv.addObject("image", base64Encoded );
	   mv.addObject("image", encoded );
	   mv.addObject("image", encodeBase64);
	 mv.addObject("obj", product);
	 mv.setViewName("home");
	 
	 return mv;
}

	
		
	}


	


