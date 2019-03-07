package com.sjcdigital.sjcedu.robot.rest.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.sjcdigital.sjcedu.robot.model.entities.Escola;
import com.sjcdigital.sjcedu.robot.rest.IDEBResource;
import com.sjcdigital.sjcedu.robot.service.IdebService;

@ApplicationScoped
public class IDEBResourceImpl implements IDEBResource {
    
    @Inject
    IdebService idebService;

    @Override
    public List<Escola> escolasComDadosIDEB() {
        return idebService.dadosEscolas();
    }

}
