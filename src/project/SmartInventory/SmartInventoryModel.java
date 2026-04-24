package project.SmartInventory;

public class SmartInventoryModel {
    private double price;
    private String itemName;
    private Integer orderCount;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public static <T> void validateInput(T input){

        if(input instanceof Integer){
            Integer value = (Integer) input;

            if(value < 0){
                throw new IllegalArgumentException("ProductId/OrderCount cannot be negative");
            }
        }

        if(input instanceof Double){
            Double value = (Double) input;

            if(value < 0){
                throw new IllegalArgumentException("Price cannot be negative");
            }
        }

        if(input instanceof String){
            String value = (String) input;

            if(value.trim().isEmpty()){
                throw new IllegalArgumentException("String cannot be empty");
            }
        }

    }
}
