package com.example.interndemo.dto.mapping;

import java.util.ArrayList;
import java.util.List;

import com.example.interndemo.dto.UserDto;
import com.example.interndemo.entity.PhoneNumber;
import com.example.interndemo.entity.User;

public class UserDtoUser {

	private UserDtoUser() {
	}

	public static UserDto userToUserDto(User user) {
		UserDto userDto = new UserDto();

		if (user != null) {
			userDto.setId(user.getId());
			userDto.setFirstName(user.getFirstName());
			userDto.setLastName(user.getLastName());
			userDto.setDob(user.getDob());
			userDto.setNic(user.getNic());
			
			List<PhoneNumber> phoneNo = user.getPhoneNumber();
			List<String> phone = new ArrayList<>();
			for (PhoneNumber pn : phoneNo) {
				phone.add(pn.getPhone());
			}
			userDto.setPhoneNumber(phone);
			
			return userDto;
		}
		return null;

	}

	public static User userDtoToUser(UserDto userDto) {
    User user = new User();

    user.setId(userDto.getId());
    user.setFirstName(userDto.getFirstName());
    user.setLastName(userDto.getLastName());
    user.setDob(userDto.getDob());
    user.setNic(userDto.getNic());
    
    List<PhoneNumber> phoneNo = user.getPhoneNumber();
	List<String> phone = new ArrayList<>();
	for (PhoneNumber pn : phoneNo) {
		phone.add(pn.getPhone());
	}
	userDto.setPhoneNumber(phone);
	
    return user;
  }

	public static List<UserDto> userToUserDto(List<User> userList) {

		if (userList != null) {
			List<UserDto> lUserDto = new ArrayList<>();
			for (User user : userList) {
				UserDto userDto = new UserDto();

				userDto.setId(user.getId());
				userDto.setFirstName(user.getFirstName());
				userDto.setLastName(user.getLastName());
				userDto.setDob(user.getDob());
				userDto.setNic(user.getNic());

				List<PhoneNumber> phoneNo = user.getPhoneNumber();
				List<String> phone = new ArrayList<>();
				for (PhoneNumber pn : phoneNo) {
					phone.add(pn.getPhone());
				}
				userDto.setPhoneNumber(phone);

				lUserDto.add(userDto);
			}

			return lUserDto;
		}
		return null;

	}
}
