package com.celerii.quickflix.Mods;

import java.util.ArrayList;

public class ActorMoviesResults {
    private int page;
    private ArrayList<ActorMovie> results;

    public ActorMoviesResults() {
        this.page = 0;
        this.results = new ArrayList<>();
    }

    public ActorMoviesResults(int page, ArrayList<ActorMovie> results) {
        this.page = page;
        this.results = results;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public ArrayList<ActorMovie> getResults() {
        return results;
    }

    public void setResults(ArrayList<ActorMovie> results) {
        this.results = results;
    }
}
