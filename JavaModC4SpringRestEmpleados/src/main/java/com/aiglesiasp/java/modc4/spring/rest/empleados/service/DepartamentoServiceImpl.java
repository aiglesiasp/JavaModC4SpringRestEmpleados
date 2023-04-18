/**
 * 
 */
package com.aiglesiasp.java.modc4.spring.rest.empleados.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiasp.java.modc4.spring.rest.empleados.dao.IDepartamentoDAO;
import com.aiglesiasp.java.modc4.spring.rest.empleados.dto.Departamento;

/**
 * @author aitor
 *
 */
@Service
public class DepartamentoServiceImpl implements IDepartamentoService {

	@Autowired
	IDepartamentoDAO iDepartamentoDAO;

	@Override
	public List<Departamento> listarDepartamentos() {
		return iDepartamentoDAO.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public Departamento departamentoById(int codigo) {
		return iDepartamentoDAO.findById(codigo).get();
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(int codigo) {
		iDepartamentoDAO.deleteById(codigo);

	}

}
