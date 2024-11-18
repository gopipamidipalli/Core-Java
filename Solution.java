
//import java.util.*;
import java.util.Scanner;

//Encapsulation.
//getters and setters.
//constacter.
//static and this keyword.
    

class Laptop {
    private int  laptopid;
    private String brand;
    private String ostype;
    private double price;
    private int rating;

public Laptop(int laptopid, String brand, String ostype, double price, int rating) {
        this.laptopid = laptopid;
        this.brand = brand;
        this.ostype = ostype;
        this.price = price;
        this.rating = rating;
    }

public int getLaptopid() {
    return laptopid;
}

public void setLaptopid(int laptopid) {
    this.laptopid = laptopid;
}

public String getBrand() {
    return brand;
}

public void setBrand(String brand) {
    this.brand = brand;
}

public String getOstype() {
    return ostype;
}

public void setOstype(String ostype) {
    this.ostype = ostype;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

public int getRating() {
    return rating;
}

public void setRating(int rating) {
    this.rating = rating;
}
}


public class Solution{
    static int  countOfLaptopByBrand(Laptop[] laptops, String brand){
        int count =0;
        for(Laptop laptop :laptops){
            if(laptop.getBrand().equalsIgnoreCase(brand))
              count++;
        }
          return count;
    }
    static Laptop[] searchLaptopByOsType(Laptop[] laptops, String os){
            Laptop[] arr1 = null ;
            int count=0;
            for(Laptop laptop :laptops){
                if(laptop.getOstype().equalsIgnoreCase(os) && laptop.getRating()>3)
                    count++;
            }
            int count1=0;
            arr1 = new Laptop[count];
            for(Laptop laptop : laptops){
                if(laptop.getOstype().equalsIgnoreCase(os) && laptop.getRating()>3){
                    arr1[count1]=laptop;
                    count1++;
                }
            }
            return arr1;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the laptop details :-");
        Laptop[] laptops = new Laptop[4];
         for(int i=0;i<4;i++){
              int id =sc.nextInt();
              sc.nextLine();
              String brand = sc.nextLine();
              String os = sc.nextLine();
              double price = sc.nextDouble();
              //sc.nextLine();
              int rat = sc.nextInt();  
                laptops[i]=new Laptop(id, brand, os, price, rat);    
                 System.out.println("laptop details: "+laptops[i]);
        }
              
           String brand1 =sc.nextLine();
           String os1 = sc.nextLine();

         System.out.println(Solution.countOfLaptopByBrand(laptops, brand1));
         System.out.println(Solution.searchLaptopByOsType(laptops, os1));
           
    }

}

