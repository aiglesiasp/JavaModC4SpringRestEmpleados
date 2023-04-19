/**
 * 
 */
package com.aiglesiasp.java.modc4.spring.rest.empleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiglesiasp.java.modc4.spring.rest.empleados.dto.Empleado;
import com.aiglesiasp.java.modc4.spring.rest.empleados.service.EmpleadoServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	@GetMapping("/empleados/{dni}")
	public Empleado empleadoById(@PathVariable(name="dni") String dni) {
		Empleado empleado= new Empleado();
		empleado=empleadoServiceImpl.empleadoById(dni);
		System.out.println("Fabricante By ID: "+empleado);
		return empleado;
	}
	
	@PutMapping("/empleados/{dni}")
	public Empleado actualizarEmpleado(@PathVariable(name="dni")String dni,@RequestBody Empleado empleado) {
		
		Empleado empleado_seleccionado= new Empleado();
		Empleado empleado_actualizado= new Empleado();
		empleado_seleccionado= empleadoServiceImpl.empleadoById(dni);
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());
		
		empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);
		System.out.println("El empleado actualizado es: "+ empleado_actualizado);
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{dni}")
	public void eliminarEmpleado(@PathVariable(name="dni")String dni) {
		empleadoServiceImpl.eliminarEmpleado(dni);
	}

}
