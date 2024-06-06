package com.java.phone_shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.phone_shop.dto.BrandDTO;
import com.java.phone_shop.entity.Brand;
import com.java.phone_shop.service.BrandService;
import com.java.phone_shop.service.util.Mapper;

@RestController
@RequestMapping("brands")
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO) {
		Brand brand = Mapper.toBrand(brandDTO);
		brand = brandService.create(brand);
		//return ResponseEntity.ok(Mapper.toBrand(brandDTO));
		
		return ResponseEntity.ok(Mapper.toBrandDTO(brand));
	}
}
