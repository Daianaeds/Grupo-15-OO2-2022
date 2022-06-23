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
import com.unla.Grupo15OO22022.models.CarreraModel;
import com.unla.Grupo15OO22022.service.implementation.CarreraService;

@Controller
@RequestMapping("/Carrera")
public class CarreraController {
	
	@Autowired
	private CarreraService carreraService;
	
	@GetMapping("/")
    public ModelAndView vista() { //retorna un modelo agregado en la vista para procesar el modelo
        ModelAndView mV = new ModelAndView(ViewRouteHelper.MATERIA_INDEX);
        mV.addObject("carreras" ,carreraService.GetAll());
        return mV;
    }
	
	@PostMapping("/Create")
	public RedirectView create(@ModelAttribute("carrera") CarreraModel carreraModel) {
		carreraService.insertOrUpdate(carreraModel);
        return new RedirectView(ViewRouteHelper.MATERIA_ROOT);
    }

}
