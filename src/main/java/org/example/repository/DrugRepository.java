package org.example.repository;

import org.example.entity.Drug;

import java.sql.SQLException;

public interface DrugRepository {

    void save(Drug drug) throws SQLException;
    void remove(long id) throws SQLException;
    Drug load(String name) throws SQLException;
    void update(Drug drug) throws SQLException;
}
