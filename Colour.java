package com.shevlik.Topic9;

public enum Colour {
    RED("Red"),
    BLACK("Black"),
    WHITE("White"),
    BLUE("Blue"),
    DARK_BLUE("Dark blue"),
    YELLOW("Yellow"),
    GREEN("Green"),
    SILVER("Silver");
    private String name;
    Colour(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    static int getSize(){
        Colour[] colours=Colour.values();
        return colours.length;
    }

    static Colour getColour(String name){
        Colour[] colours=Colour.values();
        int count=0;
        int i;
        for (i=0;i<getSize();i++){
            if(name.equalsIgnoreCase(colours[i].getName())){
                count++;
                break;
            }
        }
        if(count==0){
            return null;
        }else {
            return colours[i];
        }
    }
    static Colour getColour(int index){
        Colour[] colours=Colour.values();
        return colours[index];
    }
}
