package com.bridgelabz.addressbook.model;

import com.bridgelabz.addressbook.dto.AddressbookDTO;
import lombok.Data;
import lombok.ToString;
/*********************************************************************
 * Purpose: Class for Address Book Data.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 08-06-2022
 *
 **********************************************************************/
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

    public AddressbookData(AddressbookDTO addressbookDTO) {
        this.firstName = addressbookDTO.firstName;
        this.lastName = addressbookDTO.lastName;
        this.zipCode = addressbookDTO.zipCode;
        this.state = addressbookDTO.state;
        this.city = addressbookDTO.city;
        this.phoneNumber = addressbookDTO.phoneNumber;
    }
}
