package com.sahil.TestApi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

@RequestMapping(method = RequestMethod.GET,path = "/courses")
public List<Course> retrieveAll(){
    System.out.println("test");
    return Arrays.asList(
            new Course(1,"AWS","ABC"),
            new Course(2,"Spring" , "DEF")
    );

}


}
