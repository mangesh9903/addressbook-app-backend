package com.bridgelabz.addressbook.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AddressbookData {


    private int id;

    private String firstName;

    private String lastName;

    private long zipCode;

    private String state;

    private String city;

    private long phoneNumber;

}
