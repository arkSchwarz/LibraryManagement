
package library_management;

import java.util.ArrayList;

public class testUser {
    static ArrayList<User> userList = new ArrayList<>();


    
    static void addUser(User newUser){
       userList.add(newUser);
   }
    
    static void deleteUser(User oldUser){
       userList.remove(oldUser);
   }
    
    
    static User searchUser(int ID){
        for(User o: userList)
           
               if(o.getID() ==ID)
               return o;
            
        return null;
    }  

    static int findUser(int ID, String password){
        for(User o: userList){
               if(o.getID()== ID && o.getPassword().equals(password))
               return 1;
            }
        return -1;
    }
    
    
    
    
    
   
}
