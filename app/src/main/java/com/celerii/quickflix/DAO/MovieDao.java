package com.celerii.quickflix.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.celerii.quickflix.Mods.Movie;

import java.util.List;

public interface MovieDao {
    @Insert
    void insertMovie(Movie movie);

    @Insert
    void insertMovies(List<Movie> movies);

    @Update
    void updateMovie(Movie movie);

    @Delete
    void deleteMovie(Movie movie);

    @Query("DELETE FROM movie_table")
    void deleteAllMovies();

    @Query("SELECT * FROM movie_table WHERE id = :id")
    LiveData<Movie> getMovie(String id);

    @Query("SELECT * FROM movie_table")
    LiveData<List<Movie>> getAllMovies();
}
