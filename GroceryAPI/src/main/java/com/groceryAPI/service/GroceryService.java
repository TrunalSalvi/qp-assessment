package com.groceryAPI.service;

import com.groceryAPI.pojo.GroceryElements;
import com.groceryAPI.pojo.GroceryInfo;
import com.groceryAPI.respository.GroceryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroceryService {

    @Autowired
    GroceryRespository grp;

    GroceryElements groceryElements;
    GroceryInfo groceryInfo;

    public GroceryElements getItem(Integer id) {
        return grp.findById(id).orElse(null);
    }

    public GroceryElements addItem(GroceryElements groceryElements) {
        return grp.save(groceryElements);
    }

    public void deleteItem(Integer id) {
        grp.deleteById(id);
    }

    public void updateItem(GroceryElements groceryElements) {
        groceryElements.setAmount(groceryElements.getAmount());
        groceryElements.setName(groceryElements.getName());
        groceryElements.setQuantity(groceryElements.getQuantity());
        grp.save(groceryElements);
    }

    public List<GroceryElements> getAllItem(){
        return grp.findAll();
    }

    public Optional<GroceryInfo> manage(String name){
    return grp.findByName(name).map(groceryElements
            -> new GroceryInfo(groceryElements.getName(),groceryElements.getQuantity()));
    }
}
