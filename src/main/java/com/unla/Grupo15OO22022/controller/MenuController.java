package com.unla.Grupo15OO22022.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.unla.Grupo15OO22022.helpers.ViewRouteHelper;

@Controller
public class MenuController {
	
	@GetMapping({"/"," "})
	public String index() {
		return ViewRouteHelper.MENU;
	}
	
}
