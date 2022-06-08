package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressbookDTO;
import com.bridgelabz.addressbook.model.AddressbookData;
import org.springframework.stereotype.Service;

import java.util.List;
/*********************************************************************
 * Purpose: Class for Addressbook Service Implementation.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 08-06-2022
 *
 **********************************************************************/
@Service
public class AddressbookServiceImpl implements AddressbookServiceI {


    /**
     * Method :- Method for Getting All The Address Book Records.
     *
     * @return :- Returning Records
     */
    @Override
    public List<AddressbookData> getAddressbookData() {
        return null;
    }

    /**
     * Method :- Method to Get the Address Book Records by Id.
     *
     * @param id :- Passing id as input
     * @return :- Returning Records.
     */
    @Override
    public AddressbookData getAddressbookDataById(int id) {
        return null;
    }

    /**
     * Method :- Method to Add the Address Book Record.
     *
     * @param addressbookDTO :- Passing addressbookDTO as input
     * @return :- Returning addressbookData
     */
    @Override
    public AddressbookData addAddressbookData(AddressbookDTO addressbookDTO) {
        return null;
    }

    /**
     * Method :- Method to Update the Address Book Record.
     *
     * @param id :- Passing id as input
     * @return :- Returning addressbookData
     */
    @Override
    public AddressbookData updateAddressbookData(int id) {
        return null;
    }

    /**
     * Method :- Method to Delete the Address Book Record.
     *
     * @param id :- Passing id as input.
     * @return :- Returning addressbookData
     */
    @Override
    public AddressbookData deleteAddressbookData(int id) {
        return null;
    }
}
