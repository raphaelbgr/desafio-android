package br.com.superrevendedores.android.raphael.desafio.common.api.model;


import com.google.gson.annotations.Expose;

public class User {

    @Expose
    private String received_events_url;
    @Expose
    private String organizations_url;
    @Expose
    private String avatar_url;
    @Expose
    private String gravatar_id;
    @Expose
    private String gists_url;
    @Expose
    private String starred_url;
    @Expose
    private String site_admin;
    @Expose
    private String type;
    @Expose
    private String url;
    @Expose
    private String id;
    @Expose
    private String html_url;
    @Expose
    private String following_url;
    @Expose
    private String events_url;
    @Expose
    private String login;
    @Expose
    private String subscriptions_url;
    @Expose
    private String repos_url;
    @Expose
    private String followers_url;

    public String getReceived_events_url() {
        return received_events_url;
    }

    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }

    public String getOrganizations_url() {
        return organizations_url;
    }

    public void setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getGravatar_id() {
        return gravatar_id;
    }

    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }

    public String getGists_url() {
        return gists_url;
    }

    public void setGists_url(String gists_url) {
        this.gists_url = gists_url;
    }

    public String getStarred_url() {
        return starred_url;
    }

    public void setStarred_url(String starred_url) {
        this.starred_url = starred_url;
    }

    public String getSite_admin() {
        return site_admin;
    }

    public void setSite_admin(String site_admin) {
        this.site_admin = site_admin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getFollowing_url() {
        return following_url;
    }

    public void setFollowing_url(String following_url) {
        this.following_url = following_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSubscriptions_url() {
        return subscriptions_url;
    }

    public void setSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    public String getFollowers_url() {
        return followers_url;
    }

    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    @Override
    public String toString() {
        return "ClassPojo [received_events_url = " + received_events_url + ", organizations_url = " + organizations_url + ", avatar_url = " + avatar_url + ", gravatar_id = " + gravatar_id + ", gists_url = " + gists_url + ", starred_url = " + starred_url + ", site_admin = " + site_admin + ", type = " + type + ", url = " + url + ", id = " + id + ", html_url = " + html_url + ", following_url = " + following_url + ", events_url = " + events_url + ", login = " + login + ", subscriptions_url = " + subscriptions_url + ", repos_url = " + repos_url + ", followers_url = " + followers_url + "]";
    }
}
