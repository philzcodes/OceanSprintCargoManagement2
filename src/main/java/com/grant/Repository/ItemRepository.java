package com.grant.Repository;

import org.springframework.data.repository.CrudRepository;

import com.grant.model.Item;

public interface ItemRepository extends CrudRepository<Item, Long>{
	Item findByTrackingId(String id);
}
