/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_management;

import static library_management.testUser.userList;


public class Package {
     static void changePackageToSilver(int ID){
        
        for(User o: userList){
               if(o.getID() == ID) 
               o.setPaketIsmi("Silver");
               o.setIadeZaman(20); 
               o.setMaxKitapCount(10);
               o.setBonusPoint(10);    
            }
        
   }
    
    static void changePackageToGold(int ID){
        
        for(User o: userList){
                o.setPaketIsmi("Gold");
                o.setIadeZaman(30); 
                o.setMaxKitapCount(15);
                o.setBonusPoint(15);
            }
        
   }
    
    static void changePackageToPlatin(int ID){
        
        for(User o: userList){
                o.setPaketIsmi("Platinum");
                o.setIadeZaman(50); 
                o.setMaxKitapCount(20);
                o.setBonusPoint(20); 
            }
        
   }
    
    static void changePackageToStandart(int ID){
        
        for(User o: userList){
               if(o.getID() == ID)
                o.setPaketIsmi("Standart");
                o.setIadeZaman(10); 
                o.setMaxKitapCount(5);
                o.setBonusPoint(5);
               
            }
        
   }

    
}
