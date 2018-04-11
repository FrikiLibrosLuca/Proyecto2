package com.frikiagenda.springboot.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.frikiagenda.springboot.dao.DaoCatImp;
import com.frikiagenda.springboot.model.Categoria;
import com.frikiagenda.springboot.servicios.IServicios;



@Controller
public class Control {

	private static Logger logger;

    static {
        try {
            logger = LogManager.getLogger(Control.class);
        } catch (Throwable e) {
            System.out.println("Don't work");
        }
    }
    
    
	@Autowired
	private IServicios servicios;
	
	@RequestMapping("/")
	public ModelAndView cargaInicial() throws Exception{
		logger.trace("Pantalla inicial");
		List<Categoria> listaCategoria = servicios.read();
		logger.debug("Lista recuperacion categoria" + listaCategoria.toString());
		ModelAndView model = new ModelAndView("portada");
		model.addObject(listaCategoria);
		return model;
	}
	
	
	
	@RequestMapping(value="/buscar_categoria/{id}", method=RequestMethod.GET)
	public ModelAndView buscarCategoria(@ModelAttribute Categoria cat,@PathVariable int id){
		logger.trace("Buscador de categorias");
		
		cat.setId(id);
		Categoria categoria = servicios.read(cat);
		
		ModelAndView model = new ModelAndView("redirect:/");
		model.addObject(categoria);
		
		return model;
	}
	
	@RequestMapping(value="/borrar_categoria/{id}", method=RequestMethod.GET)
	public ModelAndView borrarCategoria(HttpServletRequest request,@PathVariable int id){
		logger.trace("Delete categorias");
		
		servicios.delete(id);
		
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/insertar_categoria", method=RequestMethod.GET)
	public ModelAndView insertarCategoria(){
		logger.trace("Acceso formulario de categorias");
		
		ModelAndView model = new ModelAndView("formularioCategorias");
		model.addObject("categoria", new Categoria());
		
		return model;
	}
	
	@RequestMapping(value="/guardar_categoria", method=RequestMethod.POST)
	public ModelAndView guardarCategoria(@ModelAttribute Categoria cat) {
		logger.trace("POST insert de categoria");
		
		servicios.insert(cat);
		
		ModelAndView model = new ModelAndView("redirect:/");
		
		return model;
	}
	
	@RequestMapping(value="/modificar_categoria/{id}", method=RequestMethod.GET)
	public ModelAndView modificarCategoria(@ModelAttribute Categoria cat,@PathVariable int id){
		logger.trace("Update categoria");
		
		cat.setId(id);
		cat = servicios.read(cat);
		
		ModelAndView model = new ModelAndView("formularioCategorias");
		model.addObject(cat);
		
		return model;
	}
}