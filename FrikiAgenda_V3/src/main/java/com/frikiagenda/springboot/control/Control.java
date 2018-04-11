package com.frikiagenda.springboot.control;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.frikiagenda.springboot.model.Categoria;
import com.frikiagenda.springboot.servicios.IServicios;





@Controller
public class Control {

	private static Logger logger;

    static {
        try {
            logger = Logger.getLogger(Control.class.getName());
        } catch (Throwable e) {
            System.out.println("Don't work");
        }
    }
    
    
    @Autowired
    private IServicios servicios;
	//private ServiciosCatImp servicios;
	
	@RequestMapping("/")
	public String cargaInicial(ModelMap model){
		logger.log(Level.INFO,"Pantalla inicial");
		@SuppressWarnings("unchecked")
		Iterable<Categoria> listaCategoria = servicios.listar();
		logger.log(Level.INFO,"resultado"+listaCategoria.toString());
		model.addAttribute("listaCategoria", listaCategoria);
		
		
		return "portada";
	}	
	
	
	@RequestMapping(value="/buscar_categoria/{id}", method=RequestMethod.GET)
	public String buscarCategoria(@ModelAttribute Categoria cat,@PathVariable int id, ModelMap model){
		logger.log(Level.INFO,"Buscar categoria");
		
		cat.setId(id);
		Categoria categoria = servicios.read(cat);
		
		model.addAttribute("categoria", categoria);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/borrar_categoria/{id}", method=RequestMethod.GET)
	public ModelAndView borrarCategoria(HttpServletRequest request,@PathVariable int id){
		logger.log(Level.INFO,"Borrar categoria");
		
		servicios.delete(id);
		
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/insertar_categoria", method=RequestMethod.GET)
	public ModelAndView insertarCategoria(){
		logger.log(Level.INFO,"Insertar categoria");
		
		ModelAndView model = new ModelAndView("formularioCategorias");
		model.addObject("categoria", new Categoria());
		
		return model;
	}
	
	@RequestMapping(value="/guardar_categoria", method=RequestMethod.POST)
	public ModelAndView guardarCategoria(@ModelAttribute Categoria cat) {
		logger.log(Level.INFO,"Guardar categoria");
		
		servicios.insert(cat);
		
		ModelAndView model = new ModelAndView("redirect:/");
		
		return model;
	}
	
	@RequestMapping(value="/modificar_categoria/{id}", method=RequestMethod.GET)
	public ModelAndView modificarCategoria(@ModelAttribute Categoria cat,@PathVariable int id){
		logger.log(Level.INFO,"Modificar categoria");
		
		cat.setId(id);
		cat = servicios.read(cat);
		
		ModelAndView model = new ModelAndView("formularioCategorias");
		model.addObject(cat);
		
		return model;
	}
}