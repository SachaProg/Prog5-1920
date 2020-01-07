package be.hogent.b4.service;

import be.hogent.b4.service.dto.UserDto;

import java.util.List;

public interface UserService {

    public void saveUser(UserDto userDto);

    public List<UserDto> getAll();
}
