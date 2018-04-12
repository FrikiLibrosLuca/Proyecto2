package com.frikiagenda.springboot.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//puse todos los nombres como la bbdd para no tener que poner @columna
	@Id
	@GeneratedValue
	int idempleados;
	String codempleado;
	String salario;
	LocalDateTime fechaAlta;
	 @JoinColumn (name="idcategorias")
	int idCategoria;
	int idDepartamento;
	
	public Empleado(int idempleados, String codempleado, String salario, LocalDateTime fechaAlta, int idCategoria,
			int idDepartamento) {
		super();
		this.idempleados = idempleados;
		this.codempleado = codempleado;
		this.salario = salario;
		this.fechaAlta = fechaAlta;
		this.idCategoria = idCategoria;
		this.idDepartamento = idDepartamento;
	}

	public Empleado() {
		super();
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
		return fechaAlta;
	}

	public void setFechaAlta(LocalDateTime fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Empleado [idempleados=" + idempleados + ", codempleado=" + codempleado + ", salario=" + salario
				+ ", fechaAlta=" + fechaAlta + ", idCategoria=" + idCategoria + ", idDepartamento=" + idDepartamento
				+ "]";
	}
	
	
	
	

	
	
	
	
	

}
