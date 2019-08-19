package com.shevlik.Topic9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NewCarList newCarList=new NewCarList();
        for(int i=0;i<30;i++){
            newCarList.addToCarList(CarNew.getCarNew());
        }
        OldCarList oldCarList=new OldCarList();
        for(int i=0;i<20;i++){
            oldCarList.addToCarList(CarOld.getCarOld());
        }

        Scanner in=new Scanner(System.in);
        Menu menu=new Menu("1.Viewing.","2.Add a car.","3.Delete a car.");
        int numberOfMenu=-1;
        do {
            menu.showMenu();
            numberOfMenu = menu.chooseMenuItem();
            switch (numberOfMenu) {
                case 0:
                    break;
                case 1:
                    Menu menu2=new Menu("1.To see all cars.","2.To see new cars.",
                            "3.To see old cars.", "4.To look for a new car.", "5.To look for an old car.");
                    int numberOfMenu2=-1;
                    do {
                        menu2.showMenu();
                        numberOfMenu2 = menu2.chooseMenuItem();
                        switch (numberOfMenu2) {
                            case 0:
                                break;
                            case 1:
                                newCarList.showCarList();
                                oldCarList.showCarList();
                                break;
                            case 2:
                                newCarList.showCarList();
                                break;
                            case 3:
                                oldCarList.showCarList();
                                break;
                            case 4:
                                Menu menu3=new Menu("1.By id.","2.By brand.",
                                        "3.By engine.", "4.By transmission.");
                                int numberOfMenu3=-1;
                                do {
                                    menu3.showMenu();
                                    numberOfMenu3 = menu3.chooseMenuItem();
                                    switch (numberOfMenu3) {
                                        case 0:
                                            break;
                                        case 1:
                                            System.out.println("Input id: ");
                                            int id=in.nextInt();
                                            try{
                                                newCarList.showCarById(id);
                                            }catch (CarException e){
                                                System.out.println("Exception "+e);
                                            }

                                            break;
                                        case 2:
                                            System.out.println("Input brand: ");
                                            String brand=in.nextLine();
                                            newCarList.showCarByBrand(brand);
                                            System.out.println("count= "+newCarList.toCount(brand,p->p.getBrand().getName().equalsIgnoreCase(brand)));
                                            break;
                                        case 3:
                                            System.out.println("Input engine type: ");
                                            String engine=in.nextLine();
                                            newCarList.showCarByEngine(engine);
                                            System.out.println("count= "+newCarList.toCount(engine,p->p.getEngine().getName().equalsIgnoreCase(engine)));
                                            break;
                                        case 4:
                                            System.out.println("Input transmission: ");
                                            String transmission=in.nextLine();
                                            newCarList.showCarByTransmission(transmission);
                                            System.out.println("count= "+newCarList.toCount(transmission,p->p.getTransmission().getName().equalsIgnoreCase(transmission)));
                                            break;
                                    }
                                }while (numberOfMenu3!=0);
                                break;
                            case 5:
                                Menu menu4=new Menu("1.By id.","2.By brand.",
                                        "3.By engine.", "4.By transmission.");
                                int numberOfMenu4=-1;
                                do {
                                    menu4.showMenu();
                                    numberOfMenu4 = menu4.chooseMenuItem();
                                    switch (numberOfMenu4) {
                                        case 0:
                                            break;
                                        case 1:
                                            System.out.println("Input id: ");
                                            int id=in.nextInt();
                                            try{
                                                oldCarList.showCarById(id);
                                            }catch (CarException e){
                                                System.out.println("Exception: "+e);
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Input brand: ");
                                            String brand=in.nextLine();
                                            oldCarList.showCarByBrand(brand);
                                            System.out.println("count= "+oldCarList.toCount(brand,p->p.getBrand().getName().equalsIgnoreCase(brand)));
                                            break;
                                        case 3:
                                            System.out.println("Input engine type: ");
                                            String engine=in.nextLine();
                                            oldCarList.showCarByEngine(engine);
                                            System.out.println("count= "+oldCarList.toCount(engine,p->p.getEngine().getName().equalsIgnoreCase(engine)));
                                            break;
                                        case 4:
                                            System.out.println("Input transmission: ");
                                            String transmission=in.nextLine();
                                            oldCarList.showCarByTransmission(transmission);
                                            System.out.println("count= "+oldCarList.toCount(transmission,p->p.getTransmission().getName().equalsIgnoreCase(transmission)));
                                            break;
                                    }
                                }while (numberOfMenu4!=0);
                                break;
                        }
                    }while (numberOfMenu2!=0);
                    break;
                case 2:
                    Menu menu5=new Menu("1.Add new car.","2.Add old car.");
                    int numberOfMenu5=-1;
                    do {
                        menu5.showMenu();
                        numberOfMenu5 = menu5.chooseMenuItem();
                        switch (numberOfMenu5) {
                            case 0:
                                break;
                            case 1:
                                newCarList.addToCarList();
                                break;
                            case 2:
                                oldCarList.addToCarList();
                                break;
                        }
                    }while (numberOfMenu5!=0);
                    break;
                case 3:
                    Menu menu6=new Menu("1.Delete new car.","2.Delete old car.");
                    int numberOfMenu6=-1;
                    do {
                        menu6.showMenu();
                        numberOfMenu6 = menu6.chooseMenuItem();
                        switch (numberOfMenu6) {
                            case 0:
                                break;
                            case 1:
                                System.out.println("Input id: ");
                                int idN=in.nextInt();
                                newCarList.deleteCarById(idN);
                                break;
                            case 2:
                                System.out.println("Input id: ");
                                int idO=in.nextInt();
                                oldCarList.deleteCarById(idO);
                                break;
                        }
                    }while (numberOfMenu6!=0);
                    break;
            }
        }while (numberOfMenu!=0);
        in.close();
    }
}
