package com.frikiagenda.springboot.control;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;



import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
		
		return "plantillaHTML";
	}
	
	@RequestMapping(value="/listaCat", method=RequestMethod.GET)
	public Object cargarLista(){
		logger.log(Level.INFO, "Dentro de listaCat");
		logger.log(Level.INFO,"listCat");
		
		Iterable<Categoria> listaCategoria = servicios.listar();
		logger.log(Level.INFO, "JSON" + (String) this.jsonator(listaCategoria));
		
		
		return this.jsonator(listaCategoria);
		
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
	
	public Object jsonator(Iterable<Categoria> lCat) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(lCat);
		} catch (JsonProcessingException e) {
			logger.log(Level.WARNING,"No puedo Convertir a JSON");
			return null;
		} 
	}
}