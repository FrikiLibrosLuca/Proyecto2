package com.frikiagenda.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.frikiagenda.servicios.IServicios;
import com.frikiagenda.model.Categoria;

@Controller
public class Control {

	@Autowired
	private IServicios servicios;
	
	@RequestMapping("/")
	public ModelAndView cargaInicial() throws Exception{
		List<Categoria> listaCategoria = servicios.read();
		ModelAndView model = new ModelAndView("portada");
		model.addObject(listaCategoria);
		return model;
	}
	
	@RequestMapping(value="/buscar_categoria", method=RequestMethod.GET)
	public ModelAndView buscarCategoria(@ModelAttribute Categoria cat){
		Categoria categoria = servicios.read(cat);
		
		ModelAndView model = new ModelAndView("redirect:/");
		model.addObject(categoria);
		
		return model;
	}
	
	@RequestMapping(value="/borrar_categoria", method=RequestMethod.GET)
	public ModelAndView borrarCategoria(HttpServletRequest request){
		int idCat = Integer.parseInt(request.getParameter("id"));
		servicios.delete(idCat);
		
		return new ModelAndView("redirect:/");
	}
	
	
}
