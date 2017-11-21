package com.rookieslab.api;

import javax.persistence.*;
import java.util.Date;


@NamedQueries({
        @NamedQuery(
                name="findAllEvents",
                query="SELECT e FROM Event e"
        )
})
@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String location;
    private Date date;

    public Event() {

    }

    public Event(String name, String description, String location, Date date) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.date = date;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getLocation() {
        return this.location;
    }

    public Date getDate() {
        return this.date;
    }
}
