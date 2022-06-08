package com.bridgelabz.addressbook.model;

import com.bridgelabz.addressbook.dto.AddressbookDTO;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

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
@Table(name = "AddresBook")
@Entity
public class AddressbookData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;

    private String lastName;

    private String zipCode;

    private String state;

    private String city;

    private String phoneNumber;

    public AddressbookData() {

    }

    public AddressbookData(AddressbookDTO addressbookDTO) {
        this.firstName = addressbookDTO.firstName;
        this.lastName = addressbookDTO.lastName;
        this.zipCode = addressbookDTO.zipCode;
        this.state = addressbookDTO.state;
        this.city = addressbookDTO.city;
        this.phoneNumber = addressbookDTO.phoneNumber;
    }

}
