package com.kazale.pontointeligente.api.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpresaDto {

	private Long id;
	private String razaoSocial;
	private String cnpj;

	@Override
	public String toString() {
		return "EmpresaDto [id=" + id + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + "]";
	}

}
