package com.shevlik.Topic9;

public enum BodyType {
    SEDAN("Sedan"),
    HATCHBACK("Hatchback"),
    WAGON("Wagon");
    private String name;
    BodyType(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    static int getSize(){
        BodyType[] bodyTypes=BodyType.values();
        return bodyTypes.length;
    }

    static BodyType getBodyType(String name){
        BodyType[] bodyTypes=BodyType.values();
        int count=0;
        int i;
        for (i=0;i<getSize();i++){
            if(name.equalsIgnoreCase(bodyTypes[i].getName())){
                count++;
                break;
            }
        }
        if(count==0){
            return null;
        }else {
            return bodyTypes[i];
        }
    }
    static BodyType getBodyType(int index){
        BodyType[] bodyTypes=BodyType.values();
        return bodyTypes[index];
    }
}
