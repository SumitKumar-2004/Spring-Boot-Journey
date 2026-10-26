package in.strikes.crudDtoDemo.repository;


import in.strikes.crudDtoDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
