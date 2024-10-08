package application;

import java.util.List;
import java.util.Scanner;

import model.dao.Daofactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = Daofactory.createDepartmentDao();
		
		System.out.println("======Teste 1: findById ======");
		
		Department dep = depDao.findById(2);
		
		System.out.println(dep);
		
		System.out.println("\n=====Teste 2: findAll ======");
		
		List<Department> list = depDao.findAll();
		
		for(Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\n===== Teste 3: Insert");
		
		/*
		Department newDep = new Department(null,"Music");
		
		depDao.insert(newDep);
		
		System.out.println("Inserted! New id " + newDep.getId() );
		
		System.out.println("\n===== Teste 3: Insert");
		*/
		
		dep = depDao.findById(7);
		dep.setName("Tools");
		
		depDao.update(dep);
		
		System.out.println("Update completed");
	
		System.out.println("\n======= TEST 5: seller Delete ======");
		
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		
		depDao.deleteById(id);
		
		System.out.println("Deleted Completed!");
		
		sc.close();
	}
}
