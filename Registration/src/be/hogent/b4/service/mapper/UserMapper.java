package be.hogent.b4.service.mapper;

import be.hogent.b4.business.Address;
import be.hogent.b4.business.Function;
import be.hogent.b4.business.User;
import be.hogent.b4.service.dto.UserDto;

import java.util.ArrayList;
import java.util.List;

public class UserMapper implements IMapper<UserDto, User> {


    @Override
    public User toObj(UserDto userDto) {
        if(userDto == null)
            return null;
        User user = new User();
        user.setName(userDto.getName());
        user.setAddress(createAddress(userDto));
        user.setFunctions(createFunctions(userDto));
        return user;
    }

    private List<Function> createFunctions(UserDto userDto) {
        List<String> functions = userDto.getFunctions();
        List<Function> functionList = new ArrayList<>();
        functions.forEach(fStr -> functionList.add(createFunction(fStr)));
        return functionList;
    }

    private Function createFunction(String f) {
        Function function = new Function();
        function.setFunctionName(f);
        return function;
    }

    private Address createAddress(UserDto userDto) {
        Address address = new Address();
        address.setStreet(userDto.getStreet());
        address.setNr(Integer.parseInt(userDto.getNr()));
        address.setZip(Integer.parseInt(userDto.getZip()));
        address.setCity(userDto.getCity());
        return address;
    }

    @Override
    public UserDto toDTO(User user) {
        if(user == null)
            return null;
        UserDto dto = new UserDto();
        dto.setName(user.getName());
        if(user.getAddress() !=null){
            dto.setStreet(user.getAddress().getStreet());
            dto.setNr(Integer.toString(user.getAddress().getNr()));
            dto.setZip(Integer.toString(user.getAddress().getZip()));
            dto.setCity(user.getAddress().getCity());
        }
        if(user.getFunctions() != null && !user.getFunctions().isEmpty()){
            List<String> functions = new ArrayList<>();
            user.getFunctions().forEach(f -> functions.add(f.getFunctionName()));
            dto.setFunctions(functions);
        }
        return dto;
    }
}
