package com.tarento.crypto.controller;

import com.tarento.crypto.dto.CryptoDto;
import com.tarento.crypto.modal.Coin;
import com.tarento.crypto.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CoinController  {

    @Autowired
    CoinService coinService ;
    @GetMapping("/getcoin/:id")
    public  Coin get(long id){
        Coin coin = coinService.getCoinById(id);
        return coin;
    }
    @DeleteMapping("/remove")
    public String delete(){
       String msg =  coinService.deleteAllCoin();
       return msg;
    }

    @GetMapping("/getcoins")
    public ArrayList<Coin> getAllCoins(){
        return coinService.getAllCoins();
    }
    @PostMapping("/add")
    public String post(@RequestBody CryptoDto coin){
        String msg = coinService.addCoin(coin);
        return msg;
    }

    @GetMapping("/")
    public String greeting(){
        return "Hello";
    }

   
}
