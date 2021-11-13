package com.celerii.quickflix.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.celerii.quickflix.Mods.SearchedMovies;

import java.util.List;

public interface SearchedMoviesDao {
    @Insert
    void insertSearchedMovies(SearchedMovies searchedMovies);

    @Insert
    void insertSearchedMovies(List<SearchedMovies> searchedMovies);

    @Delete
    void deleteSearchedMovies(SearchedMovies searchedMovies);

    @Query("DELETE FROM searched_movies_table")
    void deleteAllSearchedMovies();

    @Query("SELECT * FROM searched_movies_table WHERE search_query = :search_query")
    LiveData<List<SearchedMovies>> getSearchedMovies(String search_query);
}
