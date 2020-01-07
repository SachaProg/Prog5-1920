package be.hogent.b4.business;

import java.util.Objects;

public class Function {

    private String functionName;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Function function = (Function) o;
        return Objects.equals(functionName, function.functionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionName);
    }
}
