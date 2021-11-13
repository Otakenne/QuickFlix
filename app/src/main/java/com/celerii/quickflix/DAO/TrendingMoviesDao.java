package com.celerii.quickflix.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.celerii.quickflix.Mods.TrendingMovie;

import java.util.List;

public interface TrendingMoviesDao {
    @Insert
    void insertTrendingMovie(TrendingMovie trendingMovie);

    @Insert
    void insertTrendingMovies(List<TrendingMovie> trendingMovies);

    @Delete
    void deleteTrendingMovie(TrendingMovie trendingMovie);

    @Query("DELETE FROM trending_movies_table")
    void deleteAllTrendingMovies();

    @Query("SELECT * FROM trending_movies_table")
    LiveData<List<TrendingMovie>> getAllTrendingMovies();
}
