package com.learning.mvc.core;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	//Query Domain Specific Language (DSL)
	List<Student> findByNameOrderByMarksDesc(String name);
	//Need to add on DML statement
	@Modifying
	//JPQL
    @Query("UPDATE Student s SET s.name = :name WHERE s.rollNo = :rollNo")
    int updateStudentName(@Param("rollNo") int rollNo, @Param("name") String name);
}
