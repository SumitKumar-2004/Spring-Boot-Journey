package in.strikes.filterDemo.service;

import in.strikes.filterDemo.dto.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public void createStudent(Student student){
        System.out.println("Student created");
        System.out.println(student.getName());
        System.out.println(student.getEmail());
    }
}
