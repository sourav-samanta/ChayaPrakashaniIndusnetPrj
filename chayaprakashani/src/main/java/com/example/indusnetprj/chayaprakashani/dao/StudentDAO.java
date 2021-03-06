package com.example.indusnetprj.chayaprakashani.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.indusnetprj.chayaprakashani.entity.StudentDetails;

@Repository
public interface StudentDAO extends JpaRepository<StudentDetails, Integer>{

	Optional<StudentDetails> findByfirstName(String firstName);

	Optional<StudentDetails> findByEmail(String email);

}
