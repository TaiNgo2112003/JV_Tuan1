/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Vehicle {
    protected  String tenChuXe;
    protected String loaiXe;
    protected int dungTich;
    protected double triGia;
    public double Thue(){
       
        if(dungTich<100){
            return triGia *0.01;
        }
        if(dungTich <200)
            return triGia * 0.03;
        else
            return triGia * 0.5;
      
    }
    
    public static Scanner scn = new Scanner((System.in));
    public void Nhap(){
        System.out.println("Nhap Ten Chu Xe: ");
        tenChuXe = scn.nextLine();
        System.out.println("Nhap Loai Xe: ");
        loaiXe = scn.nextLine();
        System.out.println("Nhập Dung Tích: ");
        dungTich = scn.nextInt();
        System.out.println("Nhap Gia Trị Xe: ");
        triGia = scn.nextFloat();
    }

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, float triGia) {
        
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }
    public  Vehicle(){
        this.tenChuXe="";
       this.loaiXe="";
       this.dungTich=0;
       this.triGia = 0.0f;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(float triGia) {
        this.triGia = triGia;
    }

    public static Scanner getScn() {
        return scn;
    }

    public static void setScn(Scanner scn) {
        Vehicle.scn = scn;
    }   
}
