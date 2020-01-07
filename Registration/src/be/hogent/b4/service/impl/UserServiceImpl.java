package be.hogent.b4.service.impl;

import be.hogent.b4.business.Address;
import be.hogent.b4.business.User;
import be.hogent.b4.business.repo.UserRepo;
import be.hogent.b4.service.UserService;
import be.hogent.b4.service.dto.UserDto;
import be.hogent.b4.service.mapper.IMapper;
import be.hogent.b4.service.mapper.UserMapper;

import java.util.List;
import java.util.Observable;

public class UserServiceImpl  extends Observable implements UserService {

    private IMapper<UserDto, User> userMapper;
    private UserRepo userRepo;

    public UserServiceImpl(){
        userMapper = new UserMapper();
        userRepo = new UserRepo();
    }

    @Override
    public void saveUser(UserDto userDto) {
        User user = userMapper.toObj(userDto);
        userRepo.saveUser(user);
        setChanged();
        notifyObservers(UpdateArgs.SAVE);
    }

    /*
    @Override
    public void saveUser(UserDto userDto, AddressDto addressDto) {
        User user = userMapper.toObj(userDto);
        Address address = addressMapper.toObj(addressDto);
        user.setAddress(address);
        userRepo.saveUser(user);
    }
    */

    @Override
    public List<UserDto> getAll() {
        List<User> users = userRepo.getUsers();
        return userMapper.toDTO(users);
    }
}
