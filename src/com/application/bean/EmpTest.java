package com.application.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class EmpTest  {

	static List<Employee> listEmp = new ArrayList<Employee>();

	static {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		try {
			listEmp.add(new Employee(101, "Krishna",sdf.parse(" 03/19/1992"), "Atlanta"));
			listEmp.add(new Employee(102, "Amit", sdf.parse(" 03/19/1994"), "NewYork"));
			listEmp.add(new Employee(103, "Ajay", sdf.parse(" 03/19/1995"), "New Jersey"));
			listEmp.add(new Employee(104, "Sally", sdf.parse(" 03/19/1991"), "Atlanta"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) throws ParseException {
		
		System.out.println(listEmp);

		Collections.sort(listEmp);
		System.out.println(listEmp);

		// add Employee
		EmpTest e1 = new EmpTest();
		e1.addEmployee(new Employee(105, "sairam", new Date(), "pheladelphia"));// (listEmp.add(new Employee(105,"SaiKiran",
																			// new Date(),"Tampa"));

		System.out.println(e1.searchEmpById(105));// e1.searchEmpById(105); searching by employee id
		e1.sortEmployees();

		List<Employee> li = e1.getAllEmployees();// returning list all employees

		System.out.println(li);// printing list of all employees
	}

	/******* adding new data **********/
	public void addEmployee(Employee e) {

		listEmp.add(e);// convert Employee object to Link
	}

	/********* searching **********/
	public Employee searchEmpById(int id) {
		for (Employee emp : listEmp) {
			if (emp.getId() == id) {
				return emp;
			}
		}

		return null;
	}

	/********* sorting data **********/
	public void sortEmployees() {

		// sorting employee after adding new employee
		// Collections.sort(listEmp);

		// System.out.println(listEmp);
	}

	/******** retrieving data *********/
	public List<Employee> getAllEmployees() {
		return listEmp;

	}
}

/*
 * searching
 * 
 * Employee [] e =null; 
 * Employee e1 = null; 
 * for(int i = 0; i<listEmp.size();i++) 
 * { 
 * System.out.println(e[i]);
 * if(e1.getId()== id) 
 * { 
 * e1 = e[i];
 * }else 
 * {
 * 	return null;
 * } 
 * return e1;
 * } 
 * return null;
 */
