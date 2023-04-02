package br.com.k2santos.linguagens.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LinguagemController {
    @Autowired
    private LinguagemRepository repository;
    @GetMapping(value="/linguagens")
    List<Linguagem> obterLinguagens(){
        List<Linguagem> linguagens = repository.findAll();
        return linguagens;
    }
}
