package com.ChaseHQ.Statistician.Database.DataValues;

import com.ChaseHQ.Statistician.Config.Config;

public enum StatDBDataStores {
	CONFIGURATION ("config"),
	PLAYER ("players");
	
	private final String tableName;
	
	private StatDBDataStores(String tableName) {
		this.tableName = Config._databasePrefix + tableName;
	}
	
	public String getTableName() {
		return tableName;
	}
}
