package com.mapsa.SnapFood2.specifiction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieConroller {

    @Autowired
    MovieRepository movieRepository;


    @PostMapping("/search")
    List<Movie> search(@RequestBody  List<SearchCriteria> searchCriteria){
        MovieSpecification specification = new MovieSpecification();

searchCriteria.forEach(searchCriteria1 -> {

    specification.add(searchCriteria1);




});

        List<Movie> all = movieRepository.findAll(specification);


        return all;
    }


}
