package com.celerii.quickflix.Mods;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.celerii.quickflix.BR;

@Entity(tableName = "movie_table")
public class Movie extends BaseObservable {
    @PrimaryKey
    @NonNull
    private int id;
    private String imdb_id;
    private String original_title;
    private String title;
    private String overview;
    private String status;
    private double vote_average;
    private String backdrop_path;

    public Movie() {
        this.id = 0;
        this.imdb_id = "";
        this.original_title = "";
        this.title = "";
        this.overview = "";
        this.status = "";
        this.vote_average = 0.0;
        this.backdrop_path = "";
    }

    @Bindable
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
//        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
//        notifyPropertyChanged(BR.imdb_id);
    }

    @Bindable
    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
//        notifyPropertyChanged(BR.original_title);
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
//        notifyPropertyChanged(BR.title);
    }

    @Bindable
    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
//        notifyPropertyChanged(BR.overview);
    }

    @Bindable
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
//        notifyPropertyChanged(BR.status);
    }

    @Bindable
    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
//        notifyPropertyChanged(BR.vote_average);
    }

    @Bindable
    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
//        notifyPropertyChanged(BR.backdrop_path);
    }
}
