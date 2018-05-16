package br.com.superrevendedores.android.raphael.desafio.common.api.model;


import com.google.gson.annotations.Expose;

public class Head
{
    @Expose
    private Repo repo;

    public Repo getRepo() {
        return repo;
    }
}