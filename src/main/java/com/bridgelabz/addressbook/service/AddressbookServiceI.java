package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressbookDTO;
import com.bridgelabz.addressbook.model.AddressbookData;

import java.util.List;

/*********************************************************************
 * Purpose: Interface for Addressbook Service.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 08-06-2022
 *
 **********************************************************************/
public interface AddressbookServiceI {
    List<AddressbookData> getAddressbookData();

    AddressbookData getAddressbookDataById(int id);

    AddressbookData addAddressbookData(AddressbookDTO addressbookDTO);

    AddressbookData updateAddressbookData(int id);

    AddressbookData deleteAddressbookData(int id);
}
