package br.com.creational.factory.app.dbadapter;

import br.com.creational.factory.app.dbadapter.db.DB;
import br.com.creational.factory.app.dbadapter.factory.DBFactory;

public class Client {

	public static void main(String[] args) {
		DB db = DBFactory.getDatabase("postgres");
		db.query("SELECT * FROM STARWARS");
		db.update("INSERT INTO guardian VALUES ('Hitman', 25)");
	}
}
