package com.rookieslab.resources;

import com.rookieslab.api.Event;
import com.rookieslab.core.EventRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Path("events")
@Produces(MediaType.APPLICATION_JSON)
public class EventResource {

    private EventRepository repository;

    public EventResource(EventRepository repository) {
        this.repository = repository;
    }

    @GET
    public List<Event> allEvents() {
        /*Event e = new Event();
        e.setDate(new Date());
        e.setName("Birthday");
        e.setId(1);
        e.setDescription("Celebrations on the occasion of the first birthday!");
        e.setLocation("Flipkart PW office");

        return Collections.singletonList(e);*/
        return repository.findAll();
    }
}
