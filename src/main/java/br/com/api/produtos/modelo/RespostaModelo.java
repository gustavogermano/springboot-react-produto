package br.com.api.produtos.modelo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component //usado para o spring realizar a injeção de dependencias, sem o desenvolvedor precisar instanciar objetos
@Getter
@Setter
public class RespostaModelo {
    
    private String mensagem;
}
