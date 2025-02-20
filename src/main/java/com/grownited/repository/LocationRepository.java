package com.grownited.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grownited.entity.LocationEntity;

@Repository
public interface LocationRepository extends JpaRepository<LocationEntity, Integer>{

}
