package com.idp.drinkmanagerrest.controller;

import com.idp.drinkmanagerrest.repository.DrinkRepository;
import com.idp.drinkmanagerrest.model.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping({"/drinks"})
public class DrinkController {

//    @Autowired
    private DrinkRepository drinkRepository;

    public DrinkController(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    @GetMapping
    public List findAll(){
        System.out.println("get all");
        return drinkRepository.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Drink> findById(@PathVariable int id){
        System.out.println("get" + id);
        return drinkRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Drink create(@RequestBody Drink drink){
        return drinkRepository.save(drink);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Drink> update(@PathVariable("id") int id,
                                          @RequestBody Drink drink){

        System.out.println("update" + id);
        return drinkRepository.findById(id)
                .map(record -> {
                    record.setName(drink.getName());
                    record.setYear(drink.getYear());
                    record.setCountry(drink.getCountry());
                    record.setCountry(drink.getCountry());
                    record.setSweetness(drink.getSweetness());
                    record.setAlcohol(drink.getAlcohol());
                    record.setDrinkType(drink.getDrinkType());
                    record.setSweetness(drink.getStrength());
                    record.setFlavor(drink.getFlavor());
                    record.setRegion(drink.getRegion());


                    Drink updated = drinkRepository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        System.out.println("delete" + id);
        return drinkRepository.findById(id)
                .map(record -> {
                    drinkRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
