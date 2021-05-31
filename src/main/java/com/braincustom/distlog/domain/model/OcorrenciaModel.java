package com.braincustom.distlog.domain.model;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OcorrenciaModel {

	private Long id;
	private String nome;
	private OffsetDateTime dataRegistro;
}
