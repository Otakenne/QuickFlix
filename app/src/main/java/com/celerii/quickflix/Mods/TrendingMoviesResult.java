package com.celerii.quickflix.Mods;

import java.util.ArrayList;

public class TrendingMoviesResult {
    private int pages;
    private ArrayList<TrendingMovie> results;

    public TrendingMoviesResult() {
        this.pages = 0;
        this.results = new ArrayList<>();
    }

    public TrendingMoviesResult(int pages, ArrayList<TrendingMovie> results) {
        this.pages = pages;
        this.results = results;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public ArrayList<TrendingMovie> getResults() {
        return results;
    }

    public void setResults(ArrayList<TrendingMovie> results) {
        this.results = results;
    }
}
