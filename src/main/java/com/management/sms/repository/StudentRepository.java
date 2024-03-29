package com.management.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.sms.entity.Student;

//@Repository, @ Transactional  dite hoyna karon jpa repository already hving that in the implementation
public interface StudentRepository extends JpaRepository<Student, Long> {

}
