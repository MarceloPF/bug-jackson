package com;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty(value = "id", access = Access.WRITE_ONLY)
    private Long id;

    private String name;

    private String email;
    
    @JsonProperty(access = Access.READ_ONLY)
    private String password;
    
    private Boolean enable = false;

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

    
    public Boolean getEnable() {
        return enable;
    }

    
    public void setEnable(Boolean enable) {
        this.enable = enable;
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
	UserDTO other = (UserDTO) obj;
	return Objects.equals(id, other.id);
    }


    @Override
    public String toString() {
	return "{id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", enable="
		+ enable + "}";
    }

    
    
  
}
