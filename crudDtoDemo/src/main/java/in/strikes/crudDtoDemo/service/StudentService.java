package in.strikes.crudDtoDemo.service;

import in.strikes.crudDtoDemo.entity.Student;
import in.strikes.crudDtoDemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq){
        return studentRepository.save(studentReq);
    }
}
