/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan_1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class input {
    public  static Scanner scn = new  Scanner(System.in);
     public static  int inputInt(String content){
    int result = 0;
        System.out.println(content);
        result= scn.nextInt();
        return result;
    }
      public static Double inputDouble(String content){
       Double result =0.0;
       System.out.println(content);
       result = scn.nextDouble();
       return result;
   }
    public static float inputFloat(String content)
        {
            float result = 0;
            System.out.println(content);
            result = scn.nextFloat();
            return  result;
        }
         public static  String inputSting(String content){
          String result ="";
             System.out.println(content);
             result = scn.nextLine();
             result = scn.nextLine();
             return result;
         }
          public static  String toVND(Double money)
            {
                DecimalFormat formatter = new DecimalFormat("###,###,###");
                String result ="";
                result=formatter.format(money);
                return  result;
            }
}
