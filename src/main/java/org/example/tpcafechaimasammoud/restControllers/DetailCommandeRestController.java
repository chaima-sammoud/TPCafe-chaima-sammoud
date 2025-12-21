package org.example.tpcafechaimasammoud.restControllers;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.Services.IDetailCommandeService;
import org.example.tpcafechaimasammoud.dto.detailCommande.DetailCommandeRequest;
import org.example.tpcafechaimasammoud.dto.detailCommande.DetailCommandeResponse;
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
@RequestMapping("detailCommande")
public class DetailCommandeRestController {
    IDetailCommandeService service;

    @PostMapping("saveDetailCommandeDTO")
    public DetailCommandeResponse saveDetailCommandeDTO(@RequestBody DetailCommandeRequest d) {
        return service.saveDetailCommandeDTO(d);
    }

    @PostMapping("saveDetailCommandesDTO")
    public List<DetailCommandeResponse> saveDetailCommandesDTO(@RequestBody List<DetailCommandeRequest> d) {
        return service.saveDetailCommandesDTO(d);
    }

    @GetMapping("getDetailCommandeByIdDTO/{id}")
    public DetailCommandeResponse getDetailCommandeByIdDTO(@PathVariable long id) {
        return service.getDetailCommandeByIdDTO(id);
    }

    @GetMapping("getAllDetailCommandesDTO")
    public List<DetailCommandeResponse> getAllDetailCommandesDTO() {
        return service.getAllDetailCommandesDTO();
    }
}
