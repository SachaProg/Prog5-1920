package be.hogent.b4.business.repo;

import be.hogent.b4.business.Function;
import be.hogent.b4.business.User;

import java.util.ArrayList;
import java.util.List;

public class FunctionRepo {

    private List<Function> functions;

    public FunctionRepo(){
        functions = new ArrayList<>();

        Function f1 = new Function();
        f1.setFunctionName("Zaakvoerder");

        Function f2 = new Function();
        f2.setFunctionName("Kassabeheerder");

        Function f3 = new Function();
        f3.setFunctionName("Klantbeheerder");

        functions.add(f1);
        functions.add(f2);
        functions.add(f3);
    }

    public List<Function> getFunctions() {
        return functions;
    }
}
