package com.shevlik.Topic9;

public class CarOld extends Vehicle {
    private int year;// год выпуска
    private int mileage;//пробег, км
    CarOld(){
        super();
    }
    CarOld(Brand brand, String model, Engine engine,
           Transmission transmission, Colour colour, BodyType bodyType, long price, int year, int mileage){
        super(brand, model, engine, transmission, colour, bodyType, price);
        this.year=year;
        this.mileage=mileage;
    }

    CarOld(String brandStr, String model, String engineStr, String transmissionStr,
           String colourStr, String bodyTypeStr, long price, int year, int mileage){
        super(brandStr, model, engineStr, transmissionStr, colourStr, bodyTypeStr, price);
        this.year=year;
        this.mileage=mileage;
    }

    CarOld(CarOld carOld){
        this.setBrand(carOld.getBrand());
        this.setModel(carOld.getModel());
        this.setEngine(carOld.getEngine());
        this.setColour(carOld.getColour());
        this.setBodyType(carOld.getBodyType());
        this.setPrice(carOld.getPrice());
        this.setYear(carOld.getYear());
        this.setMileage(carOld.getMileage());
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public static CarOld getCarOld(){
        int brandIndex=(int)((Math.random()*20)%(Brand.getSize()));
        int modelIndex=(int)((Math.random()*10)%(Brand.getSizeModel(brandIndex)));
        int engineIndex=(int)((Math.random()*10)%(Engine.getSize()));
        int transmissionIndex=(int)((Math.random()*10)%(Transmission.getSize()));
        int colourIndex=(int)((Math.random()*20)%(Colour.getSize()));
        int bodyTypeIndex=(int)((Math.random()*10)%(BodyType.getSize()));
        long price=((long)(Math.random()*100000))%25000+10000l;
        int year=(int)(Math.random()*12+2006);
        int mileage=((int)(Math.random()*2000000))%170000;
        return new CarOld(Brand.getBrand(brandIndex), Brand.getModel(brandIndex,modelIndex), Engine.getEngine(engineIndex),
                Transmission.getTransmission(transmissionIndex), Colour.getColour(colourIndex),
                BodyType.getBodyType(bodyTypeIndex), price, year, mileage);
    }

    @Override
    public String toString() {
        return "Old car: " +super.toString()
                +" Mileage="+getMileage()+" km"
                +", Year of manufacture="+getYear();
    }
}
