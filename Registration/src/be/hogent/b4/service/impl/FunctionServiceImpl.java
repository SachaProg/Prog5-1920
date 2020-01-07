package be.hogent.b4.service.impl;

import be.hogent.b4.business.Function;
import be.hogent.b4.business.repo.FunctionRepo;
import be.hogent.b4.service.FunctionService;
import be.hogent.b4.service.mapper.FunctionMapper;
import be.hogent.b4.service.mapper.IMapper;

import java.util.List;

public class FunctionServiceImpl implements FunctionService {

    private IMapper<String, Function> functionIMapper;
    private FunctionRepo functionRepo;

    public FunctionServiceImpl(){
        functionIMapper = new FunctionMapper();
        functionRepo = new FunctionRepo();
    }

    @Override
    public List<String> getFunctions() {
        List<Function> functionList = functionRepo.getFunctions();
        return functionIMapper.toDTO(functionList);
    }
}
