/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sjcdigital.sjcedu.robot.cache;

import java.util.List;
import java.util.function.Supplier;

import javax.enterprise.context.ApplicationScoped;

import com.sjcdigital.sjcedu.robot.model.entities.Escola;

/**
 * Cache simples para acesso aos dados de escola - TODO: substituir por algo melhor
 */
@ApplicationScoped
public class DadosIdebCache {
    
    private List<Escola> escolas;

    public List<Escola> escolas(Supplier<List<Escola>> supplier) {
        if (escolas == null) {
            escolas = supplier.get();
        }
        return escolas;
    }
    
}
