/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_management;




public abstract class User{


     private String name;
     private String surname;
     private String password;
     private String paketIsmi;
     private int iadeZaman;
     private int kitapCount;
     private int maxKitapCount;
     private int bonusPoint;
     private int ID;

    
    
    private int hikayeCount=0;
    private int romanCount=0;
    private int siirCount=0;
    private int denemeCount=0;
    private int felsefeCount=0;
    private int tarihCount=0;
    private int psikolojiCount=0;
    
    /*
    Hikaye Roman Şiir Deneme Felsefe Tarih Psikoloji
    
    */
    
    
    
    public void setName(String name) {
        this.name = name;
    } 

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void setBonusPoint(int maxSaat) {
        this.bonusPoint = maxSaat;
    }
    
    public void setIadeZaman(int iadeZaman) {
        this.iadeZaman = iadeZaman;
    }

    public void increaseKitapCount() {
        this.kitapCount++;
    }
    
     public void decreaseKitapCount() {
        this.kitapCount--;
    }


    public void setMaxKitapCount(int maxKitapCount) {
        this.maxKitapCount = maxKitapCount;
    }

    public void setPaketIsmi(String paketIsmi) {
        this.paketIsmi = paketIsmi;
    }
    
    
    
    
    public void setHikayeCount() {
        this.hikayeCount++;
    }

    public void setRomanCount() {
        this.romanCount++;
    }

    public void setSiirCount() {
        this.siirCount++;
    }

    public void setDenemeCount() {
        this.denemeCount++;
    }  

    public void setFelsefeCount() {
        this.felsefeCount++;
    }  

    public void setTarihCount() {
        this.tarihCount++;
    } 

    public void setPsikolojiCount() {
        this.psikolojiCount++;
    }
    
    
    
    
    
    public int getHikayeCount() {
        return hikayeCount;
    }
    
    public int getRomanCount() {
        return romanCount;
    }
    
    public int getSiirCount() {
        return siirCount;
    }
    
    public int getDenemeCount() {
        return denemeCount;
    }
    
    public int getFelsefeCount() {
        return felsefeCount;
    }
    
    public int getTarihCount() {
        return tarihCount;
    }
    
    
    public int getPsikolojiCount() {
        return psikolojiCount;
    }
    
    
        
    public String getName() {
        return name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public String getPassword() {
        return password;
    }
    
    public int getID() {
        return ID;
    }
    
    public String getPaketIsmi() {
        return paketIsmi;
    }

    public int getIadeZaman() {
        return iadeZaman;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public int getKitapCount() {
        return kitapCount;
    }

    public int getMaxKitapCount() {
        return maxKitapCount;
    }
    
    
     /*
    Hikaye Roman Şiir Deneme Felsefe Tarih Psikoloji
    
    */
    
    
    public String toString(User p){
        String res = "";

        res += "\n"+"Name: " + p.name +"Surname: "+p.surname+"\n";
        res += "\n"+"ID: " + p.ID + "\n";
        res += "\n"+"Package Name: " + p.paketIsmi + "\n";
        res += "\n"+"Number of borrowing book: " + p.kitapCount + "\n";
        res += "\n"+"Return Time: " + p.iadeZaman +" Gün"+"\n";
        res += "\n"+"Bonus Points: "+ p.bonusPoint +"\n";
                

        return res;
    }

}





class Platinum extends User{
    Platinum(String newName,String newSurname,int newID, String newPassword){
        this.setName(newName);
        this.setSurname(newSurname);
        this.setPassword(newPassword);
        this.setPaketIsmi("Platinum");
        this.setIadeZaman(50); 
        this.setMaxKitapCount(20);
        this.setBonusPoint(20);
        this.setID(newID);
    }
}

class Gold extends User{
    Gold(String newName,String newSurname,int newID, String newPassword){
        this.setName(newName);
        this.setSurname(newSurname);
        this.setPassword(newPassword);
        this.setPaketIsmi("Gold");
        this.setIadeZaman(30); 
        this.setMaxKitapCount(15);
        this.setBonusPoint(15);
        this.setID(newID);
    }
}


class Silver extends User{
    Silver(String newName,String newSurname,int newID,String newPassword){
        this.setName(newName);
        this.setSurname(newSurname);
        this.setPassword(newPassword);
        this.setPaketIsmi("Silver");
        this.setIadeZaman(20); 
        this.setMaxKitapCount(10);
        this.setBonusPoint(10);
        this.setID(newID);
    }
}

class Standart extends User{
    Standart(String newName,String newSurname,int newID,String newPassword){
        this.setName(newName);
        this.setSurname(newSurname);
        this.setPassword(newPassword);
        this.setPaketIsmi("Standart");
        this.setIadeZaman(10); 
        this.setMaxKitapCount(5);
        this.setBonusPoint(5);
        this.setID(newID);
    }
}

 
    
    

