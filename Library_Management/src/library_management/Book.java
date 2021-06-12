/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_management;

import java.util.ArrayList;
import static library_management.testUser.userList;

/**
 *
 * @author Zeynep
 */
public class Book {
    public String k_adi;
    public String k_yazar;
    public String k_tur;
    public int id;
    
     static ArrayList<Book> show_b = new ArrayList<Book>();
     
     static ArrayList<Book> borrowBook = new ArrayList<Book>();

    public Book(String k_adi, String k_yazar, String k_tur) {
        this.k_adi = k_adi;
        this.k_yazar = k_yazar;
        this.k_tur = k_tur;
        
    }

    public Book(String k_adi, String k_yazar, String k_tur, int id) {
        this.k_adi = k_adi;
        this.k_yazar = k_yazar;
        this.k_tur = k_tur;
        this.id = id;
    }

    public Book() {
    }
    
    
   

    public String getK_adi() {
        return k_adi;
    }

    public String getK_yazar() {
        return k_yazar;
    }

    public String getK_tur() {
        return k_tur;
    }

    public int getId() {
        return id;
    }
    
    
    
    public String Display() {
        return     k_adi + "  " + k_yazar + "  " + k_tur+" \n "  ;
    }
    
 static void addBook(Book newBook){
       show_b.add(newBook);
   }
    
  static Book searchBook(String name){
        for(Book b: show_b)
           
               if(b.getK_adi()==name)
               return b;
            
        return null;
    } 
   
 
static public ArrayList ListBooks()
     {
            ArrayList<Book> book = new ArrayList<>();
            
     Book b1 = new Book ("Denemeler" ,"Montagine","Essay");
     Book b2 = new Book ("Varolma Eğilimi" ," Emil Michel Cioran ","Philosophy");
     Book b3 = new Book ("İnsan Olmak" ,"Engin Geçtan","Psychology");
     Book b4 = new Book ("Soneler (İngilizce - Türkçe)" ,"William Shakespeare","Poem");
     Book b5 = new Book ("Robinson Crusoe" ,"Daniel Defoe","Novel");
     Book b6 = new Book ("Yeraltından Notlar" ,"Fyodor Mihayloviç Dostoyevski","Novel");
     Book b7 = new Book ("Çürümenin Kitabı" ," Emil Michel Cioran","Philosophy");
     Book b8 = new Book ("Kaçırdıklarımız" ,"Adam Philips","Essay");
     Book b9 = new Book ("Aferin" ,"Aziz Nesin","Story");
     Book b10 = new Book ("Üss-ı İnkılâp" ,"Ahmet Mithat Efendi","History");
     Book b11 = new Book ("Hayvan Mezarlığı" ,"Stephen King","Novel");
     Book b12 = new Book ("İçimizdeki Şeytan" ,"Sabahattin Ali","Novel");
     Book b13 = new Book ("Clarissa" ,"Stephen Zweig","Story");
     Book b14 = new Book ("Göçebe" ,"Stephenie Meyer","Novel");
     Book b15 = new Book ("Sineklerin Tanrısı" ,"William Golding","Novel");
     Book b16 = new Book ("Sevda Sözler" ,"Cemal Süreya","Poem");
     Book b17 = new Book ("İnsan Doğası" ,"Alfred Adler","Psychology");
     Book b18 = new Book ("Nutuk" ,"M.Kemal ATATÜRK","History");
     Book b19 = new Book ("Sokrates'in Savunması" ,"Platon","Philosophy");
     Book b20 = new Book ("Sisifos Söyleni" ,"Albert Camus","Essay");
     Book b21 = new Book ("İki Dirhem Bir Çekirdek" ,"İskender Pala","Essay");       
     Book b22 = new Book ("Orta Zekalılar Cenneti" ,"Zülfü Livaneli","Essay");
     Book b23 = new Book ("Kendine Ait Bir Oda" ,"Virginia Woolf","Essay");
     Book b24 = new Book ("Uygarlıkların Batışı" ,"Amin Maalouf","Essay");
     Book b25 = new Book ("Suya Yazılan" ,"Fazıl Say","Essay");
     
     book.add(b1);
     book.add(b2);
     book.add(b3);
     book.add(b4);
     book.add(b5);
     book.add(b6);
     book.add(b7);
     book.add(b8);
     book.add(b9);
     book.add(b10);
     book.add(b11);
     book.add(b12);
     book.add(b13);
     book.add(b14);
     book.add(b15);
     book.add(b16);
     book.add(b17);
     book.add(b18);
     book.add(b19);
     book.add(b20);
     book.add(b21);
     book.add(b22);
     book.add(b23);
     book.add(b24);
     book.add(b25);
     
     return book;
        }
}
