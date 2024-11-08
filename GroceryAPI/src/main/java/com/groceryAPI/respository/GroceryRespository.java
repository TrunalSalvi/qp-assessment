package com.groceryAPI.respository;

import com.groceryAPI.pojo.GroceryElements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

@EnableJpaRepositories
public interface GroceryRespository extends JpaRepository<GroceryElements, Integer>{

    Optional<GroceryElements> findByName(String name);

}
