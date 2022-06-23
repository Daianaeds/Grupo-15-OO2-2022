package com.unla.Grupo15OO22022.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.Grupo15OO22022.entity.Final;
import com.unla.Grupo15OO22022.entity.Materia;
import com.unla.Grupo15OO22022.helpers.ViewRouteHelper;
import com.unla.Grupo15OO22022.models.NotaPedidoModel;
import com.unla.Grupo15OO22022.service.implementation.AulaService;
import com.unla.Grupo15OO22022.service.implementation.MateriaService;
import com.unla.Grupo15OO22022.service.implementation.NotaPedidoService;


@Controller
@RequestMapping("/NotaPedido")
public class NotaPedidoController {

	@Autowired
	@Qualifier("notaPedidoService")
	private NotaPedidoService notaPedidoService;

	@Autowired
	@Qualifier("materiaService")
	private MateriaService materiaService;

	@Autowired
	@Qualifier("aulaService")
	private AulaService aulaService;

	@GetMapping("")
	public String listar(Model model) { // retorna un modelo agregado en la vista para procesar el modelo
		model.addAttribute("notaspedido", notaPedidoService.GetAll());
		return ViewRouteHelper.NOTAPEDIDO_LISTAR;
	}
	

//	@GetMapping("/nuevo")
//	public ModelAndView vista() { // retorna un modelo agregado en la vista para procesar el modelo
//		ModelAndView mV = new ModelAndView(ViewRouteHelper.NOTAPEDIDO_NEW);
//		mV.addObject("notapedido", new Final());
//		mV.addObject("materias", materiaService.GetAll());
//		mV.addObject("aulas", aulaService.GetAll());
//		return mV;
//	}

	@GetMapping("/nuevo")
	public String vista(Model model) { // retorna un modelo agregado en la vista para procesar el modelo

		model.addAttribute("final", new Final());
		model.addAttribute("materias", materiaService.GetAll());
		model.addAttribute("aulas", aulaService.GetAll());
		return ViewRouteHelper.NOTAPEDIDO_NEW;
	}

//	@PostMapping("/create")
//	public RedirectView create(@ModelAttribute("notapedido") Final notaPedidoModel) {
//		System.out.println(notaPedidoModel);
//		notaPedidoService.crearFinal(notaPedidoModel);
//		return new RedirectView(ViewRouteHelper.NOTAPEDIDO_ROOT);
//	}

	@PostMapping("/create")
	public RedirectView create(@ModelAttribute("final") Final notapedido, BindingResult result, ModelMap model) {
		System.out.println(notapedido); 
		List<Materia> materias = materiaService.GetAll();
//		notapedido.setMateria(materias.get(1));
		notaPedidoService.save(notapedido);
		return new RedirectView(ViewRouteHelper.NOTAPEDIDO_ROOT);
	}

	@PostMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") int id) {
		notaPedidoService.delete(id);
		return new RedirectView(ViewRouteHelper.NOTAPEDIDO_ROOT);
	}

	@GetMapping("/update/{id}")
	public ModelAndView updateGet(@PathVariable("id") int id) {
		ModelAndView mV = new ModelAndView(ViewRouteHelper.NOTAPEDIDO_MODIFICAR);
		mV.addObject("departamento", notaPedidoService.findById(id));
		return mV;
	}

	@PostMapping("/updatePost")
	public RedirectView updatePost(@ModelAttribute("notapedido") NotaPedidoModel notaPedidoModel) {
		notaPedidoService.update(notaPedidoModel);
		return new RedirectView(ViewRouteHelper.NOTAPEDIDO_ROOT);
	}

}
