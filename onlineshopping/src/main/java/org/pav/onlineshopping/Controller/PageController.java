package org.pav.onlineshopping.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value="/hello")
	public ModelAndView Hello(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("Greeting", "Hello Spring MVC!!");
		return mv;
		
	}
	
}
