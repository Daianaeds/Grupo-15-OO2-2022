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
import com.unla.Grupo15OO22022.models.AulaModel;
import com.unla.Grupo15OO22022.service.implementation.AulaService;

@Controller
@RequestMapping("/Aula")
public class AulaController {

	
	@Autowired
	private AulaService aulaService;
	
	@GetMapping("/")
    public ModelAndView vista() { //retorna un modelo agregado en la vista para procesar el modelo
        ModelAndView mV = new ModelAndView(ViewRouteHelper.MATERIA_INDEX);
        mV.addObject("aulas" ,aulaService.GetAll());
        return mV;
    }
	
	@PostMapping("/Create")
	public RedirectView create(@ModelAttribute("aula") AulaModel aulaModel) {
		aulaService.insertOrUpdate(aulaModel);
        return new RedirectView(ViewRouteHelper.MATERIA_ROOT);
    }

}
