package essential;

import catwitter.Main;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Users extends Posts{

    @Override
    public String toString() {
        return  "username: " + username + 
                "\n name=" + name + 
                "\n email=" + email;
    }
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
    private Posts post;
    private ArrayList<Posts> posts = new ArrayList<>();

    public ArrayList<Posts> getPosts() {
        return posts;
    }

    public void setPosts(String mensagem, String author) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();        
	String timestamp = dateFormat.format(date);
        
        this.post = new Posts(author, timestamp, mensagem);
        
        Main.control.setPostsAll(post);
        
    }
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
   


}
