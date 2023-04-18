/**
 * 
 */
package com.aiglesiasp.java.modc4.spring.rest.empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.java.modc4.spring.rest.empleados.dto.Departamento;

/**
 * @author aitor
 *
 */
public interface IDepartamentoDAO extends JpaRepository<Departamento, Integer>{

}
