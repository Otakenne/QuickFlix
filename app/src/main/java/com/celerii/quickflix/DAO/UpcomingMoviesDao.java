package com.celerii.quickflix.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.celerii.quickflix.Mods.UpcomingMovie;

import java.util.List;

public interface UpcomingMoviesDao {
    @Insert
    void insertUpcomingMovies(UpcomingMovie upcomingMovie);

    @Insert
    void insertUpcomingMovie(List<UpcomingMovie> upcomingMovies);

    @Delete
    void deleteUpcomingMovie(UpcomingMovie upcomingMovie);

    @Query("DELETE FROM upcoming_movies_table")
    void deleteAllUpcomingMovies();

    @Query("SELECT * FROM upcoming_movies_table")
    LiveData<List<UpcomingMovie>> getAllUpcomingMovies();
}
