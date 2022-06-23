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
import com.unla.Grupo15OO22022.models.MateriaModel;
import com.unla.Grupo15OO22022.service.implementation.MateriaService;

@Controller
@RequestMapping("/Materia") //extension de la URL para la vista
public class MateriaController {

	@Autowired
	private MateriaService materiaService;
	
	@GetMapping("/")
    public ModelAndView vista() { //retorna un modelo agregado en la vista para procesar el modelo
        ModelAndView mV = new ModelAndView(ViewRouteHelper.MATERIA_INDEX);
        mV.addObject("materias" ,materiaService.GetAll());
        return mV;
    }
	
	@PostMapping("/Create")
	public RedirectView create(@ModelAttribute("materia") MateriaModel materiaModel) {
        materiaService.insertOrUpdate(materiaModel);
        return new RedirectView(ViewRouteHelper.MATERIA_ROOT);
    }
}
