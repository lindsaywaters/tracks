package com.lindsaywaters.tracks.data;


import com.lindsaywaters.tracks.models.Sighting;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SightingRepository extends CrudRepository<Sighting, Integer> {



}