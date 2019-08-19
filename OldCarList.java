package com.shevlik.Topic9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class OldCarList implements VehicleList{
    private ArrayList<CarOld> carList=new ArrayList<CarOld>();

    public OldCarList(){}
    public OldCarList(CarOld... carList){
        setCarList(carList);
    }

    public ArrayList<CarOld> getCarList() {
        return carList;
    }

    public void setCarList(CarOld[] carList) {
        int sizeCarList=carList.length;
        for (int i=0;i<sizeCarList;i++){
            this.carList.add(carList[i]);
        }
    }
    public void showCarList(){
        int sizeCarList=carList.size();
        for(int i=0;i<sizeCarList;i++){
            System.out.println(carList.get(i).toString());
        }
    }

    public void addToCarList(CarOld carOld){
        this.carList.add(carOld);
    }

    public void addToCarList(){
        Scanner in=new Scanner(System.in);
        System.out.println("Addition of the new car in the database:");
        System.out.print("Brand: ");
        String brandStr=in.nextLine();
        System.out.print("Model: ");
        String model=in.nextLine();
        System.out.print("Engine type: ");
        String engineStr=in.nextLine();
        System.out.print("Transmission: ");
        String transmissionStr=in.nextLine();
        System.out.print("Colour: ");
        String colourStr=in.nextLine();
        System.out.print("Body type: ");
        String bodyTypeStr=in.nextLine();
        System.out.print("Price: ");
        long price=in.nextLong();
        System.out.print("Year: ");
        int year=in.nextInt();
        System.out.print("Mileage: ");
        int mileage=in.nextInt();
        CarOld carOld=new CarOld(brandStr, model, engineStr, transmissionStr, colourStr, bodyTypeStr, price, year, mileage);
        carList.add(carOld);
    }
    public void showCarByBrand(String brand){
        carList.stream().filter(p->p.getBrand().getName().equalsIgnoreCase(brand)).forEach(p->System.out.println(p));
        /*int sizeCarList=carList.size();
        for(int i=0;i<sizeCarList;i++){
            if(carList.get(i).getBrand().getName().equalsIgnoreCase(brand)){
                System.out.println(carList.get(i).toString());
            }
        }*/
    }
    public void showCarByEngine(String engine){
        carList.stream().filter(p->p.getEngine().getName().equalsIgnoreCase(engine)).forEach(p->System.out.println(p));
        /*int sizeCarList=carList.size();
        for(int i=0;i<sizeCarList;i++){
            if(carList.get(i).getEngine().getName().equalsIgnoreCase(engine)){
                System.out.println(carList.get(i).toString());
            }
        }*/
    }
    public void showCarByTransmission(String transmission){
        carList.stream().filter(p->p.getTransmission().getName().equalsIgnoreCase(transmission))
                .forEach(p->System.out.println(p));
        /*int sizeCarList=carList.size();
        for(int i=0;i<sizeCarList;i++){
            if(carList.get(i).getTransmission().getName().equalsIgnoreCase(transmission)){
                System.out.println(carList.get(i).toString());
            }
        }*/
    }
    public void showCarById(int id) throws CarException{
        long count=carList.stream().filter(p->p.getId()==id).count();
        if(count>0){
            carList.stream().filter(p->p.getId()==id).forEach(p->System.out.println(p));
        } else throw new CarException("ID "+id+" is not found.");
        /*int sizeCarList=carList.size();
        int count=0;
        for(int i=0;i<sizeCarList;i++){
            if(carList.get(i).getId()==id){
                System.out.println(carList.get(i).toString());
                count++;
                break;
            }
        }
        if(count==0) throw new CarException("ID "+id+" is not found.");*/
    }
    public void deleteCarById(int id){
        int sizeCarList=carList.size();
        for(int i=0;i<sizeCarList;i++){
            if(carList.get(i).getId()==id){
                carList.remove(carList.get(i));
                System.out.println("Car "+id+" has been deleted");
                break;
            }
        }
    }

    public int toCount(String name, Predicate<CarOld> count){
        return (int) carList.stream().filter(count).count();
    }

    /*public int toCount(String name, String enumName) {
        if(enumName.equalsIgnoreCase("brand")){
            return (int)carList.stream().filter(p->p.getBrand().getName().equalsIgnoreCase(name)).count();
        }
        if(enumName.equalsIgnoreCase("engine")){
            return (int)carList.stream().filter(p->p.getEngine().getName().equalsIgnoreCase(name)).count();
        }
        if(enumName.equalsIgnoreCase("transmission")) {
            return (int) carList.stream().filter(p -> p.getTransmission().getName().equalsIgnoreCase(name)).count();
        } else return 0;
    }*/
}
