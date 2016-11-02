package za.co.riggaroo.gus.data.remote.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("gravatar_id")
    @Expose
    private String gravatarId;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("followers_url")
    @Expose
    private String followersUrl;
    @SerializedName("following_url")
    @Expose
    private String followingUrl;
    @SerializedName("gists_url")
    @Expose
    private String gistsUrl;
    @SerializedName("starred_url")
    @Expose
    private String starredUrl;
    @SerializedName("subscriptions_url")
    @Expose
    private String subscriptionsUrl;
    @SerializedName("organizations_url")
    @Expose
    private String organizationsUrl;
    @SerializedName("repos_url")
    @Expose
    private String reposUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("received_events_url")
    @Expose
    private String receivedEventsUrl;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("site_admin")
    @Expose
    private Boolean siteAdmin;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("company")
    @Expose
    private Object company;
    @SerializedName("blog")
    @Expose
    private String blog;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("hireable")
    @Expose
    private Object hireable;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("public_repos")
    @Expose
    private Integer publicRepos;
    @SerializedName("public_gists")
    @Expose
    private Integer publicGists;
    @SerializedName("followers")
    @Expose
    private Integer followers;
    @SerializedName("following")
    @Expose
    private Integer following;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public User() {
    }

    public User(final String userLogin, final String name, final String avatarUrl, final String bio) {
        this.login = userLogin;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.bio = bio;
    }

    public User(final String userLogin) {
        this.login = userLogin;
    }

    /**
     * @return The login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }


    public String getAvatarUrl() {
        return avatarUrl;
    }


    public String getGravatarId() {
        return gravatarId;
    }


    public String getUrl() {
        return url;
    }


    public String getHtmlUrl() {
        return htmlUrl;
    }


    public String getFollowersUrl() {
        return followersUrl;
    }


    public String getFollowingUrl() {
        return followingUrl;
    }


    public String getGistsUrl() {
        return gistsUrl;
    }


    public String getStarredUrl() {
        return starredUrl;
    }


    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }


    public String getOrganizationsUrl() {
        return organizationsUrl;
    }


    public String getReposUrl() {
        return reposUrl;
    }


    public String getEventsUrl() {
        return eventsUrl;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }


    public String getType() {
        return type;
    }

    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public String getName() {
        return name;
    }

    public Object getCompany() {
        return company;
    }

    public String getBlog() {
        return blog;
    }

    public String getLocation() {
        return location;
    }


    public Object getEmail() {
        return email;
    }

    public Object getHireable() {
        return hireable;
    }

    public String getBio() {
        return bio;
    }

    public Integer getPublicRepos() {
        return publicRepos;
    }

    public Integer getPublicGists() {
        return publicGists;
    }

    public Integer getFollowers() {
        return followers;
    }

    public Integer getFollowing() {
        return following;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public void setHireable(Object hireable) {
        this.hireable = hireable;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setPublicRepos(Integer publicRepos) {
        this.publicRepos = publicRepos;
    }

    public void setPublicGists(Integer publicGists) {
        this.publicGists = publicGists;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
