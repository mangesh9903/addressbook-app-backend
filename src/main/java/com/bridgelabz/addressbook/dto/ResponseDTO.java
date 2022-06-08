package com.bridgelabz.addressbook.dto;

import lombok.Data;
import lombok.ToString;
/*********************************************************************
 * Purpose: Class for Response DTO.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 08-06-2022
 *
 **********************************************************************/
@Data
@ToString
public class ResponseDTO {

    private String message;
    private Object data;

    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}
