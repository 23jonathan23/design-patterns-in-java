package br.com.creational.factory.app.dbadapter.factory;

import br.com.creational.factory.app.dbadapter.db.DB;

public interface DBFactory {
	DB getDatabase();
}
