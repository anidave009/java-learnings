package project;
import project.LooseCoupling.CreditCardPayment;
import project.LooseCoupling.Order;
import project.LooseCoupling.Payment;
import project.SmartInventory.SmartInventory;

import java.util.Scanner;

    public class ProjectMain {
        public static void main(String[] args) {
    Payment payment=new CreditCardPayment();
    Order order=new Order(payment);
            order.placeOrder(500);
            Integer option;
    Scanner sc = new Scanner(System.in);
    SmartInventory smartInventory = new SmartInventory();
            while (true) {
                    System.out.println("Welcome to Smart Inventory Tracking System");
                if (smartInventory.checkInventoryData() < 1) {
            System.out.println("Inventory is Empty ,Please Add a new item to the inventory");
                    smartInventory.addItem();
                }
                        System.out.println("Enter 1 : To Add new item, Enter 2 : To Update item ,Enter 3 : See Entire inventory List(ProductCount<3), Enter 4: Exit");
    option = sc.nextInt();
                switch (option) {
            case 1:
            smartInventory.addItem();
                        break;
                                case 2:
                                System.out.println("You choose to update the item ,Enter Product Id to Update : ");
    Integer productId = sc.nextInt();
    Boolean itemPresent = smartInventory.updateItem(productId);
                        if (itemPresent) System.out.println("ProductId : " + productId + "Updated Succesfully");
                        else System.out.println(productId + " Not Found");
                        break;
                                case 3:
                                smartInventory.checkInventoryProductCountList();
                        break;
                                case 4:
                                break;
    default:
            System.out.println("Enter from the options : (1,2,3,4) ");
                        break;
                                }
                                System.out.println("ThankYou !");
            }
        }
    //    Payment payment=new CreditCardPayment();
    //    Order order=new Order(payment);
    //        order.placeOrder(500);

    }
