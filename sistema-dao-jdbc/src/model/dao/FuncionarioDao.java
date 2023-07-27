package model.dao;

import java.util.List;

import model.entities.Departamento;
import model.entities.Funcionario;

public interface FuncionarioDao {
	
	void insert(Funcionario fun);
	void update(Funcionario fun);
	void deleteById(Integer id);
	Funcionario findById(Integer id);
	List<Funcionario> findAll();
	List<Funcionario> findByDepartamento(Departamento Departamento);
}
