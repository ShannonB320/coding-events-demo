package org.launchcode.codingevents.data;
import org.launchcode.codingevents.models.Event;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
        //need to tell CrudRepository the object we're putting in it and the
        //data type of the primary key of those objects



}
