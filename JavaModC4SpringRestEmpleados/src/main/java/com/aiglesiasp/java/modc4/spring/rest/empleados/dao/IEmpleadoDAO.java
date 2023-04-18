package com.aiglesiasp.java.modc4.spring.rest.empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.java.modc4.spring.rest.empleados.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, String> {

}
