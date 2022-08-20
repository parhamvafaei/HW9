package org.example.service;

import org.example.entity.Patient;

import java.sql.SQLException;

public interface PatientService {
    boolean save(String nationalCode) throws SQLException;
    Patient load(String nationalCode) throws SQLException;

}
