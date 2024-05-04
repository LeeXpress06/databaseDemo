package com.h2Database.databaseDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private Repo repo;

   @PostMapping("/saved")
   public ResponseEntity<Student> savedStudent(@RequestBody  Student student){
      Student savedStudent = repo.save(student);
       return new ResponseEntity<>(savedStudent,HttpStatus.OK);
   }
   @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable  Long id){

       Student student = repo.findById(id).get();

       return new ResponseEntity<>(student,HttpStatus.FOUND);
   }
    @GetMapping("get/{name}")
    public ResponseEntity<Student> getByname(@PathVariable  String name){
       Student student = repo.findByName(name);

       return new ResponseEntity<>(student,HttpStatus.FOUND);

    }

}
