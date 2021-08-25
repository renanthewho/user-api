package br.com.renan.spring.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.renan.spring.dto.UsuarioDTO;
import lombok.Data;

@Entity
@Data
public class Usuario {
	
	@Id
	@GeneratedValue(strategy	=	GenerationType.IDENTITY)
	private long	id;								
	private	String	nome;								
	private	String	cpf;								
	private	String	endereco;
	private	String	email;
	private	String	telefone;
	private	Date	dataCadastro;
	
	
	public static Usuario convert (UsuarioDTO usuarioDTO) {
		
		Usuario usuario = new Usuario();
		usuario.setCpf(usuarioDTO.getCpf());
		usuario.setDataCadastro(usuarioDTO.getDataCadastro());
		usuario.setEmail(usuarioDTO.getEmail());
		usuario.setEndereco(usuarioDTO.getEndereco());
		usuario.setNome(usuarioDTO.getNome());
		usuario.setTelefone(usuarioDTO.getTelefone());
		
		return usuario;
	}
}

	
