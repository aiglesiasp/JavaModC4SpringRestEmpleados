/**
 * 
 */
package com.aiglesiasp.java.modc4.spring.rest.empleados.service;

import java.util.List;

import com.aiglesiasp.java.modc4.spring.rest.empleados.dto.Departamento;

/**
 * @author aitor
 *
 */
public interface IDepartamentoService {
	// Metodos del CRUD
	public List<Departamento> listarDepartamentos(); // Listar All

	public Departamento guardarDepartamento(Departamento departamento); // Guarda un departamento CREATE

	public Departamento departamentoById(int codigo); // Leer datos de un departamento READ

	public Departamento actualizarDepartamento(Departamento departamento); // Actualiza datos del departamento UPDATE

	public void eliminarDepartamento(int codigo);// Elimina el departamento DELETE
}
