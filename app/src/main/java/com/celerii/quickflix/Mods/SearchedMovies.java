package com.celerii.quickflix.Mods;

import androidx.room.Entity;

@Entity(tableName = "searched_movies_table")
public class SearchedMovies extends Movie {
    private String search_query;

    public SearchedMovies() {
        super();
        this.search_query = "";
    }

    public String getSearch_query() {
        return search_query;
    }

    public void setSearch_query(String search_query) {
        this.search_query = search_query;
    }
}
