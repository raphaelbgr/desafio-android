package br.com.superrevendedores.android.raphael.desafio.common.api.model;

import com.google.gson.annotations.Expose;

public class Milestone {

    @Expose
    private Integer open_issues;
    @Expose
    private Integer closed_issues;

    public Integer getOpen_issues() {
        return open_issues;
    }

    public void setOpen_issues(Integer open_issues) {
        this.open_issues = open_issues;
    }

    public Integer getClosed_issues() {
        return closed_issues;
    }

    public void setClosed_issues(Integer closed_issues) {
        this.closed_issues = closed_issues;
    }

}
