package br.com.superrevendedores.android.raphael.desafio.common.api.model;


import com.google.gson.annotations.Expose;

public class Repo {

    @Expose
    private int open_issues;
    @Expose
    private int open_issues_count;
    @Expose
    private Owner owner;

    public Owner getOwner() {
        return owner;
    }

    public int getOpen_issues() {
        return open_issues;
    }

    public int getOpen_issues_count() {
        return open_issues_count;
    }
}