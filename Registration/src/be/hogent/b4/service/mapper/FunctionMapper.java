package be.hogent.b4.service.mapper;

import be.hogent.b4.business.Function;

public class FunctionMapper implements IMapper<String, Function> {
    @Override
    public Function toObj(String s) {
        if( s == null)
            return null;
        Function function = new Function();
        function.setFunctionName(s);
        return function;
    }

    @Override
    public String toDTO(Function function) {
        if(function == null)
            return null;
        return function.getFunctionName();
    }
}
