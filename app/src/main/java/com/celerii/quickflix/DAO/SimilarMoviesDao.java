package com.celerii.quickflix.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.celerii.quickflix.Mods.MovieCredit;
import com.celerii.quickflix.Mods.SimilarMovies;

import java.util.List;

public interface SimilarMoviesDao {
    @Insert
    void insertSimilarMovies(SimilarMovies similarMovies);

    @Insert
    void insertSimilarMovies(List<SimilarMovies> similarMovies);

    @Delete
    void deleteSimilarMovie(SimilarMovies similarMovies);

    @Query("DELETE FROM similar_movies_table")
    void deleteAllSimilarMovies();

    @Query("SELECT * FROM similar_movies_table WHERE original_movie_id = :original_movie_id")
    LiveData<List<SimilarMovies>> getSimilarMovies(String original_movie_id);
}
