package com.bridgelabz.addressbook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/*********************************************************************
 * Purpose: Class for Rest Controller.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 08-06-2022
 *
 **********************************************************************/
@RequestMapping("/addressbook")
@RestController
public class AddressbookController {

    @GetMapping("/getAddressbookInfo")
    public ResponseEntity<String> getAddressbookInfo(){
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/getAddressbookInfo/{id}")
    public ResponseEntity<String> getAddressbookInfoById(@PathVariable int id){
        return new ResponseEntity<String>("Get Call Success for Id : "+ id, HttpStatus.OK);
    }

    @PostMapping("/createAddressbook")
    public ResponseEntity<String> addAddressbookInfo(@RequestBody  String addressbook ){
        return new ResponseEntity<String>("Create Addressbook for : "+ addressbook, HttpStatus.CREATED);
    }

    @PutMapping("/updateAddressbook")
    public ResponseEntity<String> updateAddressbookInfo(@RequestBody  String addressbook ){
        return new ResponseEntity<String>("Updated Addressbook for : "+ addressbook, HttpStatus.OK);
    }

    @DeleteMapping("/deleteAddressbookAddressbook/{id}")
    public ResponseEntity<String> deleteAddressbookInfo(@PathVariable  int id ){
        return new ResponseEntity<String>("Delete call Success for Id : "+ id, HttpStatus.OK);
    }
}
