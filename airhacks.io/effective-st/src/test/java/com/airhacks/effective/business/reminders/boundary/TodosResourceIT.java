/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.effective.business.reminders.boundary;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Geovanny Mendoza
 */
public class TodosResourceIT {

    private Client client;
    private WebTarget tut;
    
    @Before
    public void initClient()
    {
        this.client = ClientBuilder.newClient();
        this.tut = this.client.target("http://localhost:8080/effective/api/todos");   
    }
    
    @Test
    public void fetchToDos()
    {
        Response response = this.tut.request(MediaType.TEXT_PLAIN).get();
        assertThat(response.getStatus(),is(200));
        String payload = response.readEntity(String.class);
        assertTrue(payload.startsWith("Hola"));
    }
}
