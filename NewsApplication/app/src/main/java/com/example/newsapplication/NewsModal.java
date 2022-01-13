package com.example.newsapplication;

import java.util.ArrayList;

public class NewsModal {
    private int totalReults;
    private String status;
    private ArrayList<Articles> articles;

    public int getTotalReults() {
        return totalReults;
    }

    public void setTotalReults(int totalReults) {
        this.totalReults = totalReults;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Articles> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Articles> articles) {
        this.articles = articles;
    }

    public NewsModal(int totalReults, String status, ArrayList<Articles> articles) {
        this.totalReults = totalReults;
        this.status = status;
        this.articles = articles;
    }

}
