package com.java.phone_shop.service;

import com.java.phone_shop.entity.Brand;

public interface BrandService {

	Brand create(Brand brand);
	
	Brand getById(Integer id);
	
	Brand update(Integer id, Brand brandUpdate);
}
