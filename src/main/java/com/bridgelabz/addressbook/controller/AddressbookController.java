package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressbookDTO;
import com.bridgelabz.addressbook.dto.ResponseDTO;
import com.bridgelabz.addressbook.model.AddressbookData;
import com.bridgelabz.addressbook.service.AddressbookServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

    @Autowired
    private AddressbookServiceI addressbookService;

    /**
     * Method :- Method for Getting All The Address Book Records.
     *
     * @return :- Returning Records.
     */
    @GetMapping("/getAddressbookInfo")
    public ResponseEntity<ResponseDTO> getAddressbookInfo() {
        List<AddressbookData> addressbookList = null;
        addressbookList = addressbookService.getAddressbookData();
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", addressbookList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /**
     * Method :- Method to Get the Address Book Records by Id.
     *
     * @param id :- Passing id as input
     * @return :- Returning Records.
     */
    @GetMapping("/getAddressbookInfo/{id}")
    public ResponseEntity<ResponseDTO> getAddressbookInfoById(@PathVariable int id) {
        AddressbookData addressbookData = null;
        addressbookData = addressbookService.getAddressbookDataById(id);
        ResponseDTO responseDTO = new ResponseDTO("Get Call For ID Successful : ", addressbookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /**
     * Method :- Method to Add the Address Book Record.
     *
     * @param addressbookDTO :- Passing addressbookDTO as input
     * @return :- Returning Response
     */
    @PostMapping("/createAddressbook")
    public ResponseEntity<ResponseDTO> addAddressbookInfo(@Valid @RequestBody AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = addressbookService.addAddressbookData(addressbookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created  Addressbook Data Successfully", addressbookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.CREATED);

    }

    /**
     * Method :- Method to Update the Address Book Record.
     *
     * @param id :- Passing id as input
     * @return :- Returning Response
     */
    @PutMapping("/updateAddressbook/{id}")
    public ResponseEntity<ResponseDTO> updateAddressbookInfo(@PathVariable int id, @Valid @RequestBody AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = addressbookService.updateAddressbookData(id, addressbookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated Addressbook Data Successfully.", addressbookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /**
     * Method :- Method to Delete the Address Book Record.
     *
     * @param id :- Passing id as input.
     * @return :- Returning Response
     */
    @DeleteMapping("/deleteAddressbook/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressbookInfo(@PathVariable int id) {
        addressbookService.deleteAddressbookData(id);
        ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully, ", "Deleted Id : " + id);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
