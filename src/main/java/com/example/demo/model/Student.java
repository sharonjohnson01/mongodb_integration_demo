package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@RequiredArgsConstructor
@Document(collection = "students")
public class Student {
    @Id
    @Getter @Setter  private String id;
    @Getter @Setter private String name;
    @Getter @Setter private long studentNumber;
    @Getter @Setter private String email;
    @Getter @Setter private List<String> courseList;
    @Getter @Setter private float gpa;


}

