package com.java.phone_shop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.java.phone_shop.dto.BrandDTO;
import com.java.phone_shop.entity.Brand;

@Mapper
public interface BrandMapper {

	BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);
	
	Brand toBrand(BrandDTO dto);
	
	BrandDTO toBrandDTO(Brand entity);
}
