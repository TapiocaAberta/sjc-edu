package com.sjcdigital.sjcedu.robot.service.impl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.sjcdigital.sjcedu.robot.bots.IdebBot;
import com.sjcdigital.sjcedu.robot.cache.DadosIdebCache;
import com.sjcdigital.sjcedu.robot.model.entities.Escola;
import com.sjcdigital.sjcedu.robot.service.IdebService;

@Default
@RequestScoped
public class IdebServiceImpl implements IdebService {
    
    @Inject
    DadosIdebCache cache;
    
    @Inject
    IdebBot idebBot;

    @Override
    public List<Escola> dadosEscolas() {
        return cache.escolas(() -> idebBot.capturaDadosEscola());
    }

}
