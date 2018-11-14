package com.example.interndemo.dto;

import java.time.LocalDate;
import java.util.List;
import com.example.interndemo.entity.PhoneNumber;

public class UserDto {

  Integer id;
  String firstName;
  String lastName;
  LocalDate dob;
  String nic;
  List<PhoneNumber> phoneNumber;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public String getNic() {
    return nic;
  }

  public void setNic(String nic) {
    this.nic = nic;
  }

  public List<PhoneNumber> getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(List<PhoneNumber> phoneNumber) {
    this.phoneNumber = phoneNumber;
  }



}
