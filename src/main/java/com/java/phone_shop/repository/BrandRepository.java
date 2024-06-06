package com.java.phone_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.phone_shop.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>{
	
}
