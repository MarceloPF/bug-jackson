package com;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id = 1L;

    private String name = "Marcelo";

    private String email = "test@gmail.com";

    private String password = "123456";

    private String token = "t1234";

    private String refresh = "t2345";

    private Boolean enable = true;

    private Boolean hashAble = true;

    private Date dataLastChange = new Date();

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getToken() {
	return token;
    }

    public void setToken(String token) {
	this.token = token;
    }

    public String getRefresh() {
	return refresh;
    }

    public void setRefresh(String refresh) {
	this.refresh = refresh;
    }

    public Boolean getEnable() {
	return enable;
    }

    public void setEnable(Boolean enable) {
	this.enable = enable;
    }

    public Boolean getHashAble() {
	return hashAble;
    }

    public void setHashAble(Boolean hashAble) {
	this.hashAble = hashAble;
    }

    public Date getDataLastChange() {
	return dataLastChange;
    }

    public void setDataLastChange(Date dataLastChange) {
	this.dataLastChange = dataLastChange;
    }

    @Override
    public int hashCode() {
	return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	User other = (User) obj;
	return Objects.equals(id, other.id);
    }

    @Override
    public String toString() {
	return "{id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", token=" + token
		+ ", refresh=" + refresh + ", enable=" + enable + ", hashAble=" + hashAble + ", dataLastChange="
		+ dataLastChange + "}";
    }
    
    

}
