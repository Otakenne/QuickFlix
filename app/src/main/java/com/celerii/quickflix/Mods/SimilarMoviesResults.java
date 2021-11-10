package com.celerii.quickflix.Mods;

import java.util.ArrayList;

public class SimilarMoviesResults {
    private int page;
    private ArrayList<SimilarMovies> results;

    public SimilarMoviesResults() {
        this.page = 0;
        this.results = new ArrayList<>();
    }

    public SimilarMoviesResults(int page, ArrayList<SimilarMovies> results) {
        this.page = page;
        this.results = results;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public ArrayList<SimilarMovies> getResults() {
        return results;
    }

    public void setResults(ArrayList<SimilarMovies> results) {
        this.results = results;
    }
}
