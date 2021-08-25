package br.com.renan.spring.dto;

import java.util.Date;

import lombok.Data;

@Data
public class UsuarioDTO {
	
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	private String telefone;
	private Date dataCadastro;

}
