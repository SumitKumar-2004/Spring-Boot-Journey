package in.strikes;

import in.strikes.model.Student;
import in.strikes.repository.StudentRepository;

public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();

//        studentRepository.createStudent(new Student("Sumit","sumit@gmail.com",20));

//        studentRepository.updateStudent(new Student("Sumit Kumar","sumit@gmail.com",23),4L);

//        studentRepository.deleteStudent(3L);

//        studentRepository.getStudentById(4L);

          studentRepository.getStudent();
    }
}

