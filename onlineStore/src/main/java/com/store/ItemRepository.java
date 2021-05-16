package com.store;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

	List<Item> findByProductOrderByGenderDescDiscountpriceAsc(String searchkey);

	List<Item> findByProductOrderByGenderAscDiscountpriceAsc(String searchkey);
	
	//for new arrival
	
	//female
	List<Item> findAllByOrderByNewarrivalDescGenderAscDiscountpriceAsc();
	//male
	List<Item> findAllByOrderByNewarrivalDescGenderDescDiscountpriceAsc();
	
	//for discounted
	//male
	List<Item> findAllByOrderByDiscountedDescGenderDescDiscountpriceAsc();
	//female
	List<Item> findAllByOrderByDiscountedDescGenderAscDiscountpriceAsc();
}
