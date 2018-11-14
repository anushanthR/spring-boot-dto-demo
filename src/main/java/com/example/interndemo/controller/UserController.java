package com.example.interndemo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.interndemo.dto.UserDto;
import com.example.interndemo.dto.mapping.UserDtoUser;
import com.example.interndemo.entity.User;
import com.example.interndemo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("/{id}")
  public ResponseEntity<UserDto> getOneUser(@PathVariable(name = "id") Integer id) {
    User user = userService.getOneUser(id);
    return new ResponseEntity<>(UserDtoUser.userToUserDto(user), HttpStatus.OK);
  }

  @GetMapping("/")
  public ResponseEntity<List<UserDto>> getAllUser() {
    List<User> userList = userService.getAllUser();
    return new ResponseEntity<>(UserDtoUser.userToUserDto(userList), HttpStatus.OK);
  }

  @PostMapping("/")
  public ResponseEntity<String> createUser(@RequestBody UserDto userDto) {
    User user = UserDtoUser.userDtoToUser(userDto);
    if (userService.createUser(user)) {
      return new ResponseEntity<>("user added succesfully", HttpStatus.OK);
    }
    return new ResponseEntity<>("user adding failed", HttpStatus.BAD_REQUEST);
  }

  @PutMapping("/{id}")
  public ResponseEntity<String> updateUser(@PathVariable(name = "id") Integer id,
      @RequestBody UserDto userDto) {
    User user = UserDtoUser.userDtoToUser(userDto);
    if (userService.updateUser(id, user)) {
      return new ResponseEntity<>("user updated succesfully", HttpStatus.OK);
    }
    return new ResponseEntity<>("user update failed", HttpStatus.BAD_REQUEST);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> dropUser(@PathVariable(name = "id") Integer id) {
    if (userService.dropUser(id)) {
      return new ResponseEntity<>("user deleted succesfully", HttpStatus.OK);
    }
    return new ResponseEntity<>("failed to delete the user", HttpStatus.BAD_REQUEST);
  }

}
