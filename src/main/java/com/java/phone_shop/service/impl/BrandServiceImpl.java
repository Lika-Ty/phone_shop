package com.java.phone_shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.java.phone_shop.entity.Brand;
import com.java.phone_shop.exception.ApiException;
import com.java.phone_shop.exception.ResourceNotFoundException;
import com.java.phone_shop.repository.BrandRepository;
import com.java.phone_shop.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService{
	@Autowired
	private BrandRepository brandRepository;
	
	@Override
	public Brand create(Brand brand) {
		return brandRepository.save(brand);
	}

	@Override
	public Brand getById(Integer id) {
		return brandRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Brand", id));
	}

	@Override
	public Brand update(Integer id, Brand brandUpdate) {
		Brand brand = getById(id);
		brand.setName(brandUpdate.getName());	//@TODO improve update
		return brandRepository.save(brand);
	}

	@Override
	public List<Brand> getBrands() {
		return brandRepository.findAll();
	}

	@Override
	public List<Brand> getBrands(String name) {
		//return brandRepository.findByNameIgnoreCase(name);
		//return brandRepository.findByNameContaining(name);
		return brandRepository.findByNameContainingIgnoreCase(name);
	}

}
