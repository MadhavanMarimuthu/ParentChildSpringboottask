package com.ebrain.springboot.parent_child_springboot.Repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ebrain.springboot.parent_child_springboot.Entity.CustomerEntity;



@Repository
public interface ParentChildRepository extends  CrudRepository<CustomerEntity, UUID> {

	CustomerEntity findByName(String name);

}
