package com.abema.movies.Services;

import com.abema.movies.Models.Movie;
import com.abema.movies.Repos.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> oneMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
