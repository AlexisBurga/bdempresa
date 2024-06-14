package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.EmpleadoDao;
import com.distribuida.entities.Empleado;

public class PrincipalEmpleado {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		EmpleadoDao empleadoDao = context.getBean("empleadoDaoImpl" , EmpleadoDao.class);
		List<Empleado> empleados= empleadoDao.findAll();
		
		empleados.forEach(item -> {
			System.out.println(item.toString());
			
			
		});

		
		context.close();
		
	}


}
