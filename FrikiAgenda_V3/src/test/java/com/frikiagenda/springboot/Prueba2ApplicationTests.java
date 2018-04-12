package com.frikiagenda.springboot;

/*

import static org.junit.Assert.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.frikiagenda.springboot.dao.DaoCatImp;
import com.frikiagenda.springboot.model.Categoria;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Prueba2ApplicationTests {

	private static Logger logger;
	private static byte count = 0;
	
	static {
		try {
			logger = LogManager.getLogger(Prueba2ApplicationTests.class);
		} catch (Throwable e){
			System.out.println("No funciona el log4j");
		}
	}
	@BeforeClass
	public static void inicioPrueba(){
		logger.info("======== Inicio de la prueba unitaria ==========");
	}
	
	@Before
	public void executeBeforedMethods() {
		logger.info("======== Inicio de la prueba " + (count++) + " ==========");
	}
	
	@After
	public void executeAfterMethods() {
		logger.info("======== Fin de la prueba " + (count) + " ==========");
	}
	
	@AfterClass
	public static void finPrueba(){
		logger.info("======== Finalizada la prueba unitaria ==========");
	}
	
	@Test
	public void pruebaInsert(){
		logger.info("Test:: PruebaInsert(): nombrecat = CategoriaPrueba");
		Categoria cat = new Categoria();
		cat.setNombre("CategoriaPrueba");
		cat.setId(0);
		
		assertTrue(new DaoCatImp().insert(cat)!=-1);
	}
	
	@Test
	public void pruebaReadInt() {
		logger.info("Test:: PruebaReadInt(): nombrecat = CategoriaPrueba");
		Categoria cat = new DaoCatImp().read(0);
		String nom = "CategoriaPrueba";
		assertTrue(nom.equals(cat.getNombre()));
	}
	
	@Test
	public void pruebaRead() {
		logger.info("Test:: PruebaReadString(): nombrecat = CategoriaPrueba");
		Categoria cat = new DaoCatImp().read("CategoriaPrueba");
		assertTrue(0 == cat.getId());
	}
	
	@Test
	public void pruebaUpdate() {
		logger.info("Test:: PruebaUpdate(): nombrecat = CategoriaPrueba");
		Categoria cat2 = new Categoria();
		cat2.setId(0);
		cat2.setNombre("nuevoNombre");
		new DaoCatImp().update(cat2);
		
		Categoria cat3 = new DaoCatImp().read(0);
		assertFalse(cat3.getNombre().equals("CategoriaPrueba"));
		
	}
	
	@Test
	public void pruebaDelete(){
		logger.info("Test:: PruebaDelete(): nombrecat = CategoriaPrueba");
		new DaoCatImp().delete(0);
		
		assertTrue(new DaoCatImp().read(0)==null);
	}
}*/
