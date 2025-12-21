package org.example.tpcafechaimasammoud.restControllers;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.Services.ICarteFideliteService;
import org.example.tpcafechaimasammoud.dto.carteFidelite.CarteFideliteRequest;
import org.example.tpcafechaimasammoud.dto.carteFidelite.CarteFideliteResponse;
import org.springframework.web.bind.annotation.*;
import org.example.tpcafechaimasammoud.dto.adresse.AdresseRequest;
import org.example.tpcafechaimasammoud.dto.adresse.AdresseResponse;
import org.springframework.stereotype.Service;
import org.example.tpcafechaimasammoud.dto.*;
import org.example.tpcafechaimasammoud.entite.*;
import org.example.tpcafechaimasammoud.Mapper.*;
import org.example.tpcafechaimasammoud.repositeries.*;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("carteFidelite")
public class CarteFideliteRestController {
    ICarteFideliteService service;

    @PostMapping("saveCarteFideliteDTO")
    public CarteFideliteResponse saveCarteFideliteDTO(@RequestBody CarteFideliteRequest c){
        return service.saveCarteFideliteDTO(c);
    }

    @PostMapping("saveListCarteFidilte")
    public List<CarteFideliteResponse> saveListCarteFidilte(@RequestBody List<CarteFideliteRequest> c){
        return service.saveListCarteFidelteDTO(c);
    }

    @GetMapping("getCarteFideliteByIdDTO/{id}")
    public CarteFideliteResponse getCarteFideliteByIdDTO(@PathVariable long id){
        return service.getCarteFideliteByIdDTO(id);
    }

    @GetMapping("getAllCarteFideliteDTO")
    public List<CarteFideliteResponse> getAllCarteFideliteDTO(){
        return service.getAllCarteFideliteDTO();
    }

    @PutMapping("affecterCarteAClient")
    public void affecterCarteAClient(@RequestParam long idCarte,@RequestParam long idClient){
        service.affecterCarteAClient(idCarte,idClient);
    }
}
