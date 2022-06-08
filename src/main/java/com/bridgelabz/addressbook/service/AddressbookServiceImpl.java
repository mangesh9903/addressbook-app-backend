package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressbookDTO;
import com.bridgelabz.addressbook.exception.AddressbookException;
import com.bridgelabz.addressbook.model.AddressbookData;
import com.bridgelabz.addressbook.repository.AddressbookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
@Slf4j
@Service
public class AddressbookServiceImpl implements AddressbookServiceI {

    @Autowired
    private AddressbookRepository addressbookRepository;

    /**
     * Method :- Method for Getting All The Address Book Records.
     *
     * @return :- Returning Records
     */
    @Override
    public List<AddressbookData> getAddressbookData() {
        return addressbookRepository.findAll();
    }

    /**
     * Method :- Method to Get the Address Book Records by Id.
     *
     * @param id :- Passing id as input
     * @return :- Returning Records.
     */
    @Override
    public AddressbookData getAddressbookDataById(int id) {
        return addressbookRepository.findById(id).orElseThrow(() -> new AddressbookException("Addressbook Data with  Id " + id + " Does Not Exists In Database."));
    }

    /**
     * Method :- Method to Add the Address Book Record.
     *
     * @param addressbookDTO :- Passing addressbookDTO as input
     * @return :- Returning addressbookData
     */
    @Override
    public AddressbookData addAddressbookData(AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(addressbookDTO);
        log.debug("Addressbook Data : "+addressbookData);
        addressbookRepository.save(addressbookData);
        return addressbookData;
    }

    /**
     * Method :- Method to Update the Address Book Record.
     *
     * @param id             :- Passing id as input
     * @param addressbookDTO
     * @return :- Returning addressbookData
     */
    @Override
    public AddressbookData updateAddressbookData(int id, AddressbookDTO addressbookDTO) {
       AddressbookData addressbookData = this.getAddressbookDataById(id);
       addressbookData.setFirstName(addressbookDTO.firstName);
       addressbookData.setLastName(addressbookDTO.lastName);
       addressbookData.setState(addressbookDTO.state);
       addressbookData.setCity(addressbookDTO.city);
       addressbookData.setZipCode(addressbookDTO.zipCode);
       addressbookData.setPhoneNumber(addressbookDTO.phoneNumber);
       addressbookRepository.save(addressbookData);
       return addressbookData;
    }

    /**
     * Method :- Method to Delete the Address Book Record.
     *
     * @param id :- Passing id as input.
     * @return :- Returning addressbookData
     */
    @Override
    public void deleteAddressbookData(int id) {
        AddressbookData addressbookData = this.getAddressbookDataById(id);
        addressbookRepository.delete(addressbookData);
    }
}
