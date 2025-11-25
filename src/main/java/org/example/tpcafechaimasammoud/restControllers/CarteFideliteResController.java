package org.example.tpcafechaimasammoud.restControllers;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.Services.ICarteFideliteService;
import org.example.tpcafechaimasammoud.entite.CarteFidelite;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//ou bien @component ou birn @controller + @ResponseBody
@AllArgsConstructor
@RequestMapping("cartefidelite")

public class CarteFideliteResController {
    ICarteFideliteService service;
    @GetMapping
    public List<CarteFidelite> findAll() {
        return service.selectAllCartesFidelite();
    }

}
