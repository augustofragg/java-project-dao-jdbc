package application;

import model.dao.Daofactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		
		DepartmentDao depDao = Daofactory.createDepartmentDao();
		
		System.out.println("======Teste 1: findById ======");
		
		Department dep = depDao.findById(2);
		
		System.out.println(dep);
		
		
		
	}
}
