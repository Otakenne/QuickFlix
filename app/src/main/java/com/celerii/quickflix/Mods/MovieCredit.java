package com.celerii.quickflix.Mods;

import androidx.room.Entity;

@Entity(tableName = "movie_credit_table")
public class MovieCredit {
    private String character, name, original_name, profile_path;
    private int movie_id;

    public MovieCredit() {
        this.character = "";
        this.name = "";
        this.original_name = "";
        this.profile_path = "";
        this.movie_id = 0;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginal_name() {
        return original_name;
    }

    public void setOriginal_name(String original_name) {
        this.original_name = original_name;
    }

    public String getProfile_path() {
        return profile_path;
    }

    public void setProfile_path(String profile_path) {
        this.profile_path = profile_path;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }
}
