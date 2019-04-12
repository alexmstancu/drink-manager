package com.idp.drinkmanagerrest.repository;

import com.idp.drinkmanagerrest.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Integer> {
}
