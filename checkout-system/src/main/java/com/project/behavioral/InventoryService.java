package com.project.behavioral;

public class InventoryService implements OrderPlacedObserver{
  @Override
  public void onOrderPlaced(String orderId){
    System.out.println("[InventoryService] Updating Inventory for order: " + orderId);
  }
}
