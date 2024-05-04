package com.h2Database.databaseDemo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repo extends JpaRepository<Student, Long> {


    public Student findByName(String name);




}
