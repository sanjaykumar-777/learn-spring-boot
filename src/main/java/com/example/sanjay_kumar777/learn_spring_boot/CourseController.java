package com.example.sanjay_kumar777.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn Aws","Sanjay"),
                new Course(2, "Learn Devops","Kumar"),
                new Course(3,"Testing","jagadish"),
                new Course(4,"Java","Sri")
        );
    }
}
