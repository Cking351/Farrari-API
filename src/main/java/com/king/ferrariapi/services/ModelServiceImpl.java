package com.king.ferrariapi.services;

import com.king.ferrariapi.exceptions.ResourceNotFoundException;
import com.king.ferrariapi.models.Model;
import com.king.ferrariapi.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "modelService")
public class ModelServiceImpl implements ModelService {
    @Autowired
    private ModelRepository modelRepository;

    @Transactional
    @Override
    public Model save(Model model) {
        Model newModel = new Model();

        if (model.getModelid() != 0) {
            modelRepository.findById(model.getModelid()).orElseThrow(() -> new ResourceNotFoundException("Model id " + model.getModelid() + " not found!"));
            newModel.setModelid(model.getModelid());
        }
        newModel.setModelname(model.getModelname());
        newModel.setModelengine(model.getModelengine());
        newModel.setModelimage(model.getModelimage());
        newModel.setModelpower(model.getModelpower());
        newModel.setModelproduction(model.getModelproduction());
        newModel.setModeltopspeed(model.getModeltopspeed());
        newModel.setModeltopspeed(model.getModeltopspeed());
        newModel.setModeltorque(model.getModeltorque());
        newModel.setModelyears(model.getModelyears());
        newModel.setModelzerotosixty(model.getModelzerotosixty());
        return modelRepository.save(newModel);
    }

    @Override
    public List<Model> findAll() {
        List<Model> list = new ArrayList<>();
        modelRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}
