package br.com.creational.singleton.connectionPool.singleton.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	private static final ConnectionPool _singleton = new ConnectionPool();
	private final static int POOL_SIZE = 2;
	private List<Connection> _connectionsPool;

	private ConnectionPool() {
		System.out.println("Creating Connection Pool");
		_connectionsPool = new ArrayList<Connection>();
		for (int i = 0; i < POOL_SIZE; i++) {
			_connectionsPool.add(new Connection());
		}
	}

	public static ConnectionPool getInstance() {
		return _singleton;
	}

	public Connection getConnection() {
		Connection avaiable = null;
		for (Connection conn : _connectionsPool) {
			if (!conn.isInUse()) {
				avaiable = conn;
				break;
			}
		}
		if (avaiable == null) {
			System.out.println("No Connections avaiable");
			return null;
		}
		avaiable.setInUse(true);
		return avaiable;
	}

	public void leaveConnection(Connection conn) {
		conn.setInUse(false);
	}
}
