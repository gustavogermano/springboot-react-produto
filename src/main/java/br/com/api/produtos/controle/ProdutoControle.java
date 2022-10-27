package br.com.api.produtos.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //responsavel por criar rotas
public class ProdutoControle {
    
    @GetMapping("/")
    public String rota(){
        return "Api de produtos funcionando!";
    }
}
