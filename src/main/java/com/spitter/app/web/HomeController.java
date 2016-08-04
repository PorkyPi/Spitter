package com.spitter.app.web;

import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spitter.app.servcices.SpitterService;


@Controller
public class HomeController {
	public static final int DEFAULT_SPITTLES_PER_PAGE = 25;
	
	private SpitterService spittleService;
	
	@Inject
	public HomeController(SpitterService spitterService) {
		this.spittleService = spitterService;
	}
	
	@RequestMapping(value={"/","/home"}, method=RequestMethod.GET)
	  public String showHomePage(Map<String, Object> model) {
	    model.put("spittles", spittleService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE));
	    return "home";
	  }
}