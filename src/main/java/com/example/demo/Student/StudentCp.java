package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentCp {

    @GetMapping
	public List<Student> getStudents() {
		return List.of(
			new Student(1L, "Filip", 26, LocalDate.of(1994, Month.NOVEMBER, 7), "filip22risteski@gmail.com")
		);
	
	}
    
    
}
