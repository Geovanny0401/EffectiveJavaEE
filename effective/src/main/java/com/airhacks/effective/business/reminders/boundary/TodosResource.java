/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.effective.business.reminders.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
/**
 *
 * @author Geovanny Mendoza
 */
@Path("todos")
public class TodosResource {
    
    @GET
    public String hello()
    {
        return "Hola" + System.currentTimeMillis();
    }
}
