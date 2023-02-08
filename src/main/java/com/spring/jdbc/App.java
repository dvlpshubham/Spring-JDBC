package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My Program Started.......");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

	
		
		/*
		 * JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		 * 
		 * String query ="insert into student(id,name,city) values(?,?,?)";
		 * 
		 * int result = template.update(query,325,"Kishlay","Maharastra");
		 * 
		 * System.out.println("Number of rows inserted..." +result);
		 */
		
		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		
		//INSERT
		
		/*
		 * Student student = new Student(); student.setId(78);
		 * student.setName("Kishan"); student.setCity("Reliance");
		 * 
		 * int result = studentDao.insert(student);
		 * 
		 * System.out.println("Student Added......" + result);
		 */
		
		//UPDATE
		
		/*
		 * Student student=new Student(); student.setId(5); student.setName("Taklu");
		 * student.setCity("Neem chowk"); int result= studentDao.change(student);
		 * 
		 * System.out.println("Data Changed....."+ result);
		 */
		
		/*
		 * //DELET int result =studentDao.delete(456);
		 * System.out.println("Deleted......" +result);
		 */
		
		/*
		 * Student student = studentDao.getStudent(65); System.out.println(student);
		 */
		
		List<Student> students = studentDao.getAllStudents();
		for(Student s : students) {
			System.out.println(s);
		}
	}
}
