package com.tarento.crypto.service;

import com.tarento.crypto.dto.CryptoDto;
import com.tarento.crypto.modal.Coin;
import com.tarento.crypto.repository.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CoinService{

    @Autowired
    CoinRepository coinRepository;


    public ArrayList<Coin> getAllCoins() {
        return (ArrayList<Coin>) coinRepository.findAll();
    }


    public Coin getCoinById(long id) {
        Optional<Coin> opt =  coinRepository.findById(id);
        if(opt.isPresent())
            return opt.get();
        return null;
    }


    public String deleteAllCoin() {
        coinRepository.deleteAll();
        return "Successfully Deleted All Coins.";
    }


    public String deleteCoinById(long id) {
        coinRepository.deleteById(id);

        return "Successfully Deleted Coin.";

    }


//    Coin coin = new Coin("Bitcoin","BTN",3200.000);
    public String addCoin(CryptoDto coin) {
        Coin newCoin = new Coin();
        newCoin.setName(coin.getName());
        newCoin.setSymbol(coin.getSymbol());
        newCoin.setPrice(coin.getPrice());
        coinRepository.save(newCoin);
        return "Successully Added";
    }




    public String addMultipleCoin(ArrayList<Coin> coins) {
        return null;
    }
}

