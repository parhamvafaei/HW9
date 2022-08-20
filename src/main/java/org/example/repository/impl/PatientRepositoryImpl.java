package org.example.repository.impl;

import org.example.config.DBConfig;
import org.example.entity.Patient;
import org.example.repository.PatientRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientRepositoryImpl implements PatientRepository {
    @Override
    public void save(String nationalCode) throws SQLException {
        String query = """
                insert into patient(national_code)
                values (?)
                """;
        PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query);
        preparedStatement.setString(1, nationalCode);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    @Override
    public Patient load(String nationalCode) throws SQLException {
        String query = """
                select national_code from patient where national_code = ?
                """;
        PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query);
        preparedStatement.setString(1, nationalCode);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            preparedStatement.close();
            return new Patient(nationalCode);
        } else {
            preparedStatement.close();
            return null;
        }
    }

}
