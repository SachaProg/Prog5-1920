package be.hogent.b4.frontend.controller;

import be.hogent.b4.frontend.UserRegistrationPanel;
import be.hogent.b4.service.UserService;
import be.hogent.b4.service.dto.UserDto;
import com.vaadin.ui.Button;

import java.util.ArrayList;

public class SaveListener implements Button.ClickListener {

    private final UserRegistrationPanel view;
    private final UserService userService;

    public SaveListener(UserRegistrationPanel view, UserService userService) {
        this.view = view;
        this.userService = userService;
    }

    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {
        UserDto userDto = new UserDto();
        userDto.setName(view.getNameTF().getValue());
        userDto.setStreet(view.getStreetTF().getValue());
        userDto.setNr(view.getNrTF().getValue());
        userDto.setZip(view.getZipTF().getValue());
        userDto.setCity(view.getCityTF().getValue());
        userDto.setFunctions(new ArrayList<>(view.getFunctions().getValue()));

        userService.saveUser(userDto);

        /*
        UserDto userDto = new UserDto();
        userDto.setName(view.getNameTF().getValue());
        userDto.setFunctions(new ArrayList<>(view.getFunctions().getValue()));

        AddressDto addressDto = new AddressDto();
        addressDto.setStreet(view.getStreetTF().getValue());
        addressDto.setNr(view.getNrTF().getValue());
        addressDto.setZip(view.getZipTF().getValue());
        addressDto.setCity(view.getCityTF().getValue());

        userService.saveUser(userDto, addressDto);
        */
    }
}
