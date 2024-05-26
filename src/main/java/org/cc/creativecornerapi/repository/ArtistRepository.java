package org.cc.creativecornerapi.repository;


import org.cc.creativecornerapi.entity.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Integer> {
}
