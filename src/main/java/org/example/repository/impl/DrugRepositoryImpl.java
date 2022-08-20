package org.example.repository.impl;

import org.example.config.DBConfig;
import org.example.entity.Drug;
import org.example.repository.DrugRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DrugRepositoryImpl implements DrugRepository {
    @Override
    public void save(Drug drug) throws SQLException {
        String query = """
                    insert into drugs(name, price, count)
                    values(?,?,?)
                """;

            PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query);
            preparedStatement.setString(1, drug.getName());
            preparedStatement.setFloat(2, drug.getPrice());
            preparedStatement.setInt(3, drug.getQuantity());
            preparedStatement.executeUpdate();

    }

    @Override
    public void remove(long id) throws SQLException {
        String query = """
                    delete from drugs
                    where id = ?
                """;

            PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();

    }



    @Override
    public Drug load(String name) throws SQLException {
        String query = """
                    select * from drugs
                    where name = ?
                """;

            PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (!resultSet.next())
                return null;
            return new Drug( resultSet.getString("name"),
                    resultSet.getDouble("price"), resultSet.getInt("quantity"));
        }

    @Override
    public void update(Drug drug) throws SQLException {
        String query = """
                    update drugs
                    set price = ?, count = ?
                    where id = ?
                """;

        PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query);
        preparedStatement.setFloat(1, drug.getPrice());
        preparedStatement.setInt(2, drug.getQuantity());

        preparedStatement.executeUpdate();
    }
}
