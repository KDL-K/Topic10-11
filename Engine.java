package com.shevlik.Topic9;

public enum Engine {
    BENZINE("Benzine"),
    DIESEL("Diesel"),
    ELECTRO("Electrocar");
    private String name;
    Engine(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    static int getSize(){
        Engine[] engines=Engine.values();
        return engines.length;
    }

    static Engine getEngine(String name){
        Engine[] engines=Engine.values();
        int count=0;
        int i;
        for (i=0;i<getSize();i++){
            if(name.equalsIgnoreCase(engines[i].getName())){
                count++;
                break;
            }
        }
        if(count==0){
            return null;
        }else {
            return engines[i];
        }
    }
    static Engine getEngine(int index){
        Engine[] engines=Engine.values();
        return engines[index];
    }
}
