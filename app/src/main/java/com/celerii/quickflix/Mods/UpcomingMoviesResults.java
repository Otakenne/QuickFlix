package com.celerii.quickflix.Mods;

import java.util.ArrayList;

public class UpcomingMoviesResults {
    private int page;
    private ArrayList<UpcomingMovie> results;

    public UpcomingMoviesResults() {
        this.page = 0;
        this.results = new ArrayList<>();
    }

    public UpcomingMoviesResults(int page, ArrayList<UpcomingMovie> results) {
        this.page = page;
        this.results = results;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public ArrayList<UpcomingMovie> getResults() {
        return results;
    }

    public void setResults(ArrayList<UpcomingMovie> results) {
        this.results = results;
    }
}
