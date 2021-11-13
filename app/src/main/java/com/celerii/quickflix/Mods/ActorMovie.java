package com.celerii.quickflix.Mods;

import androidx.room.Entity;

@Entity(tableName = "actor_movies_table")
public class ActorMovie {
    private String title, original_title, character, backdrop_path;
    private int id, actor_id;

    public ActorMovie() {
        this.title = "";
        this.original_title = "";
        this.character = "";
        this.backdrop_path = "";
        this.id = 0;
        this.actor_id = 0;
    }

    public ActorMovie(String title, String original_title, String character, String backdrop_path, int id, int actor_id) {
        this.title = title;
        this.original_title = original_title;
        this.character = character;
        this.backdrop_path = backdrop_path;
        this.id = id;
        this.actor_id = actor_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }
}
