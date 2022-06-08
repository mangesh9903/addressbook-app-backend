package com.bridgelabz.addressbook.dto;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class AddressbookDTO {

    public String firstName;

    public String lastName;

    public long zipCode;

    public String state;

    public String city;

    public long phoneNumber;

}
