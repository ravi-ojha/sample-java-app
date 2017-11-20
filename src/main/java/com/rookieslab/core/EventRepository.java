package com.rookieslab.core;

import com.rookieslab.api.Event;

import java.util.List;

public interface EventRepository {
    List<Event> findAll();
}
