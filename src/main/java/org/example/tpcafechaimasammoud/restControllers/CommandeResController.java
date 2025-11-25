package org.example.tpcafechaimasammoud.restControllers;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.Services.ICommandeService;
import org.example.tpcafechaimasammoud.entite.Commande;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//ou bien @component ou birn @controller + @ResponseBody
@AllArgsConstructor
@RequestMapping("commande")

public class CommandeResController {
    ICommandeService service;
    @GetMapping
    public List<Commande> findAll() {
        return service.selectAllCommandes();
    }
    //find by id
    public Commande findById(long id) {
        return service.selectCommandeByIdWithGet(id);
    }
}
