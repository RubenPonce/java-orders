package com.titrate.orders.controller;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class OrdersController {

    @GetMapping("/order")
    public ResponseEntity<?>getCustomersWithOrdert (){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/customer/name/${custname}")
    public ResponseEntity<?> getCustomerBasedOnName(@PathVariable String custname){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/data/customer/update/{custcode} ")
    public ResponseEntity<?> updateCustomer(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/data/customer/delete/${custcode}")
    public ResponseEntity<?> deleteCustomer(){

    return new ResponseEntity<>(HttpStatus.OK);
    }

}
