package override;

import java.util.Objects;

public class Smartphone implements Cloneable {

    String brandName;
    String modelName;
    int batteryMAh;
    SmartphonePrice producerPrice;
    SmartphonePrice retailPrice;


    @Override
    public String toString() {
        return  "Brand name: " + brandName +
                ". Model name: " + modelName +
                ". Battery: " + batteryMAh +
                ". Price: " + producerPrice +
                ". Retail: " + retailPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return  batteryMAh == that.batteryMAh &&
                brandName.equals(that.brandName) &&
                modelName.equals(that.modelName) &&
                producerPrice.equals(that.producerPrice) &&
                retailPrice.equals(that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batteryMAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone)super.clone();
        clonedSmartphone.producerPrice = producerPrice;
        clonedSmartphone.retailPrice = retailPrice;
        return clonedSmartphone;
    }

    public Smartphone(String brand, String model, int battery, SmartphonePrice prodP, SmartphonePrice retailP){
        this.brandName = brand;
        this.modelName = model;
        this.batteryMAh = battery;
        this.producerPrice = prodP;
        this.retailPrice = retailP;
    }
}

    /*define a Smartphone class that implements Cloneable and has:
        5 attributes:
        a string brandName
        a string modelName
        an int batteryMAh
        an attribute producerPrice of type SmartphonePrice
        an attribute retailPrice of type SmartphonePrice
        [using IntelliJ] an override of the toString() method in order to print all the attributes of a Smartphone object
        [using IntelliJ] an override of the equals() method that check all the 5 attributes to establish if two Smartphone objects are equal
        [using IntelliJ] an override of the hashCode(), using all the 5 attributes
        [using IntelliJ] an override of the clone() method (that will have to be public) where:
        a clonedSmartphone is generated using super.clone()
        there's an assignment to the clonedSmartphone.producerPrice
        there's an assignment to the clonedSmartphone.retailPrice
        the return value is a Smartphone object
        a constructor method that accepts 5 params (brand, model, battery, prodP, retailP) and assign the right values to the object
        define a SmartphonePrice class that implements Cloneable and has:
        2 attributes:
        a string priceType
        a double priceInEuros
        [using IntelliJ] an override of the clone() method (that will have to be public) where:
        a clonedSmartphonePrice is generated using super.clone()
        the return value is a SmartphonePrice object
        [using IntelliJ] an override of the toString() method for returning an informative String about the 2 SmartphonePrice attributes
        [using IntelliJ] an override of the equals() method that check the 2 attributes to establish if two SmartphonePrice objects are equal
        [using IntelliJ] an override of the hashCode(), using the 2 attributes
        a constructor method that accepts 2 params (type, price) and assign the right values to the object
        define a tester class with main() method where you:
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
