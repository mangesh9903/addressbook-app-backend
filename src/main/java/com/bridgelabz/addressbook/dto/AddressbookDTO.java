package com.bridgelabz.addressbook.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@ToString
@Data
public class AddressbookDTO {

    final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    @Pattern(regexp = NAME_PATTERN, message = " First Name is Invalid!, Please Enter valid First Name.")
    @NotEmpty(message = "First Name cannot be null.")
    public String firstName;

    @Pattern(regexp = NAME_PATTERN, message = " Last Name is Invalid!, Please Enter valid Last Name.")
    @NotEmpty(message = "Last Name cannot be null.")
    public String lastName;

    @Pattern(regexp = "^[1-9]{1}[0-9]{5}]$", message = "Zip Code is Invalid!, Please Enter Valid Zip Code.")
    @NotEmpty(message = "Zip Code cannot be null.")
    public long zipCode;

    @Pattern(regexp = NAME_PATTERN, message = " State is Invalid!, Please Enter Valid State.")
    @NotEmpty(message = "State cannot be null.")
    public String state;

    @Pattern(regexp = NAME_PATTERN, message = " City is Invalid!, Please Enter Valid City.")
    @NotEmpty(message = "City cannot be null.")
    public String city;

    @Pattern(regexp = "^[0-9]{0,2}[-][0-9]{10}", message = "Phone Number is Invalid!, Please Enter valid Phone number.")
    @NotNull(message = "Phone Number Cannot Be Null.")
    public long phoneNumber;

}
