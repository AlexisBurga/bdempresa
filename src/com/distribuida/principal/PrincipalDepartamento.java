package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.DepartamentoDao;
import com.distribuida.entities.Departamento;

public class PrincipalDepartamento {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		DepartamentoDao departamentoDao = context.getBean("departamentoDaoImpl" , DepartamentoDao.class);
		List<Departamento> departamentos= departamentoDao.findAll();
		
		departamentos.forEach(item -> {
			System.out.println(item.toString());
			
			
		});

		
		context.close();
		
	}


}
