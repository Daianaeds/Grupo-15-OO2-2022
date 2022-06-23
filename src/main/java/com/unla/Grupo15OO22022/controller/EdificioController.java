package com.unla.Grupo15OO22022.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.Grupo15OO22022.helpers.ViewRouteHelper;
import com.unla.Grupo15OO22022.models.EdificioModel;
import com.unla.Grupo15OO22022.service.implementation.EdificioService;

@Controller
@RequestMapping("/Edificio")
public class EdificioController {

	@Autowired
	private EdificioService edificioService;
	
	@GetMapping("/")
    public ModelAndView vista() { //retorna un modelo agregado en la vista para procesar el modelo
        ModelAndView mV = new ModelAndView(ViewRouteHelper.MATERIA_INDEX);
        mV.addObject("edificios" ,edificioService.GetAll());
        return mV;
    }
	
	@PostMapping("/Create")
	public RedirectView create(@ModelAttribute("edificio") EdificioModel edificioModel) {
		edificioService.insertOrUpdate(edificioModel);
        return new RedirectView(ViewRouteHelper.MATERIA_ROOT);
    }
}
