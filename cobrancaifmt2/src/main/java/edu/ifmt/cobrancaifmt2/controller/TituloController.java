package edu.ifmt.cobrancaifmt2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ifmt.cobrancaifmt2.model.Titulo;
import edu.ifmt.cobrancaifmt2.repository.Autowired;
import edu.ifmt.cobrancaifmt2.repository.Titulos;

@Controller //anotacao controller do Spring
@RequestMapping("/titulos")//mapeamento da url
class TituloController {
	@RequestMapping("/novo")//mapeamento da url
	public String novo() {//metodo que retorna uma String com o nome da view
		return "CadastroTitulo";

	}
	
	@Autowired //anotação que irá injetar a dependencia
	private Titulos titulos;
	
	
	@RequestMapping(method=RequestMethod.POST)
	public void salvar(Titulo titulo) {
		titulos.save(titulo);
		return "CadastroTitulo";
	}

}
