package com;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class Main {

    private ObjectMapper model;

    public Main() {
	model = modelMapper();
    }

    public static void main(String[] args) {
	var main = new Main();
	var userEntity = new User();
	System.out.println(userEntity.toString());
	var user = main.getModel().convertValue(userEntity, UserDTO.class);
	System.out.println(user.toString());
	try {
	    System.out.println(main.getModel().writeValueAsString(user));
	} catch (JsonProcessingException e) {
	    e.printStackTrace();
	}
    }

    public ObjectMapper getModel() {
	return model;
    }

    private ObjectMapper modelMapper() {
	var model = new ObjectMapper();
	model.registerModule(new SimpleModule());
	model.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	model.setSerializationInclusion(JsonInclude.Include.NON_ABSENT);
	model.configure(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID, false);
	return model;
    }

}
