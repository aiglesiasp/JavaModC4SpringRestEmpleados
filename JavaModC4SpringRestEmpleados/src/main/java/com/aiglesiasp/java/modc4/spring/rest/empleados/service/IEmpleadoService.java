/**
 * 
 */
package com.aiglesiasp.java.modc4.spring.rest.empleados.service;

import java.util.List;

import com.aiglesiasp.java.modc4.spring.rest.empleados.dto.Empleado;

/**
 * @author aitor
 *
 */
public interface IEmpleadoService {
	//Metodos del CRUD
			public List<Empleado> listarEmpleados(); //Listar All 
			
			public Empleado guardarEmpleado(Empleado empleado);	//Guarda un empleado CREATE
			
			public Empleado empleadoById(String dni); //Leer datos de un empleado READ
			
			public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del empleado UPDATE
			
			public void eliminarEmpleado(String dni);// Elimina el empleado DELETE

}
