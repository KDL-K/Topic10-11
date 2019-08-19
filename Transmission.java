package com.shevlik.Topic9;

public enum Transmission {
    MECHANICAL("Mechanical"),
    AUTOMATIC("Automatic");
    private String name;

    Transmission(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    static int getSize(){
        Transmission[] transmissions=Transmission.values();
        return transmissions.length;
    }
    static Transmission getTransmission(String name){
        Transmission[] transmissions=Transmission.values();
        int count=0;
        int i;
        for (i=0;i<getSize();i++){
            if(name.equalsIgnoreCase(transmissions[i].getName())){
                count++;
                break;
            }
        }
        if(count==0){
            return null;
        }else {
            return transmissions[i];
        }
    }
    static Transmission getTransmission(int index){
        Transmission[] transmissions=Transmission.values();
        return transmissions[index];
    }
}
