package com.kits.learnspringmvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping( value= {"/", "/home"})
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping (value="/test",method = RequestMethod.GET)
	public String doGet() {
		return "test1";
	}
	
	@RequestMapping (value ="/test", method = RequestMethod.POST)
	public String doPost() {
		return "test2";
	}
	@RequestMapping(value = "/method0", headers = "name=kai")
	  public String method0() {
	    return "page0";
	  }
	  @RequestMapping(value = "/method1", headers = { "name=kai", "id=1" })
	  public String method1() {
	    return "page1";
	  }
	  @RequestMapping(value = "/method2", produces = {"application/json"})
	  public String method2() {
	    return "page2";
	  }
	
}
