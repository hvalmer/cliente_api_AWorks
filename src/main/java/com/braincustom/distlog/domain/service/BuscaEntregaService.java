package com.braincustom.distlog.domain.service;

import org.springframework.stereotype.Service;

import com.braincustom.distlog.domain.exception.EntidadeNaoEncontradaException;
import com.braincustom.distlog.domain.model.Entrega;
import com.braincustom.distlog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada!"));
	}
}
