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

import com.aiglesiasp.java.modc4.spring.rest.empleados.dto.Departamento;
import com.aiglesiasp.java.modc4.spring.rest.empleados.service.DepartamentoServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class DepartamentoController {
	
	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;
	
	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos(){
		return departamentoServiceImpl.listarDepartamentos();
	}
	
	@PostMapping("/departamentos")
	public Departamento salvarDepartamento(@RequestBody Departamento departamento) {
		return departamentoServiceImpl.guardarDepartamento(departamento);
	}
	
	@GetMapping("/departamentos/{codigo}")
	public Departamento departamentoById(@PathVariable(name="codigo") int codigo) {
		Departamento departamento= new Departamento();
		departamento=departamentoServiceImpl.departamentoById(codigo);
		System.out.println("Fabricante By ID: "+departamento);
		return departamento;
	}
	
	@PutMapping("/departamentos/{codigo}")
	public Departamento actualizarDepartamento(@PathVariable(name="codigo")int codigo,@RequestBody Departamento departamento) {
		
		Departamento departamento_seleccionado= new Departamento();
		Departamento departamento_actualizado= new Departamento();
		departamento_seleccionado= departamentoServiceImpl.departamentoById(codigo);
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		departamento_actualizado = departamentoServiceImpl.actualizarDepartamento(departamento_seleccionado);
		System.out.println("El cliente actualizado es: "+ departamento_actualizado);
		return departamento_actualizado;
	}
	
	@DeleteMapping("/departamentos/{codigo}")
	public void eliminarDepartamento(@PathVariable(name="codigo")int codigo) {
		departamentoServiceImpl.eliminarDepartamento(codigo);
	}

}
