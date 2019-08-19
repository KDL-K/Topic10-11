package com.shevlik.Topic9;

public class Vehicle{
    private int id;
    private static int idMake=0;
    private Brand brand;
    private String model;
    private Engine engine;
    private Transmission transmission;
    private Colour colour;
    private BodyType bodyType;
    private long price;

    public Vehicle(){}
    public Vehicle(String brandStr, String model, String engineStr, String transmissionStr,
                   String colourStr, String bodyTypeStr, long price){
        setId();
        setBrand(brandStr);
        setModel(model);
        setEngine(engineStr);
        setTransmission(transmissionStr);
        setColour(colourStr);
        setBodyType(bodyTypeStr);
        this.price=price;

    }
    public Vehicle(Brand brand, String model, Engine engine, Transmission transmission,
                   Colour colour, BodyType bodyType, long price){
        setId();
        this.brand=brand;
        setModel(model);
        this.engine=engine;
        this.transmission=transmission;
        this.colour=colour;
        this.bodyType=bodyType;
        this.price=price;
    }


    public int getId(){
        return id;
    }

    public void setId(){
        id=++idMake;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setBrand(String brandStr) {
        brand=Brand.getBrand(brandStr);
        if(brand==null){
            System.out.println("Incorrect brand: "+ brandStr+" (id "+id+").");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        int sizeM=brand.getModel().length;
        int count=0;
        for (int i=0;i<sizeM;i++){
            if(model.equalsIgnoreCase(brand.getModel()[i])){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Incorrect model: "+ model+" (id "+id+").");
            this.model="incorrect "+model;
        }else {
            this.model = model;
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(String engineStr) {
        engine=Engine.getEngine(engineStr);
        if(engine==null){
            System.out.println("Incorrect engine type: "+ engineStr+" (id "+id+").");
        }
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setTransmission(String transmissionStr) {
        transmission=Transmission.getTransmission(transmissionStr);
        if(transmission==null){
            System.out.println("Incorrect transmission type: "+ transmissionStr+" (id "+id+").");
        }
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void setColour(String colourStr) {
        colour=Colour.getColour(colourStr);
        if(colour==null){
            System.out.println("Incorrect colour: "+ colourStr+" (id "+id+").");
        }
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public void setBodyType(String bodyTypeStr) {
        bodyType=BodyType.getBodyType(bodyTypeStr);
        if(bodyType==null){
            System.out.println("Incorrect body type: "+ bodyTypeStr+" (id "+id+").");
        }
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "id "+id+", "+
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", engine=" + engine.getName() +
                ", transmission=" + transmission.getName() +
                ", colour=" + colour.getName() +
                ", bodyType=" + bodyType.getName() +
                ", price=" + price +"$ "+
                '}';
    }
}
