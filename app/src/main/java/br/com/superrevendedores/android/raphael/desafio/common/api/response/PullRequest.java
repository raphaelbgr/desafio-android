package br.com.superrevendedores.android.raphael.desafio.common.api.response;


import com.google.gson.annotations.Expose;

import java.util.Date;

import br.com.superrevendedores.android.raphael.desafio.common.api.model.Head;
import br.com.superrevendedores.android.raphael.desafio.common.api.model.Milestone;
import br.com.superrevendedores.android.raphael.desafio.common.api.model.User;

public class PullRequest {

    @Expose
    private int id;
    @Expose
    private String title;
    @Expose
    private String body;
    @Expose
    private String state;
    @Expose
    private String html_url;
    @Expose
    private Date updated_at;
    @Expose
    private Date created_at;
    @Expose
    private Head head;
    @Expose
    private User user;
    @Expose
    private Milestone milestone;

    public String getHtml_url() {
        return html_url;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        if (body != null && !body.isEmpty())
            return body;
        else
            return "PullRequest request sem descrição.";
    }

    public Head getHead() {
        return head;
    }

    public int getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public Date getCreatedAt() {
        return created_at;
    }

    public String getCreatedAtString() {
        if (updated_at == null) {
            if (created_at == null)
                return "--/--/--";
            else
                return created_at.toString();
        } else
            return updated_at.toString();
    }

    public Date getUpdatedAt() {
        return updated_at;
    }

    public User getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PullRequest)) return false;

        PullRequest pullRequest = (PullRequest) o;

        return id == pullRequest.id;

    }

    @Override
    public int hashCode() {
        return id;
    }

    public Milestone getMilestone() {
        return milestone;
    }
}
