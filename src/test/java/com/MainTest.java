package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

public class MainTest {

    @Test
    void validWritePropertie() throws JsonProcessingException {
	var main = new Main();
	var userEntity = new User();
	var user = main.getModel().convertValue(userEntity, UserDTO.class);

	assertEquals(1L, user.getId());
	
	var result = main.getModel().writeValueAsString(user);
	assertTrue(result.contains("\"id\":1"));

    }

}
