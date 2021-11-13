package com.celerii.quickflix.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.celerii.quickflix.Mods.MovieCredit;

import java.util.List;

public interface MovieCreditDao {
    @Insert
    void insertMovieCredit(MovieCredit movieCredit);

    @Insert
    void insertMovieCredits(List<MovieCredit> movieCredits);

    @Delete
    void deleteMovieCredit(MovieCredit movieCredit);

    @Query("DELETE FROM movie_credit_table")
    void deleteAllMovieCredit();

    @Query("SELECT * FROM movie_credit_table WHERE movie_id = :movie_id")
    LiveData<List<MovieCredit>> getMovieCredit(String movie_id);
}
