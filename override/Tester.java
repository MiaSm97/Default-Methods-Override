package override;

public class Tester {
    public static void main(String[] args) {

        SmartphonePrice producer = new SmartphonePrice("Discount",450);
        SmartphonePrice producer2 = new SmartphonePrice("Full Price", 900);
        SmartphonePrice retail = new SmartphonePrice("Discount", 150);
        SmartphonePrice retail2 = new SmartphonePrice("Full Price", 1450);

        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21", 3700, producer, retail);
        Smartphone smartphone2 = new Smartphone("IPhone", "14 Pro", 3700, producer2, retail2);

        System.out.println(smartphone);
        System.out.println(smartphone2);

        if(smartphone.equals(smartphone2)){
            System.out.println("The smartphones are equals");
        }else{
            System.out.println("The smartphones are not equals");
        }

        try {
            Smartphone clonedSmartphone = smartphone.clone();
            clonedSmartphone.brandName = "Samsung";
            System.out.println("Original smartphone: " + smartphone);
            System.out.println("Cloned smartphone: " + clonedSmartphone);
            System.out.println("-------------------------------------");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }

    }
}

    /*define a tester class with main() method where you:
        create 4 new SmartphonePrice objects: 2 for Producer and 2 for Retail
        create 2 new Smartphone objects, using the 4 newly created SmartphonePrice objects
        print in console all the details of the 2 newly created Smartphone objects
        check if the first smartphone is equal to the second smartphone, informing the user
        use a try{ ... } catch(Exception exception) { ... } to:
        get a new Smartphone object by cloning the second Smartphone
        print in console all the details of the newly cloned object
        check if the second smartphone is equal to the newly cloned object, informing the user
        inside the catch(Exception exception) { ... } scope:
        print the stack trace of the exception
        inform the user about the error*/
