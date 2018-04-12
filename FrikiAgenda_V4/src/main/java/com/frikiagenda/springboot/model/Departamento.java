package com.frikiagenda.springboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departamentos")
public class Departamento implements Serializable {
	
	
		private static final long serialVersionUID = 2L;

		@Id
		@GeneratedValue
		@Column(name = "iddepartamento")
		private int id;
		
		
		private String nombre;


		public Departamento() {
			super();
		}


		public Departamento(int id, String nombre) {
			super();
			this.id = id;
			this.nombre = nombre;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}


		@Override
		public String toString() {
			return "Departamento [id=" + id + ", nombre=" + nombre + "]";
		}
		
		
		
	
}
