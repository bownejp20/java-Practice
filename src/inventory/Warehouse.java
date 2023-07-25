package inventory;

public class Warehouse{
    int warehouseId;
    String warehouseName;
    String inventories;
    public Warehouse(int warehouseId, String warehouseName, String inventories){
        this.warehouseId = warehouseId;
        this.warehouseName = warehouseName;
        this.inventories = inventories;
    }
    public int getWarehouseId(){
        return this.warehouseId;
    }
    public void setWarehouseId(int warehouseId){
        this.warehouseId = warehouseId;
    }
    public String getWarehouseName(){
        return this.warehouseName;
    }
    public void setWarehouseName(String warehouseName){
        this.warehouseName = warehouseName;
    }
    public String getInventories(){
        return this.inventories;
    }
    public void setInventories(String inventories){
        this.inventories = inventories;
    }

}
