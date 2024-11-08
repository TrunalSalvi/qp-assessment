package com.groceryAPI.controller;

import com.groceryAPI.pojo.BookingElements;
import com.groceryAPI.respository.BookingRepository;
import com.groceryAPI.respository.GroceryRespository;
import com.groceryAPI.pojo.GroceryElements;
import com.groceryAPI.service.BookingService;
import com.groceryAPI.service.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    GroceryRespository grp;

    @Autowired
    BookingRepository brp;

    @Autowired
    BookingService bsr;

    @Autowired
    GroceryService grs;

    BookingElements bookingElements;

    @PostMapping("/bookGrocery")
    public String saveItem (@RequestBody List<BookingElements> bookingElements){
        bsr.saveItem(bookingElements);
        return "Multiple grocery booked successfully";
    }

    @GetMapping("/getAll")
    public List<GroceryElements> getAllItem(){
        List<GroceryElements> groceryElementsList= grs.getAllItem();
        return groceryElementsList;
    }
}
