package org.example.repository;

import org.example.entity.Patient;

import java.sql.SQLException;

public interface PatientRepository {
    void save(String nationalCode) throws SQLException;
    Patient load (String nationalCode) throws SQLException;

}
