package com.groceryAPI.service;

import com.groceryAPI.pojo.BookingElements;
import com.groceryAPI.pojo.GroceryElements;
import com.groceryAPI.respository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    BookingRepository brp;

    public List<BookingElements> saveItem(List<BookingElements> bookingElements){
       return brp.saveAll(bookingElements);
    }
}
