package br.com.renan.spring.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.renan.spring.dto.UsuarioDTO;

@Service
public class UsuarioService {
	
	public static List<UsuarioDTO> usuarios = new ArrayList<>();
	
	public void iniciarLista() {
		
		UsuarioDTO usuario1 = new UsuarioDTO();
		usuario1.setNome("Renan");
		usuario1.setCpf("23044457822");
		usuario1.setDataCadastro(new Date());
		usuario1.setEmail("teste@teste.com");
		usuario1.setEndereco("Rua Teste");
		usuario1.setTelefone("23020305");
		
		UsuarioDTO usuario2 = new UsuarioDTO();
		usuario2.setNome("Julia");
		usuario2.setCpf("23044457821");
		usuario2.setDataCadastro(new Date());
		usuario2.setEmail("teste@teste.com");
		usuario2.setEndereco("Rua Teste");
		usuario2.setTelefone("23020305");
		
		UsuarioDTO usuario3 = new UsuarioDTO();
		usuario3.setNome("João");
		usuario3.setCpf("23044457820");
		usuario3.setDataCadastro(new Date());
		usuario3.setEmail("teste@teste.com");
		usuario3.setEndereco("Rua Teste");
		usuario3.setTelefone("23020305");
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
	
	}

}
