package com.braincustom.distlog.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.braincustom.distlog.api.input.EntregaInput;
import com.braincustom.distlog.api.model.EntregaResponse;
import com.braincustom.distlog.domain.model.Entrega;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class EntregaAssembler {

	private ModelMapper modelMapper;
	
	public EntregaResponse toModel(Entrega entrega) {
		return modelMapper.map(entrega, EntregaResponse.class);
	}
	
	public List<EntregaResponse> toCollectionModel(List<Entrega> entregas){
		return entregas.stream()
				.map(this::toModel)
				.collect(Collectors.toList());
	}
	
	public Entrega toEntity(EntregaInput entregaInput) {
		return modelMapper.map(entregaInput, Entrega.class);
	}
}
