package com.acko.demo.DTO;

import com.acko.demo.Exception.InvalidRequestException;
import com.acko.demo.model.Developer;

@Data
public class DeveloperDTO {

    private String name;
    private String phoneNumber;

    public void validate() throws InvalidRequestException
    {
        if(phoneNumber.size() != 10) {
            // more validations can be added
            throw new InvalidRequestException("Invalid phone number");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
