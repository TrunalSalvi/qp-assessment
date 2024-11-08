package com.groceryAPI.controller;

import com.groceryAPI.pojo.GroceryInfo;
import com.groceryAPI.respository.BookingRepository;
import com.groceryAPI.service.GroceryService;
import com.groceryAPI.respository.GroceryRespository;
import com.groceryAPI.pojo.GroceryElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class MainController {

    @Autowired
    GroceryRespository grp;

    @Autowired
    BookingRepository brp;

    @Autowired
    GroceryService grs;

    GroceryInfo groceryInfo;

        @GetMapping("/{id}")
        public GroceryElements getItem (@PathVariable Integer id) {
        return grs.getItem(id);
    }

        @GetMapping("/{name}/manageGrocery")
        public Optional<GroceryInfo> manageGrocery(@PathVariable String name) {
            return grs.manage(name);
        }

        @PostMapping("/addElement")
        public String addItem (@RequestBody GroceryElements groceryElements){
            grs.addItem(groceryElements);
        return "Data added successfully";
    }

        @PutMapping("/updateElement")
        public String updateItem (@RequestBody GroceryElements groceryElements){
            grs.updateItem(groceryElements);
        return "Data updated successfully";
    }

        @DeleteMapping("/{id}")
        public String deletetem (@PathVariable Integer id){
            grs.deleteItem(id);
        return "Data deleted successfully";
    }

}
