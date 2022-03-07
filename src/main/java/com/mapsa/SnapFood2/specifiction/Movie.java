package com.mapsa.SnapFood2.specifiction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_movies")
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String title;
    private String genre;
    private Double rating;
    private Double watchTime;
    private Integer releaseYear;



    public Movie() {
    }

    public Movie(String title, String genre, double rating, double watchTime, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.watchTime = watchTime;
        this.releaseYear = releaseYear;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(Double watchTime) {
        this.watchTime = watchTime;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }


}
