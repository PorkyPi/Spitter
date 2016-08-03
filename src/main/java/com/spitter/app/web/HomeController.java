package com.spitter.app.web;

import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spitter.app.services.SpitterService;

@Controller
public class HomeController {
	public static final int DEFAULT_SPITTLES_PER_PAGE = 25;
	
	private SpitterService spitterService;
	
	@Inject
	public HomeController(SpitterService spitterService) {
		this.spitterService = spitterService;
	}
	
	@RequestMapping({"/","/home"})
	public String shoeHomePage(Map<String, Object> model){
		model.put("spittles", spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE));
		return "home";
	}
}