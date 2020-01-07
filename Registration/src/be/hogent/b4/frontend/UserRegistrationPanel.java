package be.hogent.b4.frontend;

import be.hogent.b4.frontend.controller.SaveListener;
import be.hogent.b4.service.FunctionService;
import be.hogent.b4.service.UserService;
import be.hogent.b4.service.dto.UserDto;
import be.hogent.b4.service.impl.UpdateArgs;
import be.hogent.b4.service.impl.UserServiceImpl;
import com.vaadin.ui.*;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class UserRegistrationPanel extends VerticalLayout implements Observer {

    private final UserService userService;
    private final FunctionService functionService;
    private TextField nameTF;
    private TextField streetTF;
    private TextField nrTF;
    private TextField zipTF;
    private TextField cityTF;
    private ListSelect<String> functions;
    private ListSelect<UserDto> overview;

    public UserRegistrationPanel(UserService userService, FunctionService functionService){
        this.userService = userService;
        this.functionService = functionService;
        ((UserServiceImpl)userService).addObserver(this);
        init();
    }


    public void init(){
        addComponent(createInput());
        addComponent(createButtons());
        addComponent(createOverview());
    }

    private Component createInput() {
        VerticalLayout layout = new VerticalLayout();
        layout.addComponent(nameTF = new TextField("Name"));
        layout.addComponent(streetTF = new TextField("Street"));
        layout.addComponent(nrTF = new TextField("Nr"));
        layout.addComponent(zipTF = new TextField("ZIP"));
        layout.addComponent(cityTF = new TextField("City"));
        layout.addComponent(functions = new ListSelect<String>("Functions", functionService.getFunctions()));
        return layout;
    }

    private Component createButtons() {
        Button saveBtn = new Button("Save");
        saveBtn.addClickListener(new SaveListener(this, userService));
        return saveBtn;
    }

    private Component createOverview() {
        overview = new ListSelect<>("Overview");
        //overview.setItems();
        return overview;
    }

    public TextField getNameTF() {
        return nameTF;
    }

    public void setNameTF(TextField nameTF) {
        this.nameTF = nameTF;
    }

    public TextField getStreetTF() {
        return streetTF;
    }

    public void setStreetTF(TextField streetTF) {
        this.streetTF = streetTF;
    }

    public TextField getNrTF() {
        return nrTF;
    }

    public void setNrTF(TextField nrTF) {
        this.nrTF = nrTF;
    }

    public TextField getZipTF() {
        return zipTF;
    }

    public void setZipTF(TextField zipTF) {
        this.zipTF = zipTF;
    }

    public TextField getCityTF() {
        return cityTF;
    }

    public void setCityTF(TextField cityTF) {
        this.cityTF = cityTF;
    }

    public ListSelect<String> getFunctions() {
        return functions;
    }

    public void setFunctions(ListSelect<String> functions) {
        this.functions = functions;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(UpdateArgs.SAVE.equals(arg)){
            clearFields();
            overview.setItems(((UserService)o).getAll());
        }
    }

    private void clearFields() {
        nameTF.clear();
        streetTF.clear();
        nrTF.clear();
        zipTF.clear();
        cityTF.clear();
        functions.setItems(functionService.getFunctions());
    }
}
