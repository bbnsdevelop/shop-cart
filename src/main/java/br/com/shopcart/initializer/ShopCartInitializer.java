package br.com.shopcart.initializer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/shop-cart")
public class ShopCartInitializer {
		
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String init(){
		return "index";
	}
	
	
	
}
