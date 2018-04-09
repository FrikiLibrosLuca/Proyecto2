package com.frikiagenda.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="/buscar_categoria/{id}", method=RequestMethod.GET)
	public ModelAndView buscarCategoria(@ModelAttribute Categoria cat,@PathVariable int id){
		cat.setId(id);
		Categoria categoria = servicios.read(cat);
		
		ModelAndView model = new ModelAndView("redirect:/");
		model.addObject(categoria);
		
		return model;
	}
	
	@RequestMapping(value="/borrar_categoria/{id}", method=RequestMethod.GET)
	public ModelAndView borrarCategoria(HttpServletRequest request,@PathVariable int id){
		servicios.delete(id);
		
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/insertar_categoria", method=RequestMethod.GET)
	public ModelAndView insertarCategoria(){
		ModelAndView model = new ModelAndView("formularioCategorias");
		model.addObject("categoria", new Categoria());
		
		return model;
	}
	
	@RequestMapping(value="/guardar_categoria", method=RequestMethod.POST)
	public ModelAndView guardarCategoria(@ModelAttribute Categoria cat) {
		servicios.insert(cat);
		
		ModelAndView model = new ModelAndView("redirect:/");
		
		return model;
	}
	
	@RequestMapping(value="/modificar_categoria/{id}", method=RequestMethod.GET)
	public ModelAndView modificarCategoria(@ModelAttribute Categoria cat,@PathVariable int id){
		cat.setId(id);
		cat = servicios.read(cat);
		
		ModelAndView model = new ModelAndView("formularioCategorias");
		model.addObject(cat);
		
		return model;
	}
}