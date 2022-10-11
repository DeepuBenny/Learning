package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentEntity;

@Repository
public interface StudRepo extends JpaRepository<StudentEntity,Long> {

	void save(Optional<StudentEntity> st);

}
