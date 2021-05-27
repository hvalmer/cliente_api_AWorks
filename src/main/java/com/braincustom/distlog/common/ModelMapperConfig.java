package com.braincustom.distlog.common;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

	//adicionando métodos que definem beans spring
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
