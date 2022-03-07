package com.mapsa.SnapFood2.specifiction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class SpecifictionApplictionRunner implements ApplicationRunner {

    @Autowired
    MovieRepository movieRepository;





    @Override
    public void run(ApplicationArguments args) throws Exception {



        movieRepository.saveAll(Arrays.asList(
                new Movie("Troy", "Drama", 7.2, 196, 2004),
                new Movie("The Godfather", "Crime", 9.2, 178, 1972),
                new Movie("Invictus", "Sport", 7.3, 135, 2009),
                new Movie("Black Panther", "Action", 7.3, 135, 2018),
                new Movie("Joker", "Drama", 8.9, 122, 2018),
                new Movie("Iron Man", "Action", 8.9, 126, 2008)
        ));

        // search movies by `genre`
        MovieSpecification msGenre = new MovieSpecification();
        msGenre.add(new SearchCriteria("genre", "Action", SearchOperation.EQUAL));
        List<Movie> msGenreList = movieRepository.findAll(msGenre);
        msGenreList.forEach(System.out::println);

        // search movies by `title` and `rating` > 7
        MovieSpecification msTitleRating = new MovieSpecification();
        msTitleRating.add(new SearchCriteria("title", "black", SearchOperation.MATCH));
        msTitleRating.add(new SearchCriteria("rating", 7, SearchOperation.GREATER_THAN));
        List<Movie> msTitleRatingList = movieRepository.findAll(msTitleRating);
        msTitleRatingList.forEach(System.out::println);

        // search movies by release year < 2010 and rating > 8
        MovieSpecification msYearRating = new MovieSpecification();
        msYearRating.add(new SearchCriteria("releaseYear", 2010, SearchOperation.LESS_THAN));
        msYearRating.add(new SearchCriteria("rating", 8, SearchOperation.GREATER_THAN));
        List<Movie> msYearRatingList = movieRepository.findAll(msYearRating);
        msYearRatingList.forEach(System.out::println);

        // search movies by watch time >= 150 and sort by `title`
        MovieSpecification msWatchTime = new MovieSpecification();
        msWatchTime.add(new SearchCriteria("watchTime", 150, SearchOperation.GREATER_THAN_EQUAL));
        List<Movie> msWatchTimeList = movieRepository.findAll(msWatchTime, Sort.by("title"));
        msWatchTimeList.forEach(System.out::println);

        // search movies by `title` <> 'white' and paginate results
        MovieSpecification msTitle = new MovieSpecification();
        msTitle.add(new SearchCriteria("title", "white", SearchOperation.NOT_EQUAL));

        Pageable pageable = PageRequest.of(0, 3, Sort.by("releaseYear").descending());
        Page<Movie> msTitleList = movieRepository.findAll(msTitle, pageable);

        msTitleList.forEach(System.out::println);




        MovieSpecification msYearRatingAnCat = new MovieSpecification();
      //  msYearRatingAnCat.add(new SearchCriteria("category.age", 6, SearchOperation.GREATER_THAN));
        msYearRatingAnCat.add(new SearchCriteria("rating", 8, SearchOperation.GREATER_THAN));
        List<Movie> msYearRatingAnCatList = movieRepository.findAll(msYearRatingAnCat);
        msYearRatingAnCatList.forEach(System.out::println);


    }
}
