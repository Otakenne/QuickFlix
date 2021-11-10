package com.celerii.quickflix.Mods;

import java.util.ArrayList;

public class MovieCreditResults {
    private int pages;
    private ArrayList<MovieCredit> results;

    public MovieCreditResults() {
        this.pages = 0;
        this.results = new ArrayList<>();
    }

    public MovieCreditResults(int pages, ArrayList<MovieCredit> results) {
        this.pages = pages;
        this.results = results;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public ArrayList<MovieCredit> getResults() {
        return results;
    }

    public void setResults(ArrayList<MovieCredit> results) {
        this.results = results;
    }
}
