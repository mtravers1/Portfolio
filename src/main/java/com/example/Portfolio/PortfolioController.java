package com.example.Portfolio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("")
@CrossOrigin
public class PortfolioController {
    private final PortfolioService portfolioService;

    public PortfolioController(PortfolioService portfolioService){
        this.portfolioService=portfolioService;
    }
    @GetMapping("")
    public List<Portfolio>getAll(){
        return portfolioService.getAll();
    }

    // @GetMapping("{id}")
    // public Optional<Portfolio> getbyId(@PathVariable Integer id){
    //     portfolioService.getById(id);
    // }

    @PostMapping("")
    public void addPortfolio(@RequestBody Portfolio portfolio){
        portfolioService.addPortfolio(portfolio);
    }



    @PutMapping("/{id}")
    public void updatePortfolio(@RequestBody Portfolio portfolio, @PathVariable Integer id){
        portfolioService.save(portfolio);
    }


}
