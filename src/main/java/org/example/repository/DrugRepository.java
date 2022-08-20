package org.example.repository;

import org.example.entity.Drug;

public interface DrugRepository {

    void save(Drug drug);
    void remove(long id);
    Drug load(long id);
    Drug load(String name);
    void update(Drug drug);
}
