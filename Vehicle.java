public class Vehicle{
    String name;
    int model;
    int price;
    Vehicle(String name,int model,int price)
    
    {
        this.name=name;
        this.model=model;
        this.price=price;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setModel(int m){
        model=m;
    }
    public int getModel(){
        return model;
    }
    public void setPrice(int o){
        price=o;
    }
    public int getPrice(){
        return price;
    }
    void Display(){
System.out.println("Vehical name: "+name+"   Model "+model+"  Price: "+price);

    }
    public static void main(String[] args) {
      
        System.out.println("Car:");                    //Car
        Vehicle v=new Vehicle("Honda",2019,75000);
       
        v.Display();
        System.out.println("Bike:");//Bike
        Vehicle b=new Vehicle("Royal Enfield",2020,175000);
       
        b.Display();
        System.out.println("trek:");                        //Trek
        Vehicle t=new Vehicle("Tata",2021,1475000);
       
        t.Display();



    }

    
}
