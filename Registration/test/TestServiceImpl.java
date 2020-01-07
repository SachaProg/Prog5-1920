import be.hogent.b4.service.UserService;
import be.hogent.b4.service.dto.UserDto;
import be.hogent.b4.service.impl.UserServiceImpl;

import java.util.Arrays;

public class TestServiceImpl {

    public static void main(String[] args) {
        UserDto dto = new UserDto();
        dto.setName("AAAAA");
        dto.setStreet("BBBBBB");
        dto.setNr("111");
        dto.setZip("2222");
        dto.setCity("CCCCCCC");
        dto.setFunctions(Arrays.asList(new String[]{"DDDDDD", "EEEEEE", "FFFFFF"}));

        UserService userService = new UserServiceImpl();
        userService.saveUser(dto);

        System.out.println(userService.getAll().size() == 1);

        UserDto dto2 = new UserDto();
        dto2.setName("AAAAA");
        dto2.setStreet("BBBBBB");
        dto2.setNr("111");
        dto2.setZip("2222");
        dto2.setCity("CCCCCCC");
        dto2.setFunctions(Arrays.asList(new String[]{"DDDDDD", "EEEEEE", "FFFFFF"}));

        userService.saveUser(dto2);

        System.out.println(userService.getAll().size() == 2);
    }
}
