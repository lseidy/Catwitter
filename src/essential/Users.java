package essential;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


public class Users {
    public Users() {
    }

    private String username;
    private String password;

    private String name;
    private String end;
    private String celular;
    private String email;
    private String formacao;
    private List links;
    private List<String> posts = new ArrayList<>();
    private String adminUser = "admin";
    private String adminPassWord = "UFP31";

    public String getAdminUser() {
        return adminUser;
    }

    public String getAdminPassWord() {
        return adminPassWord;
    }

    public Users(String username, String password, String name, String email) {
        super();
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEnd() {
        return end;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public String getFormacao() {
        return formacao;
    }

    public List getLinks() {
        return links;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void setLinks(List links) {
        this.links = links;
    }
    public List<String> getPosts() {
        return posts;
    }

    public void setPosts(String post) {
        this.posts.add(post);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        this.posts.add(String.valueOf(timestamp));
        Posts.setPostsAll(this.username,post, String.valueOf(timestamp));
    }

}