package com.shevlik.Topic9;

public enum Brand {
    TOYOTA("Toyota", "Corolla","Rav4","Camry","Land Cruiser", "Highlander"),
    MAZDA("Mazda","3","6","CX-5","CX-9"),
    HONDA("Honda","Accord", "CR-V","Pilot"),
    AUDI("Audi", "A4", "A6","Q3","Q5","Q7"),
    BMW("BMW", "3","5","7","X5","X6"),
    MERCEDES("Mercedes", "CLA","CLS"),
    VOLKSWAGEN("Volkswagen","Passat","Polo","Tiguan"),
    OPEL("Opel","Insignia","Mokka","Astra"),
    CITROEN("Citroen","C4","C3"),
    RENAULT("Renault","Logan","Megan", "Duster"),
    KIA("KIA","Ceed","Sportage","Rio"),
    HYUNDAI("Hyundai","Accent","Creta","Tucson");
    private String name;
    private String[] model;
    Brand(String name, String...model){
        this.name=name;
        setModel(model);
    }

    public String getName() {
        return name;
    }
    public void setModel(String[] model){
        int sizeModel=model.length;
        this.model=new String[sizeModel];
        for(int i=0;i<sizeModel;i++){
            this.model[i]=model[i];
        }
    }
    public String[] getModel() {
        return model;
    }

    static int getSizeModel(int brandIndex){
        Brand brand=getBrand(brandIndex);
        return brand.model.length;
    }

    static int getSize(){
        Brand[] brands=Brand.values();
        return brands.length;
    }

    static Brand getBrand(String name){
        Brand[] brands=Brand.values();
        int count=0;
        int i;
        for (i=0;i<getSize();i++){
            if(name.equalsIgnoreCase(brands[i].getName())){
                count++;
                break;
            }
        }
        if(count==0){
            return null;
        }else {
            return brands[i];
        }
    }
    static Brand getBrand(int index){
        Brand[] brands=Brand.values();
        return brands[index];
    }

    static String getModel(int brandIndex,int modelIndex){
        Brand brand=getBrand(brandIndex);
        return brand.model[modelIndex];
    }
}