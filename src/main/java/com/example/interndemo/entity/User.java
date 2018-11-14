package com.example.interndemo.entity;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "User")
@Table(name = "User")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "Id")
  Integer id;
  @Column(name = "FirstName")
  String firstName;
  @Column(name = "LastName")
  String lastName;
  @DateTimeFormat(pattern = "yyyy-mm-dd")
  @Column(name = "DOB")
  LocalDate dob;
  @Column(name = "NIC")
  String nic;
  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
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
