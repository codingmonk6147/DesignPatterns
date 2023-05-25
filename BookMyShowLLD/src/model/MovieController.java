package model;

import enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {

    Map<City, List<Movie>> cityVsMovies;
    List<Movie> allMovies;

    public MovieController(){
        cityVsMovies = new HashMap<>();
        allMovies = new ArrayList<>();
    }
    public void addMovie(Movie movie, City city) {

        allMovies.add(movie);

        List<Movie> movies = cityVsMovies.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMovies.put(city, movies);
    }


    public Movie getMovieByName(String movieName) {

        for(Movie movie : allMovies) {
            if((movie.getMovieName()).equals(movieName)) {
                return movie;
            }
        }
        return null;
    }


    public List<Movie> getMoviesByCity(City city) {
        return cityVsMovies.get(city);
    }


    // REMOVE movie from a particular city, make use of cityVsMovies map
    void removeMovie(Movie movie, City city) {
        List<Movie> movies = cityVsMovies.getOrDefault(city, new ArrayList<>());
        movies.remove(movie);
        cityVsMovies.put(city, movies);
        allMovies.remove(movie);
    }

    // UPDATE movie of a particular city, make use of cityVsMovies map
    void updateMovie(Movie updatedMovie, City city) {
        List<Movie> movies = cityVsMovies.getOrDefault(city, new ArrayList<>());
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getMovieId() == updatedMovie.getMovieId()) {
                movies.set(i, updatedMovie);
                break;
            }
        }
        cityVsMovies.put(city, movies);
        for (int i = 0; i < allMovies.size(); i++) {
            if (allMovies.get(i).getMovieId() == updatedMovie.getMovieId()) {
                allMovies.set(i, updatedMovie);
                break;
            }
        }
    }

    // CRUD operations based on Movie ID, make use of allMovies list

    Movie getMovieByID(int movieID) {
        for (Movie movie : allMovies) {
            if (movie.getMovieId() == movieID) {
                return movie;
            }
        }
        return null;
    }

    void removeMovieByID(int movieID) {
        Movie movieToRemove = null;
        for (Movie movie : allMovies) {
            if (movie.getMovieId() == movieID) {
                movieToRemove = movie;
                break;
            }
        }
        if (movieToRemove != null) {
            allMovies.remove(movieToRemove);
            for (List<Movie> movies : cityVsMovies.values()) {
                movies.remove(movieToRemove);
            }
        }
    }

    void updateMovieByID(int movieID, Movie updatedMovie) {
        for (int i = 0; i < allMovies.size(); i++) {
            if (allMovies.get(i).getMovieId() == movieID) {
                allMovies.set(i, updatedMovie);
                break;
            }
        }
        for (List<Movie> movies : cityVsMovies.values()) {
            for (int i = 0; i < movies.size(); i++) {
                if (movies.get(i).getMovieId() == movieID) {
                    movies.set(i, updatedMovie);
                    break;
                }
            }
        }
    }

}
