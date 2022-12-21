package n1;

import java.util.Scanner;
import java.util.*;


class owner {
    String name = "Aniket";
    String loc = "thane";
    private int mobno;

    public int getMobno() {
        return mobno;
    }

    public void setMobno(int mob_no) {
        this.mobno = mob_no;
    }

}

public class Vehicle {
}

class Two_wheeler extends Vehicle {

    public void types() {

        System.out.println("1: BIKE");
        System.out.println("2: CYCLE");

    }
}

class Bike extends Two_wheeler {
    public void bikebrands() {
        System.out.println("Related Brands");
        System.out.println("|******|");
        System.out.println("1)--HONDA--");
        System.out.println("2)--BAJAJ--");
        System.out.println("3)--ROYAL_ENFILED--");
        System.out.println("4)--TVS--");
        System.out.println("5)--YAMAHA--");

    }

    public void honda() {
        // HONDA DETAILS
        System.out.println("HONDA 2wheeler INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("VECHILE_NAME: ACTIVA 6G");
        System.out.println("BRAND: HONDA");
        System.out.println("ENIGINE_TYPE :Fan Cooled, 4 Stroke, SI Engine ");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :BLACK");
        System.out.println("PRICE : 75,0000");

        System.out.println();

        System.out.println("VECHILE_NAME: Unicorn BS6");
        System.out.println("BRAND: HONDA");
        System.out.println("ENIGINE_TYPE :Single_cylinde");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :RED");
        System.out.println("PRICE : 1.20Lakh");

        System.out.println();

        System.out.println("VECHILE_NAME:CBHornet 160 R ");
        System.out.println("BRAND: HONDA");
        System.out.println("ENIGINE_TYPE :SI Engine");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :Light_Green");
        System.out.println("PRICE : 1.10Lakh");

        System.out.println();
        System.out.println("VECHILE_NAME:Black Honda SP 125");
        System.out.println("BRAND: HONDA");
        System.out.println("ENIGINE_TYPE : 125 cc Air Cooled BS VI");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :BLACK");
        System.out.println("PRICE : 78,663");

        System.out.println();

        System.out.println("VECHILE_NAME: Honda CB Unicorn 150 Bike");
        System.out.println("BRAND: HONDA");
        System.out.println("ENIGINE_TYPE :Fan Cooled, 4 Stroke, SI Engine ");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :Gray");
        System.out.println("PRICE : 85,238");
        System.out.println();

        System.out.println("VECHILE_NAME: Red Honda Shine Bike 125cc");
        System.out.println("BRAND: HONDA");
        System.out.println("ENIGINE_TYPE : 125CC ");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :Red:Gray");
        System.out.println("PRICE : 80,999");
    }

    // BAJJAJ DETAILS
    public void bajaj() {
        System.out.println("BAJAJ INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("VECHILE_NAME: Bajaj Pulsar NS200");
        System.out.println("BRAND: BAJAJ");
        System.out.println("ENIGINE_TYPE :4-stroke,SOHC 4-Valve");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :Greay,Red,blue and White");
        System.out.println("PRICE : 1.35Lakh");

        System.out.println();

        System.out.println("VECHILE_NAME: Red Bajaj Avenger Street 160cc");
        System.out.println("BRAND: BAJAJ");
        System.out.println("ENIGINE_TYPE : Single Cylinder,4 Stroke,SOHC, 2 Valve,Air Cooled,FI");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :RED");
        System.out.println("PRICE : 2Lakh");

        System.out.println();

        System.out.println("VECHILE_NAME: CBHornet 160 R ");
        System.out.println("BRAND: HONDA");
        System.out.println("ENIGINE_TYPE :SI Engine");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :Light_Green");
        System.out.println("PRICE : 1.10Lakh");

        System.out.println();
        System.out.println("VECHILE_NAME:Bajaj Dominar 400 Bike");
        System.out.println("BRAND: BAJAJ");
        System.out.println("ENIGINE_TYPE : DTSI");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :	PLUM");
        System.out.println("PRICE : 2.47LakH");

        System.out.println();

        System.out.println("VECHILE_NAME: Avenger");
        System.out.println("BRAND: BAJAJ");
        System.out.println("ENIGINE_TYPE : 4-stroke, single cylinder, DTS-i");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :Green");
        System.out.println("PRICE : 90,000");
        System.out.println();
    }

    // ROYAL_ENFIED
    public void royalenf() {
        System.out.println("ROYAL_ENFILED INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("VECHILE_NAME: ROYAL ENFIELD Classic 350 ");
        System.out.println("BRAND: ROYAL ENFIELD");
        System.out.println("ENIGINE_TYPE :350");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : Sand");
        System.out.println("PRICE : 1.65 Lakh");

        System.out.println();

        System.out.println("VECHILE_NAME: Black Royal Enfield Bullet");
        System.out.println("BRAND: Royal Enfield");
        System.out.println("ENIGINE_TYPE : 	Single Cylinder,4 Stroke,Oil Cooled");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :Black");
        System.out.println("PRICE : 2 Lakh");

        System.out.println();

        System.out.println("VECHILE_NAME: Continental GT 650 ");
        System.out.println("BRAND: ROYAL ENFIELD ");
        System.out.println("ENIGINE_TYPE :650 CC");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :Blue");
        System.out.println("PRICE : 2.99Lakh");

        System.out.println();
        System.out.println("VECHILE_NAME: Meteor ROYAL ENFIELD");
        System.out.println("BRAND: ROYAL ENFIELD");
        System.out.println("ENIGINE_TYPE : 349cc");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :	Black");
        System.out.println("PRICE : 2.24 Lakh");

        System.out.println();

    }

    public void tvs() {
        System.out.println("ROYAL_ENFILED INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("Black TVS Apache RTR 180 Bike");
        System.out.println("BRAND: TVS");
        System.out.println("ENIGINE_TYPE :177.4 cc");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : BLACK");
        System.out.println("PRICE : 98,000");

        System.out.println();

        System.out.println("VECHILE_NAME: Blue TVS Apache RTR 200 4v");
        System.out.println("BRAND: TVS");
        System.out.println("ENIGINE_TYPE : 197.75 cc");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :BLUE");
        System.out.println("PRICE :1.58 Lakh");

        System.out.println();

        System.out.println("VECHILE_NAME: Tvs Apache Rtr 160");
        System.out.println("BRAND: TVS");
        System.out.println("ENIGINE_TYPE :160");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :GRAY");
        System.out.println("PRICE : 1.01 Lakh");

        System.out.println();
        System.out.println("VECHILE_NAME:  Apache RR 310 Bike");
        System.out.println("BRAND:TVS");
        System.out.println("ENIGINE_TYPE : 349cc");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :	Black");
        System.out.println("PRICE : 2.40 Lakh");

        System.out.println();

    }

    public void Yamaha() {
        System.out.println("YAMAHA INFORMATION");
        System.out.println("-----------------------------");
        System.out.println("Black Yamaha FZ-FI");
        System.out.println("BRAND: Yamaha");
        System.out.println("ENIGINE_TYPE :149CC");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : BLACK & RED");
        System.out.println("PRICE : 1.35 Lakh");

        System.out.println();

        System.out.println("VECHILE_NAME: Yamaha FZS-FI VINTAGE Bike");
        System.out.println("BRAND: YAMAHA");
        System.out.println("ENIGINE_TYPE : Air cooled, 4-stroke, SOHC, 2-valve");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :	VINTAGE GREEN");
        System.out.println("PRICE :1.12 Lakh");

        System.out.println();

    }

}

class Cycle extends Two_wheeler {
    public void cycleBrand() {
        System.out.println("Related Brands");
        System.out.println("|******|");
        System.out.println("1)--HERCULES Cycles--");
        System.out.println("2)--HERO Cycles--");
        System.out.println("3)--ATLAS Cycles--");
    }

    public void hercules() {
        System.out.println("HERCULES INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("CYCLE_NAME:Roadeo STR1 29T Green");
        System.out.println("BRAND : HERCULES ");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : Green");
        System.out.println("PRICE : 14,995");
        System.out.println();

        System.out.println("CYCLE_NAME:Storm NV 26 T Road Cycle");
        System.out.println("BRAND : HERCULES ");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : RED");
        System.out.println("PRICE : 7,000");
        System.out.println();

        System.out.println("CYCLE_NAME:HERCULES TOP GEAR-A29 XR1 29 T Mountain Cycle");
        System.out.println("BRAND : HERCULES ");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : YELLOW");
        System.out.println("PRICE : 22,500");
        System.out.println();
    }

    public void hero() {
        System.out.println("HERO INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("CYCLE_NAME:Skyper 26T 26 T Mountain/Hardtail Cycle ");
        System.out.println("BRAND : HERO ");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : Green");
        System.out.println("PRICE : 6,399");

        System.out.println();

        System.out.println("CYCLE_NAME:HERO Razor Back 26");
        System.out.println("BRAND : HERO ");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : YELLO");
        System.out.println("PRICE : 4,000");
        System.out.println();

        System.out.println("CYCLE_NAME:HERO Turk 20T ");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : BLAK");
        System.out.println("PRICE : 5000");
        System.out.println();
    }

    public void atlas() {
        System.out.println("ATLAS INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("CYCLE_NAME:ATLAS Turbine Bike ");
        System.out.println("BRAND : ATLAS ");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : BLUE");
        System.out.println("PRICE : 26,999");

        System.out.println();

        System.out.println("CYCLE_NAME:ATLAS P100 Bike ");
        System.out.println("BRAND : ATLAS ");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : YELLO");
        System.out.println("PRICE : 14,999");
        System.out.println();

        System.out.println("CYCLE_NAME:ATLAS Honor Front Suspension Disc Brake ");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : BLAK & RED");
        System.out.println("PRICE : 9,000");
        System.out.println();
    }

}

// THREE_WHHELAR
class Threewheelar extends Vehicle {
    public void rikshaBrand() {
        System.out.println("Related Brands");
        System.out.println("|******|");
        System.out.println("1)--MAHINDRA --");
        System.out.println("2)--PIAGGIO--");
        System.out.println("3)--TVS AUTO--");
    }

    public void fueltype() {
        System.out.println("1)CNG");
        System.out.println("2)ELECTRIC");
        System.out.println("3)DIESEL");
        System.out.println("4)PETROL");
        System.out.println("5)All");
    }

    // MAHINDRA INFORMATION
    public void mahindraCNG() {

        System.out.println("PIAGGIO 3wheeler INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("VECHILE_NAME: Piaggio Ape Xtra LDX 3 Wheeler");
        System.out.println("BRAND: MAHINDRA");
        System.out.println("ENIGINE_TYPE :");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :YELLOW");
        System.out.println("PRICE : 2.55 Lakh");
        System.out.println("FUEL : CNG");
        System.out.println();

        System.out.println("VECHILE_NAME: Piaggio Ape Auto HT DX Auto Rickshaw");
        System.out.println("BRAND: Piaggio");
        System.out.println("ENIGINE_TYPE :300 CC");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("PRICE :2.56 - 2.60 Lakh");
        System.out.println("FUEL : CNG");
    }

    public void mahindraElec() {
        System.out.println("PIAGGIO 3wheeler INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("VECHILE_NAME: Mahindra Treo Zor 3 Wheeler");
        System.out.println("BRAND: MAHINDRA");
        System.out.println("ENIGINE_TYPE :Electric Motor");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :RED");
        System.out.println("PRICE : 3.77 - 4.12 Lakh");
        System.out.println("FUEL : Electric");

        System.out.println();
        System.out.println("VECHILE_NAME: Piaggio Ape Xtra LDX Plus 3 Wheeler");
        System.out.println("BRAND: PIAGGIO");
        System.out.println("ENIGINE_TYPE :Electric Motor");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :RED");
        System.out.println("PRICE : 1.97 - 2.00 Lakh");
        System.out.println("Fuel - DieseL");

        System.out.println();
        System.out.println("VECHILE_NAME: Piaggio Ape E Xtra 3 Wheeler ");
        System.out.println("BRAND: PIAGGIO");
        System.out.println("ENIGINE_TYPE :Electric Motor");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :RED");
        System.out.println("PRICE :  3.12 - 3.20 Lakh");
        System.out.println("Fuel - ElECTRIC");

    }

    public void mahindraDIESEL() {
        System.out.println();
        System.out.println("VECHILE_NAME: Mahindra Alfa Load 3 Wheeler");
        System.out.println("BRAND: MAHINDRA");
        System.out.println("ENIGINE_TYPE :E-DI G599 WD");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :Yellow");
        System.out.println("PRICE : 2.39 - 2.65 Lakh");
        System.out.println("Fuel - DieseL");

        System.out.println();

        System.out.println("VECHILE_NAME: Ape City Plus Auto Rickshaw");
        System.out.println("BRAND: MAHINDRA");
        System.out.println("ENIGINE_TYPE :Water cooled engine");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :RED");
        System.out.println("PRICE : 2.06 - 2.26 Lakh");
        System.out.println("Fuel - DieseL");
    }

    // piaggio
    public void PiaggioCNG() {

        System.out.println("PIAGGIO 3wheeler INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("VECHILE_NAME: Piaggio Ape Xtra LDX 3 Wheeler");
        System.out.println("BRAND: Piaggio");
        System.out.println("ENIGINE_TYPE :");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :YELLOW");
        System.out.println("PRICE : 2.55 Lakh");
        System.out.println("FUEL : CNG");
        System.out.println();

        System.out.println("VECHILE_NAME: Piaggio Ape Auto HT DX Auto Rickshaw");
        System.out.println("BRAND: Piaggio");
        System.out.println("ENIGINE_TYPE :300 CC");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("PRICE :2.56 - 2.60 Lakh");
        System.out.println("FUEL : CNG");
    }

    public void PiaggioElec() {
        System.out.println("PIAGGIO 3wheeler INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("VECHILE_NAME: Piaggio Ape E City/ Fixed Battery Auto Rickshaw");
        System.out.println("BRAND: PIAGGIO");
        System.out.println("ENIGINE_TYPE :Electric Motor");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :RED");
        System.out.println("PRICE : 1.97 - 3.00 Lakh");
        System.out.println("Fuel - ELECTRIC");

        System.out.println();
        System.out.println("VECHILE_NAME: Piaggio Ape Xtra LDX Plus 3 Wheeler");
        System.out.println("BRAND: PIAGGIO");
        System.out.println("ENIGINE_TYPE :Electric Motor");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :RED");
        System.out.println("PRICE : 1.97 - 2.00 Lakh");
        System.out.println("Fuel - ELECTRIC");

        System.out.println();
        System.out.println("VECHILE_NAME: Piaggio Ape E Xtra 3 Wheeler ");
        System.out.println("BRAND: PIAGGIO");
        System.out.println("ENIGINE_TYPE :Electric Motor");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :RED");
        System.out.println("PRICE :  3.12 - 3.20 Lakh");
        System.out.println("Fuel - ElECTRIC");

    }

    public void PiaggioPETROL() {
        System.out.println("PIAGGIO 3wheeler INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("VECHILE_NAME: Piaggio Ape Xtra HT 3 Wheeler");
        System.out.println("BRAND: PIAGGIO");
        System.out.println("ENIGINE_TYPE :Liquid Cooled,4-Stroke,2 Valve,Otto cycle");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :YELLO");
        System.out.println("PRICE :2.21 - 2.25 Lakh");
        System.out.println("Fuel - PETROL");
        System.out.println();
    }

    public void PiaggioDIESEL() {
        System.out.println();
        System.out.println("VECHILE_NAME: Piaggio Ape Xtra LDX Plus 3 Wheeler");
        System.out.println("BRAND: PIAGGIO");
        System.out.println("ENIGINE_TYPE :Electric Motor");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :RED");
        System.out.println("PRICE : 1.97 - 2.00 Lakh");
        System.out.println("Fuel - DieseL");

        System.out.println();

        System.out.println("VECHILE_NAME: Ape City Plus Auto Rickshaw");
        System.out.println("BRAND: PIAGGIO");
        System.out.println("ENIGINE_TYPE :Water cooled engine");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :RED");
        System.out.println("PRICE : 2.06 - 2.26 Lakh");
        System.out.println("Fuel - DieseL");
        System.out.println();
    }

    // tvs
    public void tvsCNG() {

        System.out.println("TVS 3wheeler INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("VECHILE_NAME: TVS King Kargo - High Deck");
        System.out.println("BRAND: TVS");
        System.out.println("ENIGINE_TYPE :4 Stroke, Single Cylinder Air Cooled, Si-Engine");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :YELLOW");
        System.out.println("PRICE :  1.60 - 2.00 Lakh");
        System.out.println("FUEL : CNG");
        System.out.println();

        System.out.println("VECHILE_NAME: TVS Deluxe Auto Rickshaw");
        System.out.println("BRAND: Piaggio");
        System.out.println("ENIGINE_TYPE :300 CC");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :GREEN");
        System.out.println("PRICE :2.56 - 2.60 Lakh");
        System.out.println("FUEL : CNG");
        System.out.println();

    }

    public void tvsPETROL() {

        System.out.println("VECHILE_NAME: TVS King Duramax Auto Rickshaw");
        System.out.println("BRAND: tvs");
        System.out.println("ENIGINE_TYPE :4 Stroke,Single Cylinder Liquid Cooled,Si-engine");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : yellow ");
        System.out.println("PRICE :1.80 - 2.25 Lakh");
        System.out.println("Fuel - PETROL");
    }

}

class Fourwheelar extends Vehicle {

    public void CarBrand() {
        System.out.println("1)--TATA --");
        System.out.println("2)--AUDI--");
        System.out.println("3)--HYUNDAI--");
        System.out.println("4)--TOYOTA--");
        System.out.println("5)--BMW --");

    }

    public void carfuel() {

    }

    public void tata() {
        System.out.println("TATA 4wheeler INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("CAR_NAME: Tata Tigor EV");
        System.out.println("BRAND: TATA");
        System.out.println("fUEL_TYPE:Electric(Battery)");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :BULE");
        System.out.println("PRICE :13.64 Lakh");

        System.out.println();

        System.out.println("CAR_NAME: Tata Nexon");
        System.out.println("BRAND: TATA");
        System.out.println("fUEL_TYPE: Diesel");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :BLACK");
        System.out.println("PRICE :7.64 Lakh");
        System.out.println();

        System.out.println("CAR_NAME: Tata Tiago");
        System.out.println("BRAND: TATA");
        System.out.println("fUEL_TYPE:CNG");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :GREEN & BULE");
        System.out.println("PRICE : 7.79 Lakh");
        System.out.println();

        System.out.println("CAR_NAME: Tata Altroz");
        System.out.println("BRAND: TATA");
        System.out.println("fUEL_TYPE: Petrol & Diesel");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :GREEN & BULE");
        System.out.println("PRICE : 10.14 Lakh");
        System.out.println();

    }

    public void audi() {
        System.out.println("AUDI 4wheeler INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("CAR_NAME: Audi A6");
        System.out.println("BRAND: AUDI");
        System.out.println("fUEL_TYPE: Petrol");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :LIGHTBULE");
        System.out.println("PRICE : 59.99 Lakh");

        System.out.println();

        System.out.println("CAR_NAME: Audi S5 Sportback");
        System.out.println("BRAND: AUDI");
        System.out.println("fUEL_TYPE: Petrol");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :GREEN");
        System.out.println("PRICE :84.23 Lakh");
        System.out.println();

        System.out.println("CAR_NAME: Audi e-tron GT");
        System.out.println("BRAND: AUDI");
        System.out.println("fUEL_TYPE:Electric");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : GRAY");
        System.out.println("PRICE : 1.65 Crore");
        System.out.println();
    }

    public void hyundai() {
        System.out.println("HYUNDAI 4wheeler INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("CAR_NAME: Hyundai Venue");
        System.out.println("BRAND: HYUNDAI");
        System.out.println("fUEL_TYPE: Petrol & Diesel");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : RED");
        System.out.println("PRICE : 12.72 Lakh");

        System.out.println();

        System.out.println("CAR_NAME: Hyundai Creta");
        System.out.println("BRAND: HYUNDAI");
        System.out.println("fUEL_TYPE: Petrol & Diesel");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :BULE");
        System.out.println("PRICE :18.18 Lakh");
        System.out.println();

        System.out.println("CAR_NAME: Hyundai Verna");
        System.out.println("BRAND: HYUNDAI");
        System.out.println("fUEL_TYPE: Petrol & Diesel");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : BLACK");
        System.out.println("PRICE : 9.40 Lakh");
        System.out.println();
    }

    public void toyota() {
        System.out.println("TOYOTA 4wheeler INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("CAR_NAME: Toyota Fortuner");
        System.out.println("BRAND: TOYOTA");
        System.out.println("fUEL_TYPE: Petrol");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : BLACK");
        System.out.println("PRICE : 48.43 Lakh");

        System.out.println();

        System.out.println("CAR_NAME: Toyota Innova Crysta");
        System.out.println("BRAND: TOYOTA");
        System.out.println("fUEL_TYPE: Petrol & Diesel");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :WHITE");
        System.out.println("PRICE :25.68 Lakh ");
        System.out.println();

        System.out.println("CAR_NAME: Toyota Vellfire");
        System.out.println("BRAND: TOYOTA");
        System.out.println("fUEL_TYPE: Petrol");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : WHITE");
        System.out.println("PRICE : 90.80 Lakh");
        System.out.println();

        System.out.println("CAR_NAME: Toyota Urban Cruiser");
        System.out.println("BRAND: TOYOTA");
        System.out.println("fUEL_TYPE: Petrol");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : WHITE");
        System.out.println("PRICE : 11.80 Lakh");
        System.out.println();
    }

    public void bmw() {
        System.out.println("BMW 4wheeler INFROMATION");
        System.out.println("-----------------------------");
        System.out.println("CAR_NAME:BMW X5");
        System.out.println("BRAND: BMW");
        System.out.println("fUEL_TYPE: Petrol");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : BULE");
        System.out.println("PRICE : 84.90 Lakh");

        System.out.println();

        System.out.println("CAR_NAME: BMW Z4");
        System.out.println("BRAND: BMW");
        System.out.println("fUEL_TYPE: Petrol & Diesel");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR :WHITE");
        System.out.println("PRICE :25.68 Lakh ");
        System.out.println();

        System.out.println("CAR_NAME: BMW X3");
        System.out.println("BRAND: BMW");
        System.out.println("fUEL_TYPE: Petrol");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : WHITE");
        System.out.println("PRICE : 1 Crore");
        System.out.println();

        System.out.println("CAR_NAME: BMW 7 Series");
        System.out.println("BRAND: BMW");
        System.out.println("fUEL_TYPE: Petrol");
        System.out.println("Country_of_origin: INDIA");
        System.out.println("COLOR : WHITE");
        System.out.println("PRICE :  1.75 Crore");
        System.out.println();
    }

}

 class Show1 {
     public static void main(String[] args) {
         // OBJECT CREATION
         owner o = new owner();
         Bike b = new Bike();
         Cycle c = new Cycle();
         Two_wheeler T = new Two_wheeler();
         Threewheelar ref = new Threewheelar();
         Fourwheelar f = new Fourwheelar();

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number :1)sigup//2)Login");
         int m1 = sc.nextInt();

         while (true) {
             switch (m1) {

                 case 1:

                     System.out.println("sig-up");
                     System.out.print("CREATE USER_NAME : ");
                     String name = sc.next();

                     System.out.print("CREATE PASSWORD : ");
                     int pass = sc.nextInt();

                     System.out.print("CONFROM PASSWORD : ");
                     int conf = sc.nextInt();

                     if (pass == conf) {
                         System.out.println("-------------------------------");
                         System.out.println("Regestration succefully!!..");
                         System.out.println("------------------------------");
                     } else if (pass != conf) {
                         System.out.println("ENTER VALID PASSWORD!..");

                         System.out.print("CONFROM PASSWORD : ");
                         conf = sc.nextInt();
                     }

                     System.out.println("PLEASE LOGIN");
                     System.out.print("user_name :");
                     String nn = sc.next();
                     System.out.print("Enter password :");
                     int i = sc.nextInt();
                     if ((nn.equals(name) && (i == pass))) {
                         System.out.println("Login succefully!....");
                         System.out.println("-------------------------");
                     } else {
                         System.out.println("please Enter valid Username or password ");
                         System.out.println("-----------------------------------------------");
                     }
                 default:

             }


             System.out.println("Enter 1 FOR TWO WHEELER");
             System.out.println("Enter 2 FOR THREE WHEELER ");
             System.out.println("Enter 3 FOR FOUR WHEELER");
             System.out.println("Enter 4 FOR SIX WHEELER");
             System.out.println("X---X---X---X---X---X---X---X---X---X---X");


             System.out.print("Enter the number: ");
             // 1st


             int num = sc.nextInt();

             while (true) {

                 if (num == 1) {
                     boolean nish1 = true;
                     while (nish1) {

                         switch (num) {
                             case 1:

                                 System.out.println("* YOU SELECT TWO_WHEELER *..");
                                 System.out.println();
                                 switch (num) {
                                     case 1:
                                         System.out.println("--Related Category--");
                                         System.out.println("*PLEASE SELECT THE category*");
                                         b.types();


                                         System.out.println("Enter 1 for Bike");
                                         System.out.println("Enter 2 for Cycle");

                                         int m = sc.nextInt();

                                         if (m == 1) {
                                             b.bikebrands();
                                         } else if (m == 2) {
                                             c.cycleBrand();
                                         } else {
                                             System.out.println("invalid choice");
                                         }
                                         if (m == 1) {
                                             while (true) {
                                                 System.out.print("SELECT THE BRAND :");
                                                 int n1 = sc.nextInt();
                                                 switch (n1) {
                                                     case 1:
                                                         b.honda();
                                                         break;
                                                     case 2:
                                                         b.bajaj();
                                                         break;
                                                     case 3:
                                                         b.royalenf();
                                                         break;
                                                     case 4:
                                                         b.tvs();
                                                         break;
                                                     case 5:
                                                         b.Yamaha();
                                                         break;
                                                     default:
                                                         System.out.println("please select valid brand!..");
                                                         break;
                                                 }

                                             }


                                         } else {


                                             switch (num) {
                                                 case 1:
                                                     c.hercules();
                                                     break;
                                                 case 2:
                                                     c.hero();
                                                     break;
                                                 case 3:
                                                     c.atlas();
                                                     break;

                                                 default:
                                                     System.out.println("invalid brand");
                                                     break;

                                             }
                                         }
                                                 switch (num) {

                                                     case 1:
                                                         ref.PiaggioDIESEL();
                                                         break;
                                                     case 2:
                                                         ref.mahindraCNG();
                                                         break;
                                                     case 3:
                                                         ref.mahindraElec();
                                                         break;
                                                 }
                                                 break;
                                         case 2:
                                                     System.out.println("---------------------------------------");
                                                     System.out.println("selected  Three_wheeler!!..");
                                                     System.out.println();
                                                     ref.rikshaBrand();
                                                     System.out.print("SELECT YOUR BRAND :");
                                                     int n = sc.nextInt();
                                                     if (n <= 3) {
                                                         System.out.println("-------------------");
                                                         System.out.println("--SELECT FUEL TYPE--");
                                                         ref.fueltype();
                                                     } else {
                                                         System.out.println("please select valid brand");
                                                         System.out.print("SELECT YOUR BRAND :");
                                                         n = sc.nextInt();
                                                     }

                                                     switch (n) {
                                                         case 1:
                                                             System.out.println("* MAHINDRA_AUTO *");
                                                             System.out.println("-----------");
                                                             System.out.print("ENTER THE NUMBER :");
                                                             int n1 = sc.nextInt();
                                                             // mahindra condition
                                                             if (n1 == 1) {
                                                                 ref.mahindraCNG();
                                                             } else if (n1 == 2) {
                                                                 ref.mahindraElec();
                                                             } else if (n1 == 3) {
                                                                 ref.mahindraDIESEL();
                                                             } else if (n1 == 5) {
                                                                 ref.mahindraCNG();
                                                                 ref.mahindraElec();
                                                                 ref.mahindraDIESEL();
                                                             } else {
                                                                 System.out.println("NO FOUND");
                                                             }
                                                             break;

                                                         case 2:
                                                             System.out.println("PIAGGIO_AUTO......!");
                                                             System.out.println("-------------------");
                                                             System.out.print("ENTER THE NUMBER :");
                                                             int n2 = sc.nextInt();

                                                             if (n2 == 1) {
                                                                 ref.PiaggioCNG();
                                                             } else if (n2 == 2) {
                                                                 ref.PiaggioElec();
                                                             } else if (n2 == 3) {
                                                                 ref.PiaggioDIESEL();
                                                             } else if (n2 == 4) {
                                                                 ref.PiaggioPETROL();
                                                             } else {
                                                                 System.out.println("invalid");
                                                             }
                                                             break;
                                                         case 3:
                                                             System.out.println("congrates!..you select TVS_AUTO");
                                                             System.out.println("-------------------");
                                                             System.out.print("ENTER THE NUMBER :");
                                                             int n3 = sc.nextInt();

                                                             if (n3 == 1) {
                                                                 ref.tvsCNG();
                                                             } else if (n3 == 4) {
                                                                 ref.tvsPETROL();
                                                             } else {
                                                                 System.out.println("NO FOUND");
                                                             }
                                                             break;

                                                         default:
                                                             System.out.print("ENTER THE NUMBER :");
                                                             n3 = sc.nextInt();

                                                     }
                                                     break;
                                                 case 3:
                                                     System.out.println("You selected Fourwheeler!...");
                                                     System.out.println();
                                                     System.out.println("*Top10 Brands*");
                                                     f.CarBrand();

                                                     System.out.print("please select your brand :");
                                                     int n5 = sc.nextInt();
                                                     if (n5 == 1) {
                                                         f.tata();
                                                     } else if (n5 == 2) {
                                                         f.audi();
                                                     } else if (n5 == 3) {
                                                         f.hyundai();
                                                     } else if (n5 == 4) {
                                                         f.toyota();
                                                     } else if (n5 == 5) {
                                                         f.bmw();
                                                     } else {
                                                         System.out.println("Result not found...");
                                                         break;
                                                     }


                                             }


                                 }
                         }


                     }


                 }
             }


         }
     }
