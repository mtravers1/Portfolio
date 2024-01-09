package com.example.Portfolio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
@Service
public class PortfolioService {

    // private final PortfolioRepository portfolioRepository;
    
    // public PortfolioService(PortfolioRepository portfolioRepository){
    //     this.portfolioRepository=portfolioRepository;
    // }

        List<Portfolio>port=new ArrayList<>();
        public List<Portfolio>getAll(){
            return port;
        }

        public void addPortfolio(Portfolio portfolio){
            port.add(portfolio);
        }

        // public Optional<Portfolio> getById(Integer id){
        //     return port.stream().filter(i->i.id().equals(id)).findFirst();
        // }

        public void save(Portfolio portfolio){
            port.removeIf(c->c.id().equals(portfolio.id()));;
            port.add(portfolio);
        }




        @PostConstruct
    public void init(){
        Portfolio a= new Portfolio(1, "Igotchabailbonds", "bail website", 2022, 2023, "React", "www.abc.com");
        Portfolio b= new Portfolio(2, "Igotchabailbonds", "bail website", 2022, 2023, "React", "www.abc.com");
        port.add(a);
        port.add(b);

    }
}
