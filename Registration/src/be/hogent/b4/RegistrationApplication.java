package be.hogent.b4;

import be.hogent.b4.frontend.UserRegistrationPanel;
import be.hogent.b4.service.FunctionService;
import be.hogent.b4.service.impl.FunctionServiceImpl;
import be.hogent.b4.service.impl.UserServiceImpl;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

@Theme(value = "reindeer")
public class RegistrationApplication extends UI {
    @Override
    public void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        setContent(layout);
        layout.addComponent(new UserRegistrationPanel(new UserServiceImpl(), new FunctionServiceImpl()));
    }
}
