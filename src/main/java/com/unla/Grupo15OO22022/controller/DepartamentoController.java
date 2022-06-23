package com.unla.Grupo15OO22022.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.Grupo15OO22022.helpers.ViewRouteHelper;
import com.unla.Grupo15OO22022.models.DepartamentoModel;
import com.unla.Grupo15OO22022.service.implementation.DepartamentoService;

@Controller
@RequestMapping("/Departamento")
public class DepartamentoController {

	@Autowired
	private DepartamentoService departamentoService;

	@GetMapping("")
	public ModelAndView listar() {
		ModelAndView mV = new ModelAndView(ViewRouteHelper.DEPARTAMENTO_LISTAR);
		mV.addObject("departamentos", departamentoService.GetAll());
		return mV;
	}
	
	@GetMapping("/nuevo")
	public ModelAndView vista() { // retorna un modelo agregado en la vista para procesar el modelo
		ModelAndView mV = new ModelAndView(ViewRouteHelper.DEPARTAMENTO_NEW);
		mV.addObject("departamento", new DepartamentoModel());
		return mV;
	}

	@PostMapping("/create")
	public RedirectView create(@ModelAttribute("departamento") DepartamentoModel departamentoModel) {
		System.out.println(departamentoModel);
		departamentoService.crear(departamentoModel);
		return new RedirectView(ViewRouteHelper.DEPARTAMENTO_ROOT);
	}
	
	@PostMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") int id){
		departamentoService.delete(id);
		return new RedirectView(ViewRouteHelper.DEPARTAMENTO_ROOT);
	}
	
	@GetMapping("/update/{id}")
	public ModelAndView updateGet(@PathVariable("id") int id){
		ModelAndView mV = new ModelAndView(ViewRouteHelper.DEPARTAMENTO_MODIFICAR);
		mV.addObject("departamento", departamentoService.findById(id));
		return mV;
	}
	
	@PostMapping("/updatePost")
	public RedirectView updatePost(@ModelAttribute("departamento") DepartamentoModel departamentoModel) {
		departamentoService.update(departamentoModel);
		return new RedirectView(ViewRouteHelper.DEPARTAMENTO_ROOT);
	}

}
