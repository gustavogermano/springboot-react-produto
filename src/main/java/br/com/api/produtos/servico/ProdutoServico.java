package br.com.api.produtos.servico;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.api.produtos.modelo.ProdutoModelo;
import br.com.api.produtos.repositorio.ProdutoRepositorio;

public class ProdutoServico {
    
    @Autowired
    private ProdutoRepositorio pr;

    public Iterable<ProdutoModelo> listar(){
        return pr.findAll();
    }
}
