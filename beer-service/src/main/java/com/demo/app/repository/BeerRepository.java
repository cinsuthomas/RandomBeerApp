package com.demo.app.repository;

import com.demo.app.entity.BeerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BeerRepository extends JpaRepository <BeerEntity,Integer> {

    Optional<BeerEntity> findByName(String beerName);
}
