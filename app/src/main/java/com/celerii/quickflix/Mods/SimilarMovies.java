package com.celerii.quickflix.Mods;

import androidx.room.Entity;

@Entity(tableName = "similar_movies_table")
public class SimilarMovies extends Movie {
    private String original_movie_id;

    public String getOriginal_movie_id() {
        return original_movie_id;
    }

    public void setOriginal_movie_id(String original_movie_id) {
        this.original_movie_id = original_movie_id;
    }
}
