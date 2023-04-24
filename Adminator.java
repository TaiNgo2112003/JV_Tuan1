/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan_1;

import java.util.ArrayList;
import javax.accessibility.AccessibleRole;

/**
 *
 * @author Admin
 */
public class Adminator {
    public ArrayList<Vehicle> listVehicles = new ArrayList<>();
    Vehicle vehicle = new Vehicle();
    public void add (Vehicle vehicle){
        this.listVehicles.add(vehicle);
    }
    public    void menu(){
        while (true) {            
             System.out.println("1. Nhập Thông Tin Xe: ");
        System.out.println("2. Xuat Thông Tin Xe :");
        System.out.println("3. Thoát");
        menu(input.inputInt("Nhap lua chon: "));
        }
    }
    public  void menu(int choice){
     switch(choice){
         case 1: 
            vehicle.Nhap();
            break;
            case 2:
                System.out.println("Giá Trị Xe Là: "+ input.toVND(vehicle.triGia));
                System.out.println("Thuế trc bạ của xe là: " + input.toVND(vehicle.Thue()));
                
                case 3: 
                    System.exit(0);
     }   
    }
}
