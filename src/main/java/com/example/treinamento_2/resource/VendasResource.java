package com.example.treinamento_2.resource;

import com.example.treinamento_2.model.Venda;
import com.example.treinamento_2.repository.Vendas;
import com.example.treinamento_2.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/vendas")
public class VendasResource {
    @Autowired
    private Vendas vendas;

    @Autowired
    private VendaService vendaService;

    @GetMapping
    public List<Venda> listar(){
        return vendas.findAll();
    }

    @PostMapping
    public Venda adicionar(@RequestBody @Valid Venda venda){
        return vendaService.adicionar(venda);
    }

}