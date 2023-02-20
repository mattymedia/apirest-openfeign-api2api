package co.com.apidata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.apidata.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

}
