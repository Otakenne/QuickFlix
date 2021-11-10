package com.celerii.quickflix.Mods;

import java.util.ArrayList;

public class ActorMoviesResults {
    private int page;
    private ArrayList<ActorMovies> results;

    public ActorMoviesResults() {
        this.page = 0;
        this.results = new ArrayList<>();
    }

    public ActorMoviesResults(int page, ArrayList<ActorMovies> results) {
        this.page = page;
        this.results = results;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public ArrayList<ActorMovies> getResults() {
        return results;
    }

    public void setResults(ArrayList<ActorMovies> results) {
        this.results = results;
    }
}
