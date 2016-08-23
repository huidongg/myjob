package com.hd.job.helloword;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/test", produces = "text/html;charset=UTF-8")
public class HelloWordController {
	@RequestMapping(value = "/hello")
	public ModelAndView helloword() {
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("title", "Spring MVC And Freemarker");
		mv.addObject("content", "Hello world ， test my first spring mvc ! ");
		return mv;
	}

}
