package edu.ifmt.cobrancaifmt2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ifmt.cobrancaifmt2.model.Titulo;

import edu.ifmt.cobrancaifmt2.repository.Titulos;

@Controller //anotacao controller do Spring
@RequestMapping("/titulos")//mapeamento da url
class TituloController {
	
	@Autowired //anotação que irá injetar a dependencia
	private Titulos titulos;
	
	@RequestMapping("/novo")//mapeamento da url
	public String novo() {//metodo que retorna uma String com o nome da view
		return "CadastroTitulo";

	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvar(Titulo titulo) {
		titulos.save(titulo);
		return "CadastroTitulo";
	}

}
