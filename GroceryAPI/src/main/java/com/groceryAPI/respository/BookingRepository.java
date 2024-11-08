package com.groceryAPI.respository;

import com.groceryAPI.pojo.BookingElements;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingElements,String> {
}
