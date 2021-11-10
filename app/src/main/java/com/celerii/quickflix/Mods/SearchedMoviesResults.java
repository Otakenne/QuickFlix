package com.celerii.quickflix.Mods;

import java.util.ArrayList;

public class SearchedMoviesResults {
    private int page;
    private ArrayList<SearchedMovies> results;

    public SearchedMoviesResults() {
        this.page = 0;
        this.results = new ArrayList<>();
    }

    public SearchedMoviesResults(int page, ArrayList<SearchedMovies> results) {
        this.page = page;
        this.results = results;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public ArrayList<SearchedMovies> getResults() {
        return results;
    }

    public void setResults(ArrayList<SearchedMovies> results) {
        this.results = results;
    }
}
