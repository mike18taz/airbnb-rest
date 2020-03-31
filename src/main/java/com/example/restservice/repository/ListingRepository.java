package com.example.restservice.repository;

import java.util.List;

import com.example.restservice.domain.Listing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "listings", path = "listings")
public interface ListingRepository extends MongoRepository<Listing, String> {

    List<Listing> findByName(@Param("name") String name);
    // http://localhost:8080/listings/search/findByPropertyType?name=Apartment
    //List<Listing> findByPropertyType(@Param("name") String name);
    List<Listing> findByPropertyType( String name);
    //List<Listing> findByZipcode(@Param("name") String name);

}