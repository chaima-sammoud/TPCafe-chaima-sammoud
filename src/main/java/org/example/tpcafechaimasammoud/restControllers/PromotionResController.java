package org.example.tpcafechaimasammoud.restControllers;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.Services.IPromotionService;
import org.example.tpcafechaimasammoud.entite.Promotion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//ou bien @component ou birn @controller + @ResponseBody
@AllArgsConstructor
@RequestMapping("promotion")

public class PromotionResController {
    IPromotionService service;
    @GetMapping
    public List<Promotion> findAll() {
        return service.selectAllPromotions();
    }
}

