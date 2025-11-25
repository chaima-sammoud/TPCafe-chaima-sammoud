package org.example.tpcafechaimasammoud.restControllers;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.Services.IDetailCommandeService;
import org.example.tpcafechaimasammoud.entite.Detail_Commande;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
//ou bien @component ou birn @controller + @ResponseBody
@AllArgsConstructor
@RequestMapping("detail_commande")
public class Detail_CommandeResController {
    IDetailCommandeService service;
    @GetMapping
    public List<Detail_Commande> findAll() {
        return service.selectAllDetailCommandes();
    }

}
