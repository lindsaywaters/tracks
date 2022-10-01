package com.lindsaywaters.tracks.data;


import com.lindsaywaters.tracks.models.Sighting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SightingRepository extends CrudRepository<Sighting, Integer> {
}