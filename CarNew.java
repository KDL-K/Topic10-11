package com.shevlik.Topic9;

public class CarNew extends Vehicle {
    CarNew(){
        super();
    }
    CarNew(Brand brand, String model, Engine engine,
           Transmission transmission, Colour colour, BodyType bodyType, long price){
        super(brand, model, engine, transmission, colour, bodyType, price);
    }

    CarNew(String brandStr, String model, String engineStr, String transmissionStr,
           String colourStr, String bodyTypeStr, long price){
        super(brandStr, model, engineStr, transmissionStr, colourStr, bodyTypeStr, price);
    }

    CarNew(CarNew carNew){
        this.setBrand(carNew.getBrand());
        this.setModel(carNew.getModel());
        this.setEngine(carNew.getEngine());
        this.setColour(carNew.getColour());
        this.setBodyType(carNew.getBodyType());
        this.setPrice(carNew.getPrice());
    }

    public static CarNew getCarNew(){
        int brandIndex=(int)((Math.random()*20)%(Brand.getSize()));
        int modelIndex=(int)((Math.random()*10)%(Brand.getSizeModel(brandIndex)));
        int engineIndex=(int)((Math.random()*10)%(Engine.getSize()));
        int transmissionIndex=(int)((Math.random()*10)%(Transmission.getSize()));
        int colourIndex=(int)((Math.random()*20)%(Colour.getSize()));
        int bodyTypeIndex=(int)((Math.random()*10)%(BodyType.getSize()));
        long price=((long)(Math.random()*100000))%25000+10000l;
        return new CarNew(Brand.getBrand(brandIndex), Brand.getModel(brandIndex,modelIndex), Engine.getEngine(engineIndex),
                Transmission.getTransmission(transmissionIndex), Colour.getColour(colourIndex),
                BodyType.getBodyType(bodyTypeIndex), price);
    }

    @Override
    public String toString() {
        return "New car: " + super.toString();
    }
}
