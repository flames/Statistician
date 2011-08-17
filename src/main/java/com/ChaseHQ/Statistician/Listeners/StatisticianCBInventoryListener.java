package com.ChaseHQ.Statistician.Listeners;

import org.getspout.spoutapi.event.inventory.*;

import com.ChaseHQ.Statistician.EventDataHandlers.EDHPlayer;

public class StatisticianCBInventoryListener extends InventoryListener {
	
	private EDHPlayer edhPlayer;
	
	public StatisticianCBInventoryListener(EDHPlayer passedEDH) {
		edhPlayer = passedEDH;
	}
	
	@Override
	public void onInventoryCraft(InventoryCraftEvent event) {
		
	}
}


