package com.java.phone_shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.phone_shop.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>{
	
	List<Brand> findByNameIgnoreCase(String name);
	List<Brand> findByNameContaining(String name);
	List<Brand> findByNameContainingIgnoreCase(String name);
}
