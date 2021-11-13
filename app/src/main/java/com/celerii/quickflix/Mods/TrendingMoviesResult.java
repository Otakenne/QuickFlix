package com.celerii.quickflix.Mods;

import java.util.ArrayList;

public class TrendingMoviesResult {
    private int pages;
    private ArrayList<TrendingMovies> results;

    public TrendingMoviesResult() {
        this.pages = 0;
        this.results = new ArrayList<>();
    }

    public TrendingMoviesResult(int pages, ArrayList<TrendingMovies> results) {
        this.pages = pages;
        this.results = results;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public ArrayList<TrendingMovies> getResults() {
        return results;
    }

    public void setResults(ArrayList<TrendingMovies> results) {
        this.results = results;
    }
}
