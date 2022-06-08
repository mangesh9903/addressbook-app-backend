package com.bridgelabz.addressbook.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
/*********************************************************************
 * Purpose: Class for Address Book DTO.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 08-06-2022
 *
 **********************************************************************/
@ToString
@Data
public class AddressbookDTO {


    @Pattern(regexp =  "^[A-Z]{1}[a-z]{2,}$", message = " First Name is Invalid!, Please Enter valid First Name.")
    @NotEmpty(message = "First Name cannot be null.")
    public String firstName;

    @Pattern(regexp =  "^[A-Z]{1}[a-z]{2,}$", message = " Last Name is Invalid!, Please Enter valid Last Name.")
    @NotEmpty(message = "Last Name cannot be null.")
    public String lastName;

    @Pattern(regexp = "^[1-9]{1}[0-9]{5}$", message = "Zip Code is Invalid!, Please Enter Valid Zip Code.")
    @NotBlank(message = "Zip Code cannot be null.")
    public String zipCode;

    @Pattern(regexp =  "^[a-zA-Z]{2,}$", message = " State is Invalid!, Please Enter Valid State.")
    @NotEmpty(message = "State cannot be null.")
    public String state;

    @Pattern(regexp =  "^[a-zA-Z]{2,}$", message = " City is Invalid!, Please Enter Valid City.")
    @NotEmpty(message = "City cannot be null.")
    public String city;

    @Pattern(regexp = "^[0-9]{1}[0-9]{9}$", message = "Phone Number is Invalid!, Please Enter valid Phone number.")
    @NotNull(message = "Phone Number Cannot Be Null.")
    public String phoneNumber;

}
