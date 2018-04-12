package com.frikiagenda.springboot.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;

	// puse todos los nombres como la bbdd para no tener que poner @columna
	@Id
	@GeneratedValue
	@Column(name = "idempleados")
	private int idempleados;
	
	@Column(name = "codEmpleado")
	private String codempleado;
	
	@Column(name = "salario")
	private String salario;
	
	@Column(name = "fechaAlta")
	private LocalDateTime fechaAltahola;

	@OneToOne(fetch=FetchType.EAGER, cascade = {CascadeType.ALL})
	@JoinColumn(name = "idCategoria")
	private Categoria categoria;
	
	
	@OneToOne(fetch=FetchType.EAGER, cascade = {CascadeType.ALL})
	@JoinColumn(name = "idDepartamento")
	private Departamento departamento;


	public Empleado() {
		super();
	}


	public Empleado(int idempleados, String codempleado, String salario, LocalDateTime fechaAlta, Categoria categoria,
			Departamento departamento) {
		super();
		this.idempleados = idempleados;
		this.codempleado = codempleado;
		this.salario = salario;
		this.fechaAltahola = fechaAlta;
		this.categoria = categoria;
		this.departamento = departamento;
	}


	public int getIdempleados() {
		return idempleados;
	}


	public void setIdempleados(int idempleados) {
		this.idempleados = idempleados;
	}


	public String getCodempleado() {
		return codempleado;
	}


	public void setCodempleado(String codempleado) {
		this.codempleado = codempleado;
	}


	public String getSalario() {
		return salario;
	}


	public void setSalario(String salario) {
		this.salario = salario;
	}


	public LocalDateTime getFechaAltahola() {
		return fechaAltahola;
	}


	public void setFechaAltahola(LocalDateTime fechaAlta) {
		this.fechaAltahola = fechaAlta;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Empleado [idempleados=" + idempleados + ", codempleado=" + codempleado + ", salario=" + salario
				+ ", fechaAlta=" + fechaAltahola + ", categoria=" + categoria + ", departamento=" + departamento + "]";
	}
	

	

}
