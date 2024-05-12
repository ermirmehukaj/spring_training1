package com.cydeo.repository;

import com.cydeo.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Long> {


    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to get cinema with a specific name
    Optional<Cinema> findByName(String name);


    //Write a derived query to read sorted the top 3 cinemas that contains a specific sponsored name

    List<Cinema> findTop3BySponsoredNameContainingOrderBySponsoredName(String sponsoredName);


    //Write a derived query to list all cinemas in a specific country

    List<Cinema> findCinemasByLocationCountry(String location);


    //Write a derived query to list all cinemas with a specific name or sponsored name

    List<Cinema> findAllByNameOrSponsoredName(String name , String sponsoredName);


    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to read the cinema name with a specific id
    @Query("SELECT c.name from Cinema c where c.id = ?1")
    List<Cinema> CinemaId(Integer id);



    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all cinemas by location country
    @Query(value = "select * from Cinema where location.country = ?1" , nativeQuery = true)
    List<Cinema> locationCinema(String location);


    //Write a native query to read all cinemas by name or sponsored name contains a specific pattern
    @Query(value = "select * from Cinema where name ILIKE %:pattern% or sponsoredName ILIKE %:pattern%",nativeQuery = true)
    List<Cinema> containsName(String name , String sponsoredName);


    //Write a native query to sort all cinemas by name


    //Write a native query to distinct all cinemas by sponsored name
}
