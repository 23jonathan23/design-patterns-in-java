package br.com.creational.factory.app.dbadapter.factory;

import br.com.creational.factory.app.dbadapter.db.DB;
import br.com.creational.factory.app.dbadapter.db.OracleDB;
import br.com.creational.factory.app.dbadapter.db.PostgresDB;

public abstract class DBFactory {
    public static DB getDatabase(String type) {
        if ("postgres".equals(type)) {
            return new PostgresDB();
        }

        return new OracleDB();
    }
}
