/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TestPackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author Saksham
 */
public class Main {
     
     public static void main(String[] args) {
          
          try {
               
               File file = new File("C:\\Users\\lenovo\\Desktop\\abc.jpg");
               
               
               String s = "upi://pay?pa=9575445545@paytm&pn=PaytmUser&mc=0000&mode=02&purpose=00&orgid=159761&cust=409472122";
               
               
               ByteArrayOutputStream out = QRCode.from(s).to(ImageType.JPG).stream();
               
               
               FileOutputStream fos = new FileOutputStream(file);
               
               fos.write(out.toByteArray());
               
               fos.close();
               System.out.println("success");
               
               
               
               
          } catch (Exception e) {
               e.printStackTrace();
          
          }
          
     }
     
}
