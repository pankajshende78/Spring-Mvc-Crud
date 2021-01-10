package springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import springmvc.dao.UserDao;
import springmvc.model.Products;

@Controller
public class controller {
	
	@Autowired
	private UserDao productdao;
	
	
	@RequestMapping("/table")
	public String Home(Model m)
	{
	List<Products> products=productdao.getProducts();
		
	
		m.addAttribute("product" ,products);
		return "table";
	}
	
	
	
	
	@RequestMapping("/add")
	public String addproduct(Model m)
	{
		m.addAttribute("title","Add Product");
		
		
		return "add_product_form";
	}
	
	
	
	//handle form
	
	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Products product  ,HttpServletRequest request)
	{
		
		productdao.createProducts(product);
		System.out.println(product);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/table");
		return redirectView;
	}
	
	
	//Delete Handler
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId,HttpServletRequest request)
	{
		this.productdao.deleteProduct(productId);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/table");
		return redirectView;
	}
	
	
	
	//update handler
	
	@RequestMapping("/update/{productId}")
	public String updateForm(@PathVariable ("productId") int pid,  Model model)
	{
		
		Products product=this.productdao.getProducts(pid);
		model.addAttribute("product",product);
		return "update_form";
	}

}
