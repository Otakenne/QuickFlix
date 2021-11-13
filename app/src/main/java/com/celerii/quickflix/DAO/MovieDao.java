package com.celerii.quickflix.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.celerii.quickflix.Mods.Movie;

import java.util.ArrayList;
import java.util.List;

public interface MovieDao {
    @Insert
    void insert(Movie movie);

    @Insert
    void insert(List<Movie> movies);

    @Delete
    void delete(Movie movie);

    @Query("DELETE FROM movie_table")
    void deleteAll();

    @Query("SELECT * FROM movie_table WHERE id = id")
    void getMovie(String id);

    @Query("SELECT * FROM movie_table")
    LiveData<List<Movie>> getAllMovies();
}
