package project.SmartInventory;
import java.util.HashMap;
import java.util.Scanner;

public class SmartInventory {

    Scanner sc= new Scanner(System.in);


    static HashMap<Integer,SmartInventoryModel> inventoryData=new HashMap<>();

    public static Integer checkInventoryData(){
        return inventoryData.size();
    }
    public void addItem() {
        Integer productId;
        SmartInventoryModel item = new SmartInventoryModel();

        while(true){
            try{
                System.out.println("Enter Product ID:");
                productId = sc.nextInt();
                if(inventoryData.containsKey(productId)){
                    System.out.println("Product ID already exists");
                    continue;
                }
                SmartInventoryModel.validateInput(productId);
                break;

            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        sc.nextLine(); // clear buffer

        while(true){
            try{
                System.out.println("Enter Item Name:");
                String name = sc.nextLine();
                SmartInventoryModel.validateInput(name);

                item.setItemName(name);
                break;

            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        while(true){
            try{
                System.out.println("Enter Price:");
                Double price = sc.nextDouble();
                SmartInventoryModel.validateInput(price);

                item.setPrice(price);
                break;

            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        while(true){
            try{
                System.out.println("Enter Order Count:");
                Integer count = sc.nextInt();
                SmartInventoryModel.validateInput(count);

                item.setOrderCount(count);
                break;

            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        inventoryData.put(productId, item);

        System.out.println("Item added successfully!");
    }

    public boolean updateItem(Integer productId){

        if(inventoryData.containsKey(productId)){

            SmartInventoryModel item = inventoryData.get(productId);

            System.out.println("Item name : " + item.getItemName());
            System.out.println("Item price : " + item.getPrice());
            System.out.println("Item quantity : " + item.getOrderCount());

            Boolean updateFlag = false;

            System.out.println("Update name? (true/false)");
            updateFlag = sc.nextBoolean();
            sc.nextLine();

            if(updateFlag){
                while(true){
                    try{
                        System.out.println("Enter Item Name:");
                        String name = sc.nextLine();

                        SmartInventoryModel.validateInput(name);
                        item.setItemName(name);
                        break;

                    }catch(IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                }
            }

            System.out.println("Update Price? (true/false)");
            updateFlag = sc.nextBoolean();

            if(updateFlag){
                while(true){
                    try{
                        System.out.println("Enter Price:");
                        Double price = sc.nextDouble();

                        SmartInventoryModel.validateInput(price);
                        item.setPrice(price);
                        break;

                    }catch(IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                }
            }

            System.out.println("Update OrderCount? (true/false)");
            updateFlag = sc.nextBoolean();

            if(updateFlag){
                while(true){
                    try{
                        System.out.println("Enter Order Count:");
                        Integer count = sc.nextInt();

                        SmartInventoryModel.validateInput(count);
                        item.setOrderCount(count);
                        break;

                    }catch(IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                }
            }

            System.out.println("Item updated successfully");
            return true;

        }else{
            System.out.println("Product not found");
            return false;
        }
    }

    public static void checkInventoryProductCountList(){
        for(HashMap.Entry<Integer, SmartInventoryModel> entry : inventoryData.entrySet()){

            Integer key = entry.getKey();
            SmartInventoryModel item = entry.getValue();

            System.out.println("Product ID: " + key);
            System.out.println("Item Name: " + item.getItemName());
            System.out.println("Price: " + item.getPrice());
        }
    }
}
