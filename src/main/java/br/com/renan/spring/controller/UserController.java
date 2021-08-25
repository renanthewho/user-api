package br.com.renan.spring.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.renan.spring.dto.UsuarioDTO;
import br.com.renan.spring.services.UsuarioService;

@RestController
public class UserController {
	
	@Autowired
	UsuarioService service;
	
	@GetMapping("/users")
	public List<UsuarioDTO> getUsuarios() {
		if(UsuarioService.usuarios.isEmpty()) {
			service.iniciarLista();
		}
		
		return UsuarioService.usuarios;
	}
	
	@GetMapping("/users/{cpf}")
	public UsuarioDTO getUsuarioFiltro(@PathVariable String cpf) {
		
		service.iniciarLista();
		for(UsuarioDTO user:UsuarioService.usuarios) {
			if(user.getCpf().equals(cpf)) {
				return user;
			}
		}
		
		return null;
	}
	
	@PostMapping("/novoUsuario")
	public UsuarioDTO inserirUsuario (@RequestBody UsuarioDTO usuario) {
		
		usuario.setDataCadastro(new Date());
		UsuarioService.usuarios.add(usuario);
		return usuario;
	}
	
	@DeleteMapping("/user/{cpf}")
	public boolean excluirUsuario(@PathVariable String cpf) {

		UsuarioService.usuarios.removeIf(usuario -> usuario.getCpf().equals(cpf)); //A variável "usuário" é o parâmetro CPF que recebi.
		return true;
	}
}
