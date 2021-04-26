package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> getStudents() {
		return List.of(
			new Student(1L, "Filip", 26, LocalDate.of(1994, Month.NOVEMBER, 7), "filip22risteski@gmail.com")
		);
}
