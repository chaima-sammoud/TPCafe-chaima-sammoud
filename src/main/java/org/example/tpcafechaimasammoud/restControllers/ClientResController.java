package org.example.tpcafechaimasammoud.restControllers;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.Services.IClientService;
import org.example.tpcafechaimasammoud.entite.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//ou bien @component ou birn @controller + @ResponseBody
@AllArgsConstructor
@RequestMapping("client")

public class ClientResController {
    IClientService service;
    @GetMapping
    public List<Client> findAll() {
        return service.selectAllClients();
    }
}
