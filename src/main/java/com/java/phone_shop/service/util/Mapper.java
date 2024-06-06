package com.java.phone_shop.service.util;

import com.java.phone_shop.dto.BrandDTO;
import com.java.phone_shop.entity.Brand;

public class Mapper {

	public static Brand toBrand(BrandDTO brandDTO) {
		Brand brand = new Brand();
		brand.setName(brandDTO.getName());
		return brand;
	}
	
	public static BrandDTO toBrandDTO(Brand brand) {
		BrandDTO brandDTO = new BrandDTO();
		brandDTO.setName(brand.getName());
		return brandDTO;
	}
	
}
