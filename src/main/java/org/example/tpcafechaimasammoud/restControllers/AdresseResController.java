package org.example.tpcafechaimasammoud.restControllers;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.tpcafechaimasammoud.Services.IAdresseService;
import org.example.tpcafechaimasammoud.dto.adresse.AdresseRequest;
import org.example.tpcafechaimasammoud.entite.Adresse;
import org.springframework.web.bind.annotation.*;
//import service.adresseService;

import java.util.List;

@RestController
//ou bien @component ou birn @controller + @ResponseBody
@AllArgsConstructor
@RequestMapping("adresse")
public class AdresseResController {
    IAdresseService service;
    @PostMapping("addAsresseWithDTO")
public Adresse addAsresseWithDTO(@RequestBody Adresse adresse)
    {
        return service.addAdresse(adresse);

    }
    @GetMapping
    AdresseRequest recupereAdresseDTO(@RequestParam Long id )
    {
        return service.getAdresseDTO(id);
    }








    // htpp://localhost:8089/adresse/getById/1
   // @GetMapping("getById2/{id}" )


}
