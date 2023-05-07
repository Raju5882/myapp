package com.app;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setEmpName("A");
		emp.setEmpSal(3.3);
		emp.setEmpPwd("SATHYA");
		String s1 = "{\"empId\":10,\"empName\":\"A\",\"empSal\":3.3}";
		try {
			ObjectMapper om = new ObjectMapper();
			String json = om.writeValueAsString(emp);
			System.out.println(json);
			System.out.println();
			Employee e = om.readValue(s1, Employee.class);
			System.out.println(e);

		} catch (Exception e) {
			System.out.println(e);

		}

	}

}
