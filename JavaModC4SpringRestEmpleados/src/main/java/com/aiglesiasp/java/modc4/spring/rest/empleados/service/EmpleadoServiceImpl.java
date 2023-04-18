/**
 * 
 */
package com.aiglesiasp.java.modc4.spring.rest.empleados.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiasp.java.modc4.spring.rest.empleados.dao.IEmpleadoDAO;
import com.aiglesiasp.java.modc4.spring.rest.empleados.dto.Empleado;

/**
 * @author aitor
 *
 */
@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;

	@Override
	public List<Empleado> listarEmpleados() {
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado empleadoById(String dni) {
		return iEmpleadoDAO.findById(dni).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(String dni) {
		iEmpleadoDAO.deleteById(dni);
		
	}

}
