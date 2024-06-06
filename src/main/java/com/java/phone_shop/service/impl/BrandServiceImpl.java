package com.java.phone_shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.phone_shop.entity.Brand;
import com.java.phone_shop.repository.BrandRepository;
import com.java.phone_shop.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService{
	@Autowired
	private BrandRepository brandRepository;
	
	@Override
	public Brand create(Brand brand) {
		Brand brand2 = brandRepository.save(brand);
		return brand2;
	}

}
