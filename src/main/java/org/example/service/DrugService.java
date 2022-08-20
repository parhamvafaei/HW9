package org.example.service;

import org.example.entity.Drug;

public interface DrugService {
    Drug load(String name);
    void update(Drug drug);

    void save(Drug drug);
}
