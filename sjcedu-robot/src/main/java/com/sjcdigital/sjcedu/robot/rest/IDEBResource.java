package com.sjcdigital.sjcedu.robot.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.sjcdigital.sjcedu.robot.model.entities.Escola;

/**
 * Acesso aos dados do IDEB via REST
 */
@Path("ideb")
public interface IDEBResource {

    @GET
    @Path("escolas")
    @Produces("application/json; charset=UTF-8")
    public List<Escola> escolasComDadosIDEB();
}
