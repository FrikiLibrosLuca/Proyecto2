package com.frikiagenda.springboot.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleado implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idempleados")
	private int idempleados;
	
	private String codempleado;
	
	private String salario;
	
	@JoinColumn(name="idcategoria")
	private LocalDateTime fechaalta;
	
	@OneToOne(fetch=FetchType.EAGER, cascade={CascadeType.ALL})
	@JoinColumn(name="idcategoria")
	private Categoria categoria;
	
	@OneToOne(fetch=FetchType.EAGER, cascade={CascadeType.ALL})
	@JoinColumn(name="iddepartamento")
	private Departamento departamento;

	public Empleado() {
		super();
	}

	public Empleado(int idempleados, String codempleado, String salario, LocalDateTime fechaalta, Categoria categoria,
			Departamento departamento) {
		super();
		this.idempleados = idempleados;
		this.codempleado = codempleado;
		this.salario = salario;
		this.fechaalta = fechaalta;
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

	public LocalDateTime getFechaAlta() {
		return fechaalta;
	}

	public void setFechaAlta(LocalDateTime fechaalta) {
		this.fechaalta = fechaalta;
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

	@Override
	public String toString() {
		return "Empleado [idempleados=" + idempleados + ", codempleado=" + codempleado + ", salario=" + salario
				+ ", fechaAlta=" + fechaalta + ", categoria=" + categoria + ", departamento=" + departamento + "]";
	}
	
	
	
}