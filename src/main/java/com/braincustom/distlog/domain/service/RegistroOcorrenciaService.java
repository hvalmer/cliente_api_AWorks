package com.braincustom.distlog.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.braincustom.distlog.domain.model.Entrega;
import com.braincustom.distlog.domain.model.Ocorrencia;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RegistroOcorrenciaService {
	
	private BuscaEntregaService buscaEntregaService;

	@Transactional //método inserido dentro de uma transação
	public Ocorrencia registrar(Long entregaId, String descricao) {
		Entrega entrega = buscaEntregaService.buscar(entregaId);
		
		return entrega.adicionarOcorrencia(descricao);
	}
}
