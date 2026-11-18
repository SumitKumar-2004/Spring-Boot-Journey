package in.strikes.aopIntroductionDemo.service;

import in.strikes.aopIntroductionDemo.dto.Student;
import in.strikes.aopIntroductionDemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }


    public void createStudent(Student student){
        LoggingServiceUtil.logStart("StudentService","createStudent");
        studentRepository.save(student);
        LoggingServiceUtil.logEnd("StudentService","createStudent");

    }
}
